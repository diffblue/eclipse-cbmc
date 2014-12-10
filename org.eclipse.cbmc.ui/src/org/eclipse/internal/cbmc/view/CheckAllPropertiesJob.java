/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
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
	private PropertyCheckerHelper propertyChecker;

	public CheckAllPropertiesJob(String name, Results results) {
		super(name);
		this.results = results;
		propertyChecker = new PropertyCheckerHelper();
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		EList<Property> properties = results.getProperties();
		return propertyChecker.checkProperties(properties, monitor);
	}

	public void resetProperties() {
		propertyChecker.resetPropertyStatus(results);
	}

	@Override
	protected void canceling() {
		propertyChecker.cancelCurrentJob();
	}
}
