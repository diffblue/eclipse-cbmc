package org.eclipse.internal.cbmc.view;

import java.util.List;
import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

public class PropertyCheckerHelper {
	private Job propertyJob = null;

	private synchronized Job setCurrentJob(Job currentJob) {
		propertyJob = currentJob;
		return currentJob;
	}

	public IStatus checkProperties(List<Property> properties, IProgressMonitor monitor) {
		for (Property property : properties) {
			if (monitor != null && monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			try {
				Job currentJob = setCurrentJob(new CheckPropertyJob(property.getNumber(), property));
				property.setJob(propertyJob);
				currentJob.schedule();
				currentJob.join();
				property.setJob(null);
				setCurrentJob(null);
			} catch (InterruptedException e) {
				//Nothing to do
			}
		}
		return Status.OK_STATUS;
	}

	public void resetPropertyStatus(Results results) {
		EList<Property> properties = results.getProperties();
		for (Property property : properties) {
			property.setStatus(PropertyStatus.PENDING);
		}
		results.setRunCount(0);
		results.setErrorCount(0);
		results.setFailedCount(0);
		results.setSucceededCount(0);
	}

	public synchronized void cancelCurrentJob() {
		if (propertyJob != null)
			propertyJob.cancel();
	}
}
