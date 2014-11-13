package org.eclipse.internal.cbmc.view;

import java.util.List;
import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.*;
import org.eclipse.emf.common.util.EList;

public class PropertyCheckerHelper {
	public static IStatus checkProperties(List<Property> properties, IProgressMonitor monitor) {
		for (Property property : properties) {
			if (monitor != null && monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			try {
				CheckPropertyJob propertyJob = new CheckPropertyJob(property.getNumber(), property);
				property.setJob(propertyJob);
				propertyJob.schedule();
				property.eContainer();
				propertyJob.join();
				property.setJob(null);
			} catch (InterruptedException e) {
				//Nothing to do
			}
		}
		return Status.OK_STATUS;
	}

	public static void resetPropertyStatus(Results results) {
		EList<Property> properties = results.getProperties();
		for (Property property : properties) {
			property.setStatus(PropertyStatus.PENDING);
		}
		results.setRunCount(0);
		results.setErrorCount(0);
		results.setFailedCount(0);
		results.setSucceededCount(0);
	}
}
