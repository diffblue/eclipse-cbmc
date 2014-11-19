package org.eclipse.internal.cbmc.view;

import java.io.File;
import org.eclipse.cbmc.*;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.internal.cbmc.launcher.ProcessHelper;

public class CheckPropertyJob extends Job {

	private static final String COUTEREXAMPLE_EXT = ".xml"; //$NON-NLS-1$
	private static final String FILE_COUNTEREXAMPLE_PREFIX = "counterexample."; //$NON-NLS-1$

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
		boolean success = ProcessHelper.executeCommandWithRedirectOutput(cliHelper.getCommandLineForPropertyCheck(property), counterExampleFile, monitor);
		if (monitor.isCanceled()) {
			property.setStatus(PropertyStatus.PENDING);
			return Status.CANCEL_STATUS;
		}
		//CBMC validated the property
		if (success) {
			counterExampleFile = null;
			property.setStatus(PropertyStatus.SUCCEEDED);
			return Status.OK_STATUS;
		}

		//CBMC found a counter example
		property.setStatus(PropertyStatus.FAILED);
		property.setDetailsFile(getCounterExample().getAbsolutePath());
		return Status.OK_STATUS;
	}

	public File getCounterExample() {
		return counterExampleFile;
	}

}
