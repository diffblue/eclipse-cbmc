package org.eclipse.internal.cbmc.view;

import java.util.HashMap;
import org.eclipse.cbmc.Loop;
import org.eclipse.cbmc.Property;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class OpenEditorAction implements IDoubleClickListener {

	private IFile file;

	@Override
	public void doubleClick(DoubleClickEvent event) {
		file = null;
		int line = 0;
		final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof Property) {
			Property selectedProperty = (Property) selection.getFirstElement();
			Path path = new Path(selectedProperty.getFile().getName());
			file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
			line = selectedProperty.getLine();
		} else if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof Loop) {
			Loop selectedLoop = (Loop) selection.getFirstElement();
			Path path = new Path(selectedLoop.getPath());
			file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
			line = selectedLoop.getLine();
		}

		if (file != null) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put(IMarker.LINE_NUMBER, line);
			IMarker marker;
			try {
				marker = file.createMarker(IMarker.TEXT);
				marker.setAttributes(map);
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), marker);
				marker.delete();
			} catch (CoreException e) {
				ErrorDialog.openError(null, "Open editor failed", "A problem occurred opening the editor associated with this property.", new Status(IStatus.ERROR, org.eclipse.internal.cbmc.Activator.PLUGIN_ID, "Problem opening editor", e)); //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
				return;
			}
		}
	}
}
