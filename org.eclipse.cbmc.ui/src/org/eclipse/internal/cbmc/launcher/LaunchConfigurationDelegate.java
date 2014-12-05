package org.eclipse.internal.cbmc.launcher;

import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.debug.core.*;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.internal.cbmc.view.CbmcView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.*;

public class LaunchConfigurationDelegate extends org.eclipse.debug.core.model.LaunchConfigurationDelegate {

	public void launch(final ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = null;
				CbmcView view = null;
				try {
					page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					view = (CbmcView) page.findView(CbmcView.ID);
					if (view == null) {
						view = (CbmcView) page.showView(CbmcView.ID, null, IWorkbenchPage.VIEW_ACTIVATE);
					}
					try {
						launch.terminate();
					} catch (DebugException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					view.startVerification(CBMCCliHelper.create(configuration));
				} catch (PartInitException e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "CBMC View cannot be initialized", e)); //$NON-NLS-1$
				}
			}
		});
	}
}
