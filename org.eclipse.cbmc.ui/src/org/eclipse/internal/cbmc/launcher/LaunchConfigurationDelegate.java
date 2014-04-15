package org.eclipse.internal.cbmc.launcher;

import java.io.IOException;
import java.util.Iterator;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import org.eclipse.cbmc.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.internal.cbmc.view.PropertiesView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.*;

public class LaunchConfigurationDelegate extends org.eclipse.debug.core.model.LaunchConfigurationDelegate {

	public void launch(final ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		final ExecutionDescriptor ed = ExecutionDescriptor.createFromLaunchConfiguration(configuration);
		Job cmdJob = new Job("CBMC Execution...") { //$NON-NLS-1$
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					final Results results;
					results = ed.getAllProperties();
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							PropertiesView view = getCBMCView();
							view.showBusy(true);
							view.refreshTree(results);
							view.showBusy(false);
						}
					});
					for (Iterator<Property> iterator = results.getProperties().iterator(); iterator.hasNext();) {
						Property property = iterator.next();
						try {
							property.setStatus(PropertyStatus.RUNNING);
							String propertyDetailPath = ed.resolveProperty(property);
							property.setDetailsFile(propertyDetailPath);
							property.setStatus(propertyDetailPath == null ? PropertyStatus.SUCCEEDED : PropertyStatus.FAILED);
						} catch (IOException | InterruptedException e) {
							e.printStackTrace();
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TransformerFactoryConfigurationError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		cmdJob.schedule();
	}

	private PropertiesView getCBMCView() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page == null)
			return null;
		PropertiesView view = (PropertiesView) page.findView(PropertiesView.ID);
		if (view == null) {
			try {
				view = (PropertiesView) page.showView(PropertiesView.ID, null, IWorkbenchPage.VIEW_VISIBLE);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		return view;
	}
}
