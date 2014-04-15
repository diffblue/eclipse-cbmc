package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.*;
import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.text.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

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
	public static final String ID = "org.eclipse.cbmc.ui.view.properties";

	private TreeViewer viewer;

	public TreeViewer getViewer() {
		return viewer;
	}

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

	public TreeViewer getTreeViewer() {
		return viewer;
	}

	public void refreshTree(Results input) {
		showBusy(true);
		viewer.setInput(input);
		viewer.refresh();
		viewer.expandAll();
		showBusy(false);
	}

}