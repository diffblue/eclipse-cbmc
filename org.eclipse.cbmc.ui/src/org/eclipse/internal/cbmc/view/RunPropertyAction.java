package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyStatus;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionListenerAction;
import org.osgi.framework.FrameworkUtil;

public class RunPropertyAction extends SelectionListenerAction {

	protected RunPropertyAction(String text) {
		super(text);
		setImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/run_enabled.gif"), null))); //$NON-NLS-1$
		setDisabledImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/run_disabled.gif"), null))); //$NON-NLS-1$
	}

	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		for (Object selected : getStructuredSelection().toList()) {
			if (selected instanceof Property) {
				if (((Property) selected).getStatus() == PropertyStatus.PENDING)
					return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		PropertyCheckerHelper.checkProperties(getStructuredSelection().toList(), null);
	}
}
