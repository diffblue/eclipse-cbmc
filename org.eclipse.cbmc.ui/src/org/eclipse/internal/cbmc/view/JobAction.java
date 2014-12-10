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

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.FrameworkUtil;

public abstract class JobAction extends Action {
	private ViewToolbar containingToolBar = null;

	public JobAction(ViewToolbar toolbar) {
		containingToolBar = toolbar;
		setImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), getImagePath(), null)));
		setDisabledImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), getDisabledImagePath(), null)));
		updateEnablementState();
	}

	public Job getJob() {
		return containingToolBar.getJob();
	}

	public abstract IPath getImagePath();

	public abstract IPath getDisabledImagePath();

	public abstract void updateEnablementState();
}
