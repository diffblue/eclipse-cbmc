package org.eclipse.internal.cbmc.view;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.util.IPropertyChangeListener;

public class RunAction extends JobAction {

	public RunAction(ViewToolbar toolbar) {
		super(toolbar);
	}

	@Override
	public IPath getImagePath() {
		return new Path("icons/run_enabled.gif"); //$NON-NLS-1$
	}

	@Override
	public IPath getDisabledImagePath() {
		return new Path("icons/run_disabled.gif"); //$NON-NLS-1$
	}

	@Override
	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.addPropertyChangeListener(listener);
	}

	@Override
	public String getText() {
		return Messages.RunAction_0;
	}

	@Override
	public void updateEnablementState() {
		setEnabled(getJob() != null && getJob().getState() != Job.RUNNING);
	}

	@Override
	public void run() {
		CheckAllPropertiesJob job = (CheckAllPropertiesJob) getJob();
		if (job != null) {
			if (job.getResult() != null) {
				job.resetProperties();
			}
			job.schedule();
		}
	}
}
