/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.internal.cbmc.view;

import java.util.HashMap;
import org.eclipse.cbmc.Loop;
import org.eclipse.cbmc.Property;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.internal.cbmc.Activator;
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
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, org.eclipse.internal.cbmc.Activator.PLUGIN_ID, "Problem opening editor", e)); //$NON-NLS-1$
				return;
			}
		}
	}
}
