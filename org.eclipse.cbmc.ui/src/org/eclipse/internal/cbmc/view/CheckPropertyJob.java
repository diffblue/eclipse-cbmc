package org.eclipse.internal.cbmc.view;

import java.io.File;
import org.eclipse.cbmc.*;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.internal.cbmc.launcher.ProcessHelper;

public class CheckPropertyJob extends Job {

	private static final String COUTEREXAMPLE_EXT = ".xml"; //$NON-NLS-1$
	private static final String FILE_COUNTEREXAMPLE_PREFIX = "counterexample."; //$NON-NLS-1$
	private static final int SUCCESS_EXITVALUE = 0;
	private static final int FAILURE_EXITVALUE = 10;

	private Property property;
	private File counterExampleFile;

	public CheckPropertyJob(String name, Property property) {
		super(name);
		this.property = property;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		//TODO  we want to synchronize on property 
		if (property.getStatus() != PropertyStatus.PENDING)
			return Status.OK_STATUS;
		property.setStatus(PropertyStatus.RUNNING);
		CBMCCliHelper cliHelper = ((Results) property.eContainer()).getCBMCHelper();
		counterExampleFile = new File(cliHelper.getWorkingDirectory(), FILE_COUNTEREXAMPLE_PREFIX + property.getNumber() + COUTEREXAMPLE_EXT);
		int exitValue = ProcessHelper.executeCommandWithRedirectOutput(cliHelper.getCommandLineForPropertyCheck(property), counterExampleFile, monitor);
		if (monitor.isCanceled()) {
			property.setStatus(PropertyStatus.PENDING);
			return Status.CANCEL_STATUS;
		}
		//CBMC validated the property
		switch (exitValue) {
			case SUCCESS_EXITVALUE :
				counterExampleFile = null;
				property.setStatus(PropertyStatus.SUCCEEDED);
				return Status.OK_STATUS;
			case FAILURE_EXITVALUE :
				property.setStatus(PropertyStatus.FAILED);
				property.setDetailsFile(getCounterExample().getAbsolutePath());
				return Status.OK_STATUS;
			default :
				property.setStatus(PropertyStatus.ERROR);
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, property.getDescription() + " check failed: " + getErrorMessage(exitValue), null)); //$NON-NLS-1$
				return Status.OK_STATUS;
		}
	}

	private String getErrorMessage(int exitValue) {
		switch (exitValue) {
			case 1 :
				return Messages.CheckPropertyJob_errorExitValue0;
			case 6 :
				return Messages.CheckPropertyJob_errorExitValue1;
			case 7 :
				return Messages.CheckPropertyJob_errorExitValue2;
		}
		return Messages.CheckPropertyJob_errorExitValue3 + exitValue;
	}

	public File getCounterExample() {
		return counterExampleFile;
	}

}
