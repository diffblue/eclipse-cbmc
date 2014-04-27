package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.internal.cbmc.launcher.CBMCCliHelper;

public class CheckAllPropertiesJob extends Job {

	private Results results;
	private CBMCCliHelper cliHelper;

	public CheckAllPropertiesJob(String name, Results results, CBMCCliHelper cliHelper) {
		super(name);
		this.results = results;
		this.cliHelper = cliHelper;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		EList<Property> properties = results.getProperties();
		for (Property property : properties) {
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;

			synchronized (property) {
				if (property.getStatus() != PropertyStatus.PENDING)
					continue;
				property.setStatus(PropertyStatus.RUNNING);
			}

			try {
				CheckPropertyJob propertyJob = new CheckPropertyJob(property.getNumber(), property, cliHelper);
				property.setJob(propertyJob);
				propertyJob.schedule();
				propertyJob.join();

				synchronized (propertyJob) {
					if (!propertyJob.getResult().isOK()) {
						property.setStatus(PropertyStatus.FAILED); //TODO add a new status
						continue;
					}
					if (propertyJob.getCounterExample() == null)
						property.setStatus(PropertyStatus.SUCCEEDED);
					else {
						property.setStatus(PropertyStatus.FAILED);
						property.setDetailsFile(propertyJob.getCounterExample().getAbsolutePath());
					}
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Status.OK_STATUS;
	}
}
