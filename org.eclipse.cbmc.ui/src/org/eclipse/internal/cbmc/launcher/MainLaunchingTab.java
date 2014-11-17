package org.eclipse.internal.cbmc.launcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
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

	private static final String FILE_EXTENSIONS[] = {".c", ".cpp"}; //$NON-NLS-1$//$NON-NLS-2$
	private static final String GOTO_INSTRUMENT = "goto-instrument"; //$NON-NLS-1$
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

	//private FieldStatus isExecutableDirty;

	@Override
	public boolean canSave() {
		return validateExecutable() && validateFile() && validateUnwind();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setMessage(null);
		setErrorMessage(null);
		return validateExecutable() && validateFile() && validateUnwind();
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

	private boolean validateFile() {
		String filePath = fileText.getText().trim();
		if (filePath.length() == 0) {
			setErrorMessage(Messages.MainLaunchingTab_error_2);
			return false;
		}
		File f = new File(filePath);
		if (!f.exists()) {
			setErrorMessage(Messages.MainLaunchingTab_error_3);
			return false;
		}
		return validateSourceFile() || validateBinaryFile();
	}

	private boolean validateSourceFile() {
		String filePath = fileText.getText().trim();
		String extension = filePath.substring(filePath.lastIndexOf("."), filePath.length()); //$NON-NLS-1$
		for (int i = 0; i < FILE_EXTENSIONS.length; i++) {
			if (extension.equals(FILE_EXTENSIONS[i]))
				return true;
		}
		return false;
	}

	private boolean validateBinaryFile() {
		String filePath = fileText.getText().trim();
		String cbmcCommand = executableText.getText().trim();
		String gotoInstrumentPath = cbmcCommand.substring(0, cbmcCommand.lastIndexOf("/") + 1) + GOTO_INSTRUMENT; //$NON-NLS-1$
		File f = new File(gotoInstrumentPath);
		if (!f.exists()) {
			setErrorMessage(Messages.format(Messages.MainLaunchingTab_error_6, new String[] {gotoInstrumentPath}));
			return false;
		}
		Path tmpDir;
		try {

			tmpDir = Files.createTempDirectory("goto-instrument", new FileAttribute[0]);
			File workingDirectory = new File(tmpDir.toFile(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())); //$NON-NLS-1$
			workingDirectory.mkdirs();
			List<String> baseCli = new ArrayList<String>();
			baseCli.add(gotoInstrumentPath);
			baseCli.add(filePath);
			baseCli.add(workingDirectory.getAbsolutePath().concat("/temp.out")); //$NON-NLS-1$
			ProcessBuilder pb = new ProcessBuilder(baseCli);

			pb.redirectErrorStream(true);
			Process process;
			process = pb.start();
			process.waitFor();
			if (process.exitValue() == 0) {
				return true;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setErrorMessage(Messages.MainLaunchingTab_error_5);
		return false;
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
			if (!executableText.getText().equals(file)) {
				//isExecutableDirty = FieldStatus.PENDING;
				executableText.setText(file);
			}

		}
	}

	void handleCFileButtonSelected() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		dialog.setTitle(Messages.MainLaunchingTab_6);
		dialog.setMessage(Messages.MainLaunchingTab_7);
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			if (!fileText.getText().equals(file.getRawLocation().makeAbsolute().toString())) {
				fileText.setText(file.getRawLocation().makeAbsolute().toString());
				//fileFieldStatus = FieldStatus.PENDING;

			}
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
