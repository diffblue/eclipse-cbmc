package org.eclipse.internal.cbmc.view;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;

public class StopAction extends JobAction {

	public StopAction(ViewToolbar toolbar) {
		super(toolbar);
	}

	@Override
	public IPath getImagePath() {
		return new Path("icons/stop_enabled.gif"); //$NON-NLS-1$
	}

	@Override
	public IPath getDisabledImagePath() {
		return new Path("icons/stop_disabled.gif"); //$NON-NLS-1$
	}

	@Override
	public String getText() {
		return "Stop";
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
		//TODO Need to reinitialize all the properties
	}
}
