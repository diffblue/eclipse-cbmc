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
