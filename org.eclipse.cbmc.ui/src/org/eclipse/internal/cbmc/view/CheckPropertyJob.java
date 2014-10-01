package org.eclipse.internal.cbmc.view;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.eclipse.cbmc.*;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.internal.cbmc.Activator;

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
		try {
			//TODO  we want to synchronize on property 
			if (property.getStatus() != PropertyStatus.PENDING)
				return Status.OK_STATUS;

			property.setStatus(PropertyStatus.RUNNING);
			CBMCCliHelper cliHelper = ((Results) property.eContainer()).getCBMCHelper();
			counterExampleFile = new File(cliHelper.getWorkingDirectory(), FILE_COUNTEREXAMPLE_PREFIX + property.getNumber() + COUTEREXAMPLE_EXT);
			ProcessBuilder pb = new ProcessBuilder(cliHelper.getCommandLineForPropertyCheck(property));
			pb.redirectErrorStream(true);
			pb.redirectOutput(counterExampleFile);
			Process process = pb.start();
			while (!process.waitFor(1, TimeUnit.SECONDS)) {
				if (monitor.isCanceled()) {
					process.destroy();
					property.setStatus(PropertyStatus.PENDING);
					return Status.CANCEL_STATUS;
				}
			}

			//CBMC validated the property
			if (process.exitValue() == 0) {
				counterExampleFile = null;
				property.setStatus(PropertyStatus.SUCCEEDED);
				return Status.OK_STATUS;
			}

			//CBMC found a counter example
			property.setStatus(PropertyStatus.FAILED);
			property.setDetailsFile(getCounterExample().getAbsolutePath());

			//TODO CBMC had a problem (e.g. incorrect CLI or problem parsing, etc.)

		} catch (IOException | InterruptedException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.CBMC_execution_error, e);
		}
		return Status.OK_STATUS;
	}

	public File getCounterExample() {
		return counterExampleFile;
	}

}
