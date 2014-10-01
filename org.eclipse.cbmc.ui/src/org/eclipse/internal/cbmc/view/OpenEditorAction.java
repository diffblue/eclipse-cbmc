package org.eclipse.internal.cbmc.view;

import java.util.HashMap;
import org.eclipse.cbmc.Property;
import org.eclipse.cbmc.PropertyStatus;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class OpenEditorAction implements IDoubleClickListener {

	@Override
	public void doubleClick(DoubleClickEvent event) {
		final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		if (selection != null && !selection.isEmpty() && selection.getFirstElement() instanceof Property) {
			Property selectedProperty = (Property) selection.getFirstElement();
			if (selectedProperty.getStatus() == PropertyStatus.FAILED) {
				Path path = new Path(selectedProperty.getFile().getName());
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put(IMarker.LINE_NUMBER, selectedProperty.getLine());
				IMarker marker;
				try {
					marker = file.createMarker(IMarker.TEXT);
					marker.setAttributes(map);
					IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), marker);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}
