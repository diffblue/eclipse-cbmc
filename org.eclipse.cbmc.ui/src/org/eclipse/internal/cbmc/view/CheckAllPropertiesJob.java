package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.Results;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

//This job validates all the properties in the model
public class CheckAllPropertiesJob extends Job {

	private Results results;

	public CheckAllPropertiesJob(String name, Results results) {
		super(name);
		this.results = results;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		EList<Property> properties = results.getProperties();
		return PropertyCheckerHelper.checkProperties(properties, monitor);
	}

	public void stop() {
		cancel();
	}
}
