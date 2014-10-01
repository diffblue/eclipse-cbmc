package org.eclipse.internal.cbmc.view;

import java.util.List;
import org.eclipse.cbmc.Property;
import org.eclipse.core.runtime.*;

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Status.OK_STATUS;
	}
}
