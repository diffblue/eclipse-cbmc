/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.internal.cbmc.launcher;

import java.io.File;
import java.util.*;
import java.util.List;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.cbmc.util.CBMCCliHelper.CheckAllPropertiesOption;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.dialogs.*;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.osgi.framework.Version;

public class MainLaunchingTab extends AbstractLaunchConfigurationTab {

	private static final String CBMC_GOTO_INSTRUMENT = "goto-instrument"; //$NON-NLS-1$
	private static final String CBMC_ARG_VERSION = "--version"; //$NON-NLS-1$
	private static final String CBMC_ARG_TEST_PREPROCESSOR = "--test-preprocessor"; //$NON-NLS-1$
	private static final String MINIMAL_VERSION_NUMBER = "4.9"; //$NON-NLS-1$

	final String NO_VALUE = ""; //$NON-NLS-1$
	final String NEW_LINE = "\n"; //$NON-NLS-1$
	private List<Button> optionButtons;
	private Text executableText;
	private Button executableButton;
	private Text resourcesText;
	private Text functionText;
	private Button autorunBtn;
	private Button showLoopsBtn;
	private Text unwindText;

	private int resourceToCheckType;

	@Override
	public boolean canSave() {
		return checkCBMC() && checkResources() && checkUnwind();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setMessage(null);
		setErrorMessage(null);
		return checkCBMC() && checkResources() && checkUnwind();
	}

	private boolean checkCBMC() {
		String executable = executableText.getText().trim();
		return checkTextNotEmpty(executable, Messages.MainLaunchingTab_error_cbmc_isEmpty) && checkFileExists(executable, Messages.MainLaunchingTab_error_cbmc_notExist) && checkCBMCVersion(executable) && checkCompiler(executable);
	}

	private boolean checkResources() {
		String resources = resourcesText.getText().trim();
		if (!checkTextNotEmpty(resources, Messages.MainLaunchingTab_error_file_isEmpty))
			return false;
		String[] resourcesSplitter = resources.split(NEW_LINE);
		for (int i = 0; i < resourcesSplitter.length; i++) {
			String resource = resourcesSplitter[i];
			if (!checkFileExists(resource, Messages.format(Messages.MainLaunchingTab_error_file_notExists, new String[] {resource})))
				return false;
		}
		if (resourceToCheckType == CBMCCliHelper.LC_BINARY_TO_CHECK) {
			if (!checkBinary(resources))
				return false;
		}
		return true;
	}

	private boolean checkBinary(String resource) {
		String cbmcCommand = executableText.getText().trim();
		String gotoCommand = cbmcCommand.substring(0, cbmcCommand.lastIndexOf("/") + 1) + CBMC_GOTO_INSTRUMENT; //$NON-NLS-1$
		return isValidGotoCommand(gotoCommand) && isValidGotoFile(gotoCommand, resource);
	}

	private boolean checkTextNotEmpty(String str, String errorMessage) {
		int len = str.length();
		if (len == 0) {
			setErrorMessage(errorMessage);
			return false;
		}
		return true;
	}

	private boolean checkFileExists(String str, String errorMessage) {
		File f = new File(str);
		if (!f.exists()) {
			setErrorMessage(errorMessage);
			return false;
		}
		return true;
	}

	private boolean checkCompiler(String executable) {
		Object[] result = ProcessHelper.executeCommandWithSuccessFlagAndOutput(executable, CBMC_ARG_TEST_PREPROCESSOR);
		if (!(boolean) result[0]) {
			setErrorMessage(Messages.format(Messages.MainLaunchingTab_error_cbmc_compilerNotFound, new String[] {(String) result[1]}));
			return false;
		}
		return true;
	}

	private boolean checkCBMCVersion(String executable) {
		String currentVersionNumber = ProcessHelper.executeCommandWithOutput(executable, CBMC_ARG_VERSION);
		if (currentVersionNumber == null) {
			setErrorMessage(Messages.MainLaunchingTab_error_cbmc_versionNotFound);
			return false;
		}
		Version currentVersion = new Version(currentVersionNumber);
		Version minimumVersion = new Version(MINIMAL_VERSION_NUMBER);
		if (currentVersion.compareTo(minimumVersion) < 0) {
			setErrorMessage(Messages.format(Messages.MainLaunchingTab_error_cbmc_isOldVersion, new String[] {MINIMAL_VERSION_NUMBER, currentVersionNumber}));
			return false;
		}
		return true;
	}

	private boolean isValidGotoCommand(String gotoCommand) {
		return checkFileExists(gotoCommand, Messages.format(Messages.MainLaunchingTab_error_file_gotoNotFound, new String[] {gotoCommand}));
	}

	private boolean isValidGotoFile(String gotoCommand, String file) {
		boolean success = ProcessHelper.executeCommand(gotoCommand, file);
		if (!success) {
			setErrorMessage(Messages.MainLaunchingTab_error_file_isNotSourceOrBinary);
			return false;
		}
		return true;
	}

	private boolean checkUnwind() {
		String unwind = unwindText.getText().trim();
		try {
			if (unwind.isEmpty() || Integer.parseInt(unwind) >= 0) {
				return true;
			}
		} catch (NumberFormatException e) {
			// nothing to do
		}
		setErrorMessage(Messages.MainLaunchingTab_error_unwind);
		return false;
	}

	ModifyListener modifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
		}
	};

	SelectionListener listener = new SelectionAdapter() {
		public void widgetSelected(SelectionEvent e) {
			scheduleUpdateJob();
		}
	};

	private void handleCBMCExecutableButtonSelected() {
		FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
		dialog.setText(Messages.MainLaunchingTab_dialogCbmc);
		dialog.setFilterNames(new String[] {"cbmc*"}); //$NON-NLS-1$
		String file = dialog.open();
		if (file != null) {
			executableText.setText(file);
		}
	}

	void handleProjectsButtonSelected() {
		ListSelectionDialog dialog = new ListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), new BaseWorkbenchContentProvider(), new WorkbenchLabelProvider(), "Select the Project:");
		dialog.setTitle(Messages.MainLaunchingTab_dialogProjectsTitle);
		dialog.setMessage(Messages.MainLaunchingTab_dialogProjectsMessage);
		if (dialog.open() == Window.OK) {
			resourcesText.setText(serializeResources(dialog.getResult(), IResource.PROJECT));
			resourceToCheckType = CBMCCliHelper.LC_PROJECTS_TO_CHECK;
		}
	}

	void handleSourcesButtonSelected() {
		CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
		dialog.setContainerMode(true);
		dialog.setTitle(Messages.MainLaunchingTab_dialogSourcesTitle);
		dialog.setMessage(Messages.MainLaunchingTab_dialogSourcesMessage);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

		ViewerFilter filter = new ViewerFilter() {
			private CoreModel coreModel = CoreModel.getDefault();

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element != null && coreModel.create((IResource) element) != null);
			}
		};
		dialog.addFilter(filter);
		if (dialog.open() == Window.OK) {
			resourcesText.setText(serializeResources(dialog.getResult(), IResource.FILE));
			resourceToCheckType = CBMCCliHelper.LC_SOURCES_TO_CHECK;
		}
	}

	void handleBinaryButtonSelected() {
		ResourceListSelectionDialog dialog;
		dialog = new ForceHiddenResourceResourceListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		dialog.setTitle(Messages.MainLaunchingTab_dialogBinaryTitle);
		dialog.setMessage(Messages.MainLaunchingTab_dialogBinaryMessage);
		if (dialog.open() == Window.OK) {
			resourcesText.setText(serializeResources(dialog.getResult(), IResource.FILE));
			resourceToCheckType = CBMCCliHelper.LC_BINARY_TO_CHECK;
		}

	}

	//We have to create this class just so we can force the dialog to show the derived resources up front
	//The setAllowUserToToggleDerived just allows one to have a check box at the bottom of the dialog but not to control the initial state of this box
	static class ForceHiddenResourceResourceListSelectionDialog extends ResourceListSelectionDialog {
		public ForceHiddenResourceResourceListSelectionDialog(Shell parentShell, IContainer container, int typeMask) {
			super(parentShell, container, typeMask);
			setShowDerived(true);
		}
	}

	@Override
	public void createControl(Composite parent) {
		updateLaunchConfigurationDialog();
		Font font = parent.getFont();
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 7;
		topLayout.horizontalSpacing = 7;
		topLayout.numColumns = 3;
		comp.setLayout(topLayout);
		comp.setFont(font);

		createVerticalSpacer(comp, 3);

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelCBMC);
		executableText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		executableText.setLayoutData(gridData);
		executableText.addModifyListener(modifyListener);
		executableButton = createPushButton(comp, Messages.MainLaunchingTab_labelBrowse, null);
		executableButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleCBMCExecutableButtonSelected();
			}
		});

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelFile);
		resourcesText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 2;
		resourcesText.setLayoutData(gridData);
		resourcesText.setFont(font);
		resourcesText.addModifyListener(modifyListener);

		Composite buttons = new Composite(comp, SWT.NONE);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 3;
		buttons.setLayoutData(gridData);

		GridLayout buttonLayout = new GridLayout(4, false);
		buttonLayout.marginHeight = buttonLayout.marginWidth = 0;
		buttons.setLayout(buttonLayout);

		Label tempLbl = new Label(buttons, SWT.NONE);
		tempLbl.setLayoutData(new GridData(SWT.END, SWT.CENTER, true, false));

		Button projectsButton = createPushButton(buttons, Messages.MainLaunchingTab_projectsBrowse, null);
		projectsButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleProjectsButtonSelected();
			}
		});
		projectsButton.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));
		Button sourcesButton = createPushButton(buttons, Messages.MainLaunchingTab_sourcesBrowse, null);
		sourcesButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleSourcesButtonSelected();
			}
		});
		sourcesButton.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));
		Button binaryButton = createPushButton(buttons, Messages.MainLaunchingTab_binaryBrowse, null);
		binaryButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBinaryButtonSelected();
			}
		});
		binaryButton.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelFunction);
		functionText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 2;
		functionText.setLayoutData(gridData);
		functionText.setFont(font);
		functionText.addModifyListener(modifyListener);

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_showloops);
		showLoopsBtn = new Button(comp, SWT.CHECK);
		showLoopsBtn.setData("--show-loops"); //$NON-NLS-1$
		showLoopsBtn.setLayoutData(gridData);
		showLoopsBtn.addSelectionListener(listener);

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelUnwind);
		unwindText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 2;
		unwindText.setLayoutData(gridData);
		unwindText.setFont(font);
		unwindText.addModifyListener(modifyListener);

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelAutorun);
		autorunBtn = new Button(comp, SWT.CHECK);
		autorunBtn.addSelectionListener(listener);
		autorunBtn.setLayoutData(gridData);

		// Check All Properties options
		Group optionGroup = new Group(comp, SWT.NONE);
		optionGroup.setText(Messages.MainLaunchingTab_labelOptions);
		GridLayout optionLayout = new GridLayout();
		optionLayout.verticalSpacing = 0;
		optionLayout.numColumns = 3;
		optionGroup.setLayout(optionLayout);

		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 3;
		optionGroup.setLayoutData(gridData);

		optionButtons = new ArrayList<Button>();
		CheckAllPropertiesOption[] options = CheckAllPropertiesOption.values();
		for (int i = 0; i < options.length; i++) {
			CheckAllPropertiesOption option = options[i];
			final Button btn = new Button(optionGroup, SWT.CHECK);
			btn.setData(option);
			new Label(optionGroup, SWT.NONE).setText(option.getName());
			new Label(optionGroup, SWT.NONE).setText(option.getDescription());
			optionButtons.add(btn);
			btn.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					scheduleUpdateJob();
				}
			});
		}
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//Nothing to do here at this point
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			executableText.setText(configuration.getAttribute(CBMCCliHelper.LC_CBMC_EXECUTABLE, NO_VALUE));
			resourceToCheckType = configuration.getAttribute(CBMCCliHelper.LC_CBMC_RESOURCE_TYPE, CBMCCliHelper.LC_BINARY_TO_CHECK);

			List<String> resources = configuration.getAttribute(CBMCCliHelper.LC_CBMC_RESOURCES, new ArrayList<String>());
			String resourcesStr = NO_VALUE;
			for (Iterator<String> iterator = resources.iterator(); iterator.hasNext();) {
				String resource = iterator.next();
				resourcesStr += (resourcesStr == NO_VALUE ? NO_VALUE : NEW_LINE) + resource;

			}
			resourcesText.setText(resourcesStr);
			functionText.setText(configuration.getAttribute(CBMCCliHelper.LC_CBMC_FUNCTION, NO_VALUE));
			String unwind = configuration.getAttribute(CBMCCliHelper.LC_CBMC_UNWIND, NO_VALUE);
			if (!unwind.isEmpty())
				unwindText.setText(unwind);

			autorunBtn.setSelection(configuration.getAttribute(CBMCCliHelper.LC_CBMC_AUTORUN, true));

			CheckAllPropertiesOption[] options = CheckAllPropertiesOption.values();
			for (int i = 0; i < options.length; i++) {
				CheckAllPropertiesOption option = options[i];
				boolean checked = configuration.getAttribute("cbmc." + option.getName(), false); //$NON-NLS-1$
				for (Iterator<Button> iterator = optionButtons.iterator(); iterator.hasNext();) {
					Button btn = iterator.next();
					if (((CheckAllPropertiesOption) btn.getData()).getName() == option.getName()) {
						btn.setSelection(checked);
						break;
					}
				}
			}

			showLoopsBtn.setSelection(configuration.getAttribute(CBMCCliHelper.LC_CBMC_SHOW_LOOPS, false));
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		if (isDirty()) {
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_AUTORUN, autorunBtn.getSelection());
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_SHOW_LOOPS, showLoopsBtn.getSelection());
			String exec = executableText.getText().trim();
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_EXECUTABLE, exec.length() == 0 ? null : exec);
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_RESOURCES, Arrays.asList(resourcesText.getText().trim().split(NEW_LINE)));
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_RESOURCE_TYPE, resourceToCheckType);

			String function = functionText.getText().trim();
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_FUNCTION, function.length() == 0 ? null : function);
			String unwind = unwindText.getText().trim();
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_UNWIND, unwind);
			CheckAllPropertiesOption[] options = CheckAllPropertiesOption.values();
			for (int i = 0; i < options.length; i++) {
				CheckAllPropertiesOption option = options[i];
				for (Iterator<Button> iterator = optionButtons.iterator(); iterator.hasNext();) {
					Button btn = iterator.next();
					if (((CheckAllPropertiesOption) btn.getData()).getName() == option.getName()) {
						boolean checked = btn.getSelection();
						configuration.setAttribute(CBMCCliHelper.LC_CBMC_OPTIONPREFIX + option.getName(), checked);
						break;
					}
				}
			}
		}
	}

	@Override
	public String getName() {
		return Messages.MainLaunchingTab_name;
	}

	private String serializeResources(Object[] resources, int type) {
		String serializedResources = NO_VALUE;
		for (int i = 0; i < resources.length; i++) {
			IResource resource = (IResource) resources[i];
			if (resource.getType() == type) {
				if (resource instanceof IProject) {
					if (resources[i] instanceof ICProject)
						System.out.println("oui!!");
					serializedResources += (serializedResources.equals(NO_VALUE) ? NO_VALUE : NEW_LINE) + ((IProject) resource).getLocation().toString();
				} else if (resource instanceof IFile)
					serializedResources += (serializedResources.equals(NO_VALUE) ? NO_VALUE : NEW_LINE) + ((IFile) resource).getLocation().toOSString();
			}
		}
		return serializedResources;
	}
}
