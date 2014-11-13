package org.eclipse.internal.cbmc.launcher;

import java.io.File;
import java.util.*;
import java.util.List;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.cbmc.util.CBMCCliHelper.CheckAllPropertiesOption;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

public class MainLaunchingTab extends AbstractLaunchConfigurationTab {

	private List<Button> optionButtons;
	private Text executableText;
	private Button executableButton;
	private Text fileText;
	private Text functionText;
	private Button fileButton;
	private Button autorunBtn;
	private Button showLoopsBtn;
	private Text unwindText;

	final String NO_VALUE = ""; //$NON-NLS-1$

	@Override
	public boolean canSave() {
		return validateExecutable() && validateCFile() && validateUnwind();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setMessage(null);
		setErrorMessage(null);
		return validateExecutable() && validateCFile() && validateUnwind();
	}

	private boolean validateExecutable() {
		int len = executableText.getText().trim().length();
		if (len == 0) {
			setErrorMessage(Messages.MainLaunchingTab_error_0);
			return false;
		}
		String path = executableText.getText().trim();
		File f = new File(path);
		if (!f.exists()) {
			setErrorMessage(Messages.MainLaunchingTab_error_1);
			return false;
		}
		return true;
	}

	private boolean validateCFile() {
		int len = fileText.getText().trim().length();
		if (len == 0) {
			setErrorMessage(Messages.MainLaunchingTab_error_2);
			return false;
		}
		String path = fileText.getText().trim();
		File f = new File(path);
		if (!f.exists()) {
			setErrorMessage(Messages.MainLaunchingTab_error_3);
		}
		return true;
	}

	private boolean validateUnwind() {
		try {
			if (unwindText.getText().isEmpty() || Integer.parseInt(unwindText.getText()) >= 0) {
				return true;
			}
		} catch (NumberFormatException e) {
			setErrorMessage(Messages.MainLaunchingTab_error_4);
			return false;
		}
		setErrorMessage(Messages.MainLaunchingTab_error_4);
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
		dialog.setText(Messages.MainLaunchingTab_4);
		dialog.setFilterNames(new String[] {"cbmc*"}); //$NON-NLS-1$
		String file = dialog.open();
		if (file != null) {
			executableText.setText(file);
		}
	}

	void handleCFileButtonSelected() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		dialog.setTitle(Messages.MainLaunchingTab_6);
		dialog.setMessage(Messages.MainLaunchingTab_7);
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			fileText.setText(file.getRawLocation().makeAbsolute().toString());
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

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelExecutable);
		executableText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		executableText.setLayoutData(gridData);
		executableText.addModifyListener(modifyListener);
		executableButton = createPushButton(comp, Messages.MainLaunchingTab_browse, null);
		executableButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleCBMCExecutableButtonSelected();
			}
		});

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelFile);
		fileText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		fileText.setLayoutData(gridData);
		fileText.setFont(font);
		fileText.addModifyListener(modifyListener);
		fileButton = createPushButton(comp, Messages.MainLaunchingTab_browse, null);
		fileButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleCFileButtonSelected();
			}
		});

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_labelFunction);

		functionText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 2;
		functionText.setLayoutData(gridData);
		functionText.setFont(font);
		functionText.addModifyListener(modifyListener);

		new Label(comp, SWT.NONE).setText("show the loops"); //$NON-NLS-1$
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
			String exec = configuration.getAttribute(CBMCCliHelper.LC_CBMC_EXECUTABLE, NO_VALUE);
			executableText.setText(exec);

			String file = configuration.getAttribute(CBMCCliHelper.LC_CBMC_FILE, NO_VALUE);
			fileText.setText(file);

			String function = configuration.getAttribute(CBMCCliHelper.LC_CBMC_FUNCTION, NO_VALUE);
			functionText.setText(function);

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
			String file = fileText.getText().trim();
			configuration.setAttribute(CBMCCliHelper.LC_CBMC_FILE, file.length() == 0 ? null : file);
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
		return Messages.MainLaunchingTab_20;
	}
}
