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

import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.LoopResults;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class LoopsViewForm extends CbmcViewForm {

	private LoopsTableViewer viewer;

	public LoopsViewForm(Composite parent, int style) {
		super(parent, style, Messages.LoopsViewForm_sectionLoops);
		viewer = new LoopsTableViewer(getViewerComposite());
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		viewer.addDoubleClickListener(new OpenEditorAction());
		showHelpMessage(Messages.LoopsViewForm_helpMessage);
	}

	public void bind(LoopResults loopResults) {
		if (!loopResults.getErrorMessage().isEmpty()) {
			showErrorMessage(Messages.format(Messages.PropertiesView_errorLoops, new String[] {loopResults.getErrorMessage()}));
			return;
		}
		viewer.setInput(EMFProperties.list(CbmcPackage.Literals.LOOP_RESULTS__LOOPS).observe(loopResults));
		showInfoMessage(Messages.format(Messages.LoopsViewForm_infoMessage, new String[] {Integer.toString(loopResults.getLoops().size())}));
	}

	public void reset() {
		hideMessage();
		viewer.setInput(null);
	}

}
