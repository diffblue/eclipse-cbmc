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

import org.eclipse.core.runtime.jobs.*;
import org.eclipse.jface.action.*;

public class ViewToolbar {
	IToolBarManager toolBarManager;
	CheckAllPropertiesJob job;

	public ViewToolbar(IToolBarManager toolBarManager) {
		this.toolBarManager = toolBarManager;
		toolBarManager.add(new RunAction(this));
		toolBarManager.add(new PauseAction(this));
		toolBarManager.add(new StopAction(this));
	}

	void refresh() {
		IContributionItem[] items = toolBarManager.getItems();
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof ActionContributionItem) {
				((JobAction) ((ActionContributionItem) items[i]).getAction()).updateEnablementState();
			}
		}
	}

	public void bind(CheckAllPropertiesJob newJob) {
		this.job = newJob;
		refresh();
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {
				refresh();
			}

			@Override
			public void running(IJobChangeEvent event) {
				refresh();
			}
		});
	}

	public Job getJob() {
		return job;
	}

	public void reset() {
		job = null;
		refresh();
	}
}
