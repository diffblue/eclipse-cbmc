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

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;

public class PauseAction extends JobAction {

	public PauseAction(ViewToolbar toolbar) {
		super(toolbar);
	}

	@Override
	public IPath getImagePath() {
		return new Path("icons/pause_enabled.gif"); //$NON-NLS-1$
	}

	@Override
	public IPath getDisabledImagePath() {
		return new Path("icons/pause_disabled.gif"); //$NON-NLS-1$
	}

	@Override
	public String getText() {
		return Messages.PropertiesView_actionPause;
	}

	@Override
	public void updateEnablementState() {
		setEnabled(getJob() != null && getJob().getState() == Job.RUNNING);
	}

	@Override
	public void run() {
		Job job = getJob();
		if (job != null)
			job.cancel();
	}
}
