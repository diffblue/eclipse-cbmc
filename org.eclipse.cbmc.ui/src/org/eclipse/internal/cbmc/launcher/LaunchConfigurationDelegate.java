package org.eclipse.internal.cbmc.launcher;

import org.eclipse.cbmc.util.CBMCCliHelper;

import java.io.IOException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.internal.cbmc.view.CbmcView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.*;

public class LaunchConfigurationDelegate extends org.eclipse.debug.core.model.LaunchConfigurationDelegate {

	public void launch(final ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = null;
				CbmcView view = null;
				try {
					page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					view = (CbmcView) page.findView(CbmcView.ID);
					if (view == null) {
						view = (CbmcView) page.showView(CbmcView.ID, null, IWorkbenchPage.VIEW_VISIBLE);
					}
					view.startVerification(CBMCCliHelper.create(configuration));
				} catch (PartInitException e) {
					System.err.println("Properties View cannot be initialized");
				} catch (CoreException e) {
					System.err.println("Configuration has invalid attribute");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
