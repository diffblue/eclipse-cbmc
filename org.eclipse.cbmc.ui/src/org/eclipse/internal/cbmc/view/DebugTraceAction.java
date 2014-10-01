package org.eclipse.internal.cbmc.view;

import java.io.File;
import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyStatus;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.internal.cbmc.tracedebugger.launcher.CBMCDebug;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionListenerAction;
import org.osgi.framework.FrameworkUtil;

public class DebugTraceAction extends SelectionListenerAction {

	protected DebugTraceAction(String text) {
		super(text);
		setImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/analyze.gif"), null))); //$NON-NLS-1$
		setDisabledImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/analyze.gif"), null))); //$NON-NLS-1$
	}

	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		for (Object selected : getStructuredSelection().toList()) {
			if (selected instanceof Property) {
				if (((Property) selected).getStatus() == PropertyStatus.FAILED)
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
				try {
					new CBMCDebug().launchDebugger("H", property.getDetailsFile(), property.getFunction(), property.getDescription(), new File(property.getFile().getName()).getName());
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}
}
