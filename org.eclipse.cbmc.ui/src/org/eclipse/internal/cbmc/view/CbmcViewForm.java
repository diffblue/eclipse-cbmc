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

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.FrameworkUtil;

public abstract class CbmcViewForm extends ViewForm {
	private CLabel label;
	private CLabel message;

	private Composite viewerComposite;
	private static final String ICONS_LIST = "icons/list.gif"; //$NON-NLS-1$
	private static final String ICONS_ERROR = "icons/error.gif"; //$NON-NLS-1$
	private static final String ICONS_INFO = "icons/info.gif"; //$NON-NLS-1$
	private static final String ICONS_HELP = "icons/help.gif"; //$NON-NLS-1$

	public CbmcViewForm(Composite parent, int style, String title) {
		super(parent, style);
		label = new CLabel(this, SWT.NONE);
		label.setText(title);
		label.setImage(getImageDescriptor(ICONS_LIST));
		setTopLeft(label);

		viewerComposite = new Composite(this, SWT.NONE);
		viewerComposite.setLayout(new GridLayout());

		Composite messageComposite = new Composite(viewerComposite, SWT.NONE);
		messageComposite.setLayout(new GridLayout());
		message = new CLabel(messageComposite, SWT.NONE);
		message.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		setContent(viewerComposite);
	}

	protected Composite getViewerComposite() {
		return viewerComposite;
	}

	private Image getImageDescriptor(String imageName) {
		return ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path(imageName), null)).createImage();
	}

	protected void showErrorMessage(String errorMessage) {
		showMessage(ICONS_ERROR, errorMessage);
	}

	protected void showInfoMessage(String infoMessage) {
		showMessage(ICONS_INFO, infoMessage);
	}

	protected void showHelpMessage(String infoMessage) {
		showMessage(ICONS_HELP, infoMessage);
	}

	private void showMessage(String image, String msg) {
		message.setText(msg);
		message.setImage(getImageDescriptor(image));
		message.setVisible(true);
		message.getParent().pack();
	}

	protected void hideMessage() {
		message.setText(""); //$NON-NLS-1$
		message.setImage(null);
		message.setVisible(false);
		message.getParent().pack();
	}

}
