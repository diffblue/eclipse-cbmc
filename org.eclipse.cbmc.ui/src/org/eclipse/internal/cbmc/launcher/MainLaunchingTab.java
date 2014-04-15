package org.eclipse.internal.cbmc.launcher;

import java.io.File;
import java.util.*;
import java.util.List;
import org.eclipse.cbmc.CommandOption;
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

	@Override
	public boolean canSave() {
		return validateExecutable() && validateCFile();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setMessage(null);
		setErrorMessage(null);
		return validateExecutable() && validateCFile();
	}

	private boolean validateExecutable() {
		int len = executableText.getText().trim().length();
		if (len == 0) {
			setErrorMessage(Messages.MainLaunchingTab_0);
			return false;
		}
		String path = executableText.getText().trim();
		File f = new File(path);
		if (!f.exists()) {
			setErrorMessage(Messages.MainLaunchingTab_1);
			return false;
		}
		return true;
	}

	private boolean validateCFile() {
		int len = fileText.getText().trim().length();
		if (len == 0) {
			setErrorMessage(Messages.MainLaunchingTab_2);
			return false;
		}
		String path = fileText.getText().trim();
		File f = new File(path);
		if (!f.exists()) {
			setErrorMessage(Messages.MainLaunchingTab_3);
		}
		return true;
	}

	ModifyListener modifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
		}
	};

	SelectionListener listener = new SelectionAdapter() {
		public void widgetSelected(SelectionEvent e) {
			if (e.getSource() instanceof Button) {
				Button button = (Button) e.getSource();
				if (button.getSelection()) {
					updateLaunchConfigurationDialog();
				}
			} else {
				updateLaunchConfigurationDialog();
			}
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

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_8);

		executableText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		executableText.setLayoutData(gridData);
		executableText.addModifyListener(modifyListener);
		executableButton = createPushButton(comp, Messages.MainLaunchingTab_5, null);
		executableButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				handleCBMCExecutableButtonSelected();
			}
		});

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_9);

		fileText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		fileText.setLayoutData(gridData);
		fileText.setFont(font);
		fileText.addModifyListener(modifyListener);
		fileButton = createPushButton(comp, Messages.MainLaunchingTab_12, null);
		fileButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleCFileButtonSelected();
			}
		});

		new Label(comp, SWT.NONE).setText(Messages.MainLaunchingTab_10);

		functionText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 2;
		functionText.setLayoutData(gridData);
		functionText.setFont(font);
		functionText.addModifyListener(modifyListener);

		Group optionGroup = new Group(comp, SWT.NONE);
		optionGroup.setText(Messages.MainLaunchingTab_11);
		GridLayout optionLayout = new GridLayout();
		optionLayout.verticalSpacing = 0;
		optionLayout.numColumns = 3;
		optionGroup.setLayout(optionLayout);

		gridData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData.horizontalSpan = 3;
		optionGroup.setLayoutData(gridData);

		optionButtons = new ArrayList<Button>();
		for (int i = 0; i < CommandOption.values().length; i++) {
			CommandOption option = CommandOption.get(i);
			final Button btn = new Button(optionGroup, SWT.CHECK);
			btn.setData(option);
			btn.setText(option.getLiteral());
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
		final String NO_VALUE = ""; //$NON-NLS-1$
		try {
			String exec = configuration.getAttribute(ExecutionDescriptor.LC_CBMC_EXECUTABLE, NO_VALUE);
			executableText.setText(exec);

			String file = configuration.getAttribute(ExecutionDescriptor.LC_CBMC_FILE, NO_VALUE);
			fileText.setText(file);

			String function = configuration.getAttribute(ExecutionDescriptor.LC_CBMC_FUNCTION, NO_VALUE);
			functionText.setText(function);

			for (int i = 0; i < CommandOption.values().length; i++) {
				CommandOption option = CommandOption.get(i);
				boolean checked = configuration.getAttribute("cbmc." + option.getLiteral(), false); //$NON-NLS-1$
				for (Iterator<Button> iterator = optionButtons.iterator(); iterator.hasNext();) {
					Button btn = iterator.next();
					if (((CommandOption) btn.getData()).getLiteral() == option.getLiteral()) {
						btn.setSelection(checked);
						break;
					}
				}
			}

		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		if (isDirty()) {
			String exec = executableText.getText().trim();
			configuration.setAttribute(ExecutionDescriptor.LC_CBMC_EXECUTABLE, exec.length() == 0 ? null : exec);
			String file = fileText.getText().trim();
			configuration.setAttribute(ExecutionDescriptor.LC_CBMC_FILE, file.length() == 0 ? null : file);
			String function = functionText.getText().trim();
			configuration.setAttribute(ExecutionDescriptor.LC_CBMC_FUNCTION, function.length() == 0 ? null : function);
			for (int i = 0; i < CommandOption.values().length; i++) {
				CommandOption option = CommandOption.get(i);
				for (Iterator<Button> iterator = optionButtons.iterator(); iterator.hasNext();) {
					Button btn = iterator.next();
					if (((CommandOption) btn.getData()).getName() == option.getName()) {
						boolean checked = btn.getSelection();
						configuration.setAttribute(ExecutionDescriptor.LC_CBMC_OPTIONPREFIX + option.getLiteral(), checked);
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
