package org.eclipse.internal.cbmc.view;

import java.io.File;
import java.io.IOException;
import org.eclipse.cbmc.Property;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.internal.cbmc.launcher.CBMCCliHelper;

public class CheckPropertyJob extends Job {

	private static final String COUTEREXAMPLE_EXT = ".txt"; //$NON-NLS-1$
	private static final String FILE_COUNTEREXAMPLE_PREFIX = "counterexample."; //$NON-NLS-1$

	private Property property;
	private CBMCCliHelper cliHelper;
	private File counterExampleFile;

	public CheckPropertyJob(String name, Property property, CBMCCliHelper cliHelper) {
		super(name);
		this.property = property;
		this.cliHelper = cliHelper;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			counterExampleFile = new File(cliHelper.getWorkingDirectory(), FILE_COUNTEREXAMPLE_PREFIX + property.getNumber() + COUTEREXAMPLE_EXT);
			ProcessBuilder pb = new ProcessBuilder(cliHelper.getCommandLineForPropertyCheck(property));
			pb.redirectErrorStream(true);
			pb.redirectOutput(counterExampleFile);
			Process process = pb.start();
			process.waitFor();
			//This code is only for Java 8
			//			while (!process.waitFor(1, TimeUnit.SECONDS)) {
			//				if (monitor.isCanceled()) {
			//					process.destroy();
			//					return Status.CANCEL_STATUS;
			//				}
			//			}

			if (process.exitValue() == 0)
				counterExampleFile = null;
		} catch (IOException | InterruptedException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.CBMC_execution_error, e);
		}
		return Status.OK_STATUS;
	}

	public File getCounterExample() {
		return counterExampleFile;
	}

}
