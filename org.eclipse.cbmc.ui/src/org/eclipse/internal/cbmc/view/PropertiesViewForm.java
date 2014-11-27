package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.FrameworkUtil;

public class PropertiesViewForm extends ViewForm {

	private static final String ICONS_LIST = null;
	private static final String ICONS_ERROR = null;
	private TreeViewer viewer;

	public PropertiesViewForm(SashForm sashForm) {
		super(sashForm, SWT.NONE);
		CLabel labelPorperties = new CLabel(this, SWT.NONE);
		labelPorperties.setText(Messages.PropertiesView_sectionProperties);
		labelPorperties.setImage(getImageDescriptor(ICONS_LIST));
		setTopLeft(labelPorperties);

		Composite newComposite = new Composite(this, SWT.NONE);
		CLabel labelErrorProperties = new CLabel(newComposite, SWT.NONE);
		labelErrorProperties.setText(Messages.PropertiesView_errorProperties);
		labelErrorProperties.setImage(getImageDescriptor(ICONS_ERROR));

		viewer = new TreeViewer(newComposite, SWT.NONE);
		CbmcItemProviderAdapterFactory factory = new CbmcItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));

		setContent(newComposite);
	}

	private Image getImageDescriptor(String imageName) {
		return ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path(ICONS_LIST), null)).createImage();
	}

}
