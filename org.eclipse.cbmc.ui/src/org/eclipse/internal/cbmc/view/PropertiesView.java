package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyStatus;
import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.*;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.internal.cbmc.launcher.CBMCCliHelper;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.osgi.framework.FrameworkUtil;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class PropertiesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.eclipse.cbmc.ui.view.properties"; //$NON-NLS-1$

	private TreeViewer viewer;

	private Action fStopAction;

	private Action fResumeAction;

	private Job checkerJob;

	private CBMCCliHelper cbmcHelper;

	/**
	 * The constructor.
	 */
	public PropertiesView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		configureToolBar();
		viewer = new TreeViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
		CbmcItemProviderAdapterFactory factory = new CbmcItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object selectedNode = ((IStructuredSelection) event.getSelection()).getFirstElement();
				if (selectedNode instanceof Property) {
					Property property = (Property) selectedNode;
					if (property.getStatus() == PropertyStatus.FAILED && property.getDetailsFile() != null) {
						java.io.File fileToOpen = new java.io.File(property.getDetailsFile());
						if (fileToOpen.exists() && fileToOpen.isFile()) {
							IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
							IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
							try {
								IDE.openEditorOnFileStore(page, fileStore);
							} catch (PartInitException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} else {
						IWorkspace workspace = ResourcesPlugin.getWorkspace();
						IPath location = Path.fromOSString(property.getFile().getName());
						IFile ifile = workspace.getRoot().getFileForLocation(location);
						if (ifile == null)
							return;
						IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						IEditorPart editor;
						try {
							editor = IDE.openEditor(activePage, ifile);
							if (editor instanceof ITextEditor) {
								ITextEditor textEditor = (ITextEditor) editor;

								if (property.getLine() > 0) {
									IDocumentProvider provider = textEditor.getDocumentProvider();
									IDocument document = provider.getDocument(textEditor.getEditorInput());

									IRegion lineRegion;
									try {
										lineRegion = document.getLineInformation(property.getLine() - 1);
										textEditor.selectAndReveal(lineRegion.getOffset(), lineRegion.getLength());
									} catch (BadLocationException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} //zero-indexed

								}
							}
						} catch (PartInitException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
			}
		});

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	//	public void launch() {
	//		if (launchHelper == null)
	//			return;
	//		Job mainJob = new Job("CBMC : get all properties") {
	//
	//			@Override
	//			protected IStatus run(IProgressMonitor monitor) {
	//				try {
	//					final Results results = launchHelper.getAllProperties();
	//					Display.getDefault().asyncExec(new Runnable() {
	//						@Override
	//						public void run() {
	//							viewer.setInput(results);
	//							viewer.expandAll();
	//						}
	//					});
	//				} catch (IOException | InterruptedException | TransformerFactoryConfigurationError | TransformerException e) {
	//					// TODO Auto-generated catch block
	//					e.printStackTrace();
	//				}
	//
	//				return Status.OK_STATUS;
	//			}
	//		};
	//		mainJob.schedule();
	//		try {
	//			mainJob.join();
	//		} catch (InterruptedException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		runPropertiesCheck();
	//	}
	//
	//	private void runPropertiesCheck() {
	//		for (Iterator<Property> iterator = ((Results) viewer.getInput()).getProperties().iterator(); iterator.hasNext();) {
	//			Property property = iterator.next();
	//			runPropertyJob(property);
	//		}
	//	}

	//	private void createPropertyJob(final Property property){
	//		Job job = property.getJob();
	//		if (job == null) {
	//			job = new Job("check " + property.getNumber()) {
	//
	//				@Override
	//				protected IStatus run(IProgressMonitor monitor) {
	//					String propertyDetailPath;
	//					try {
	//						property.setStatus(PropertyStatus.RUNNING);
	//						propertyDetailPath = launchHelper.resolveProperty(property);
	//						property.setDetailsFile(propertyDetailPath);
	//						property.setStatus(propertyDetailPath == null ? PropertyStatus.SUCCEEDED : PropertyStatus.FAILED);
	//					} catch (IOException | InterruptedException e) {
	//						e.printStackTrace();
	//					}
	//					return Status.OK_STATUS;
	//				}
	//			};
	//			property.setJob(job);
	//		}
	//		return 
	//	}
	//
	//	private void runPropertyJob(final Property property) {
	//		createPropertyJob(property);
	//		if (property.getStatus() == PropertyStatus.PENDING) {
	//			property.getJob().schedule();
	//			try {
	//				job.join();
	//			} catch (InterruptedException e) {
	//				e.printStackTrace();
	//			}
	//		}
	//		
	//	}

	//	private void stopPropertyCheck(Property property)

	private void configureToolBar() {
		IActionBars actionBars = getViewSite().getActionBars();
		IToolBarManager toolBar = actionBars.getToolBarManager();
		fStopAction = new org.eclipse.jface.action.Action() {
			@Override
			public void run() {
				checkerJob.cancel();
				setDisabledImageDescriptor(getDisabledImageDescriptor());

			}
		};
		fStopAction.setImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/stop.gif"), null)));
		fStopAction.setDisabledImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/stop_disabled.gif"), null)));
		fStopAction.setText("Stop");

		fResumeAction = new Action() {
			@Override
			public void run() {
				switch (checkerJob.getState()) {
					case Job.RUNNING :
						checkerJob.sleep();
						break;
					case Job.SLEEPING :
						checkerJob.wakeUp();
						break;
				}
			}
		};
		fResumeAction.setImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/resume.gif"), null)));
		fResumeAction.setDisabledImageDescriptor(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/resume_disabled.gif"), null)));
		fResumeAction.setText("Resume");

		toolBar.add(fStopAction);
		toolBar.add(fResumeAction);
	}

	public void startVerification(CBMCCliHelper cbmcHelper) {
		this.cbmcHelper = cbmcHelper;
		AllPropertiesJob job = new AllPropertiesJob("CBMC generate properties", cbmcHelper);
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (!event.getResult().isOK())
					return;

				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						viewer.setInput(((AllPropertiesJob) event.getJob()).getCBMCResults());
					}
				});
				new CheckAllPropertiesJob("Checking all properties", ((AllPropertiesJob) event.getJob()).getCBMCResults(), PropertiesView.this.cbmcHelper).schedule();
			}
		});
		job.schedule();
	}
}