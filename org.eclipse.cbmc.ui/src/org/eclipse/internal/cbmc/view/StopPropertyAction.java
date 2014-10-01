package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyStatus;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionListenerAction;
import org.osgi.framework.FrameworkUtil;

public class StopPropertyAction extends SelectionListenerAction {

	protected StopPropertyAction(String text) {
		super(text);
		setImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/stop_enabled.gif"), null))); //$NON-NLS-1$
		setDisabledImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/stop_disabled.gif"), null))); //$NON-NLS-1$
	}

	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		for (Object selected : getStructuredSelection().toList()) {
			if (selected instanceof Property) {
				if (((Property) selected).getStatus() == PropertyStatus.RUNNING)
					return true;
			}
		}
		return false;
	}

	@Override
	public void run() {
		for (Object selected : getStructuredSelection().toList()) {
			if (selected instanceof Property) {
				Property property = (Property) selected;
				if (property.getStatus() == PropertyStatus.RUNNING) {
					Job job = property.getJob();
					if (job != null)
						job.cancel();
				}
			}

		}
	}
}
