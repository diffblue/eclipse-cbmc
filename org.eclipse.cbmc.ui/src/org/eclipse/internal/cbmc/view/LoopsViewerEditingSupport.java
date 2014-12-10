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

import org.eclipse.cbmc.Loop;
import org.eclipse.jface.viewers.*;

public class LoopsViewerEditingSupport extends EditingSupport {

	private final CellEditor editor;

	public LoopsViewerEditingSupport(ColumnViewer viewer) {
		super(viewer);
		this.editor = new TextCellEditor(((LoopsTableViewer) viewer).getTable());
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		return ((Loop) element).getUnwind();
	}

	@Override
	protected void setValue(Object element, Object value) {
		((Loop) element).setUnwind((String) value);
		getViewer().update(element, null);
	}
}
