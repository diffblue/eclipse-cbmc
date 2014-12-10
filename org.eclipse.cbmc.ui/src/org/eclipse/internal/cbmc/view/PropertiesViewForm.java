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

import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;

public class PropertiesViewForm extends CbmcViewForm {

	private TreeViewer viewer;

	public PropertiesViewForm(Composite parent, int style) {
		super(parent, style, Messages.PropertiesViewForm_sectionProperties);
		viewer = new TreeViewer(getViewerComposite(), SWT.NONE);
		CbmcItemProviderAdapterFactory factory = new CbmcItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		createContextMenu();
		showHelpMessage(Messages.PropertiesViewForm_helpMessage);
	}

	private void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();

		RunPropertyAction runPropertyAction = new RunPropertyAction(Messages.PropertiesViewForm_actionRun);
		menuMgr.add(runPropertyAction);
		viewer.addSelectionChangedListener(runPropertyAction);

		StopPropertyAction stopPropertyAction = new StopPropertyAction(Messages.PropertiesViewForm_actionStop);
		menuMgr.add(stopPropertyAction);
		viewer.addSelectionChangedListener(stopPropertyAction);

		DebugTraceAction debugTraceAction = new DebugTraceAction(Messages.PropertiesViewForm_actionDebug);
		menuMgr.add(debugTraceAction);
		viewer.addSelectionChangedListener(debugTraceAction);

		viewer.addDoubleClickListener(new OpenEditorAction());

		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
	}

	public void reset() {
		hideMessage();
		viewer.getTree().deselectAll();
		viewer.setInput(null);
	}

	public void bind(Results results) {
		if (!results.getErrorMessage().isEmpty()) {
			showErrorMessage(Messages.format(Messages.PropertiesViewForm_errorMessage, new String[] {results.getErrorMessage()}));
			return;
		}
		if (viewer.getTree() != null)
			viewer.getTree().deselectAll();
		viewer.setInput(results);
		viewer.expandAll();
	}
}
