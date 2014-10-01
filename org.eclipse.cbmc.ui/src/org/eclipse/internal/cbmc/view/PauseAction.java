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
		return "Pause";
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
