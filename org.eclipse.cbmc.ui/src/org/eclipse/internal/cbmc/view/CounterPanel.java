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
import org.eclipse.cbmc.Results;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.osgi.framework.FrameworkUtil;

/**
 * A panel with counters for the number of Runs, Errors and Failures.
 */
public class CounterPanel extends Composite {

	protected Text fNumberOfSuccess;
	protected Text fNumberOfFailures;
	protected Text fNumberOfErrors;
	protected Text fNumberOfRuns;
	protected int runsCount;
	private int totalCount;
	private final Image fSuccessIcon = ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/success_ovr.gif"), null)).createImage(); //$NON-NLS-1$
	private final Image fFailureIcon = ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/failure_ovr.gif"), null)).createImage(); //$NON-NLS-1$
	private final Image fErrorIcon = ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/error_ovr.gif"), null)).createImage(); //$NON-NLS-1$
	private DataBindingContext bindingContext;

	public CounterPanel(Composite parent) {
		super(parent, SWT.WRAP);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 12;
		gridLayout.makeColumnsEqualWidth = false;
		gridLayout.marginWidth = 0;
		setLayout(gridLayout);

		runsCount = 0;
		totalCount = 0;
		fNumberOfRuns = createLabel(Messages.CounterPanel_runs, null);
		fNumberOfSuccess = createLabel(Messages.CounterPanel_success, fSuccessIcon);
		fNumberOfFailures = createLabel(Messages.CounterPanel_failures, fFailureIcon);
		fNumberOfErrors = createLabel(Messages.CounterPanel_errors, fErrorIcon);
		initialize();
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				disposeIcons();
			}
		});
	}

	private void initialize() {
		fNumberOfRuns.setText("0/0"); //$NON-NLS-1$
		fNumberOfSuccess.setText(" 0 "); //$NON-NLS-1$
		fNumberOfFailures.setText(" 0 "); //$NON-NLS-1$
		fNumberOfErrors.setText(" 0 "); //$NON-NLS-1$

	}

	private void disposeIcons() {
		if (fSuccessIcon != null)
			fSuccessIcon.dispose();
		if (fFailureIcon != null)
			fFailureIcon.dispose();
		if (fFailureIcon != null)
			fFailureIcon.dispose();
		if (fErrorIcon != null)
			fErrorIcon.dispose();
	}

	private Text createLabel(String name, Image image) {
		Label label = new Label(this, SWT.NONE);
		if (image != null) {
			image.setBackground(label.getBackground());
			label.setImage(image);
		}
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		label = new Label(this, SWT.NONE);
		label.setText(name);
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		Text value = new Text(this, SWT.READ_ONLY);
		value.setBackground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		value.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING));
		return value;
	}

	public void setRunValue() {
		String runString = Messages.format(Messages.CounterPanel_runsdone, new String[] {Integer.toString(runsCount), Integer.toString(totalCount)});
		fNumberOfRuns.setText(runString);
	}

	public void reset() {
		initialize();
		bindingContext = null;
	}

	public void bind(final Results results) {
		if (bindingContext != null)
			bindingContext.dispose();

		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new IConverter() {

			@Override
			public Object getToType() {
				return String.class;
			}

			@Override
			public Object getFromType() {
				return Integer.class;
			}

			@Override
			public Object convert(Object fromObject) {
				return ((Integer) fromObject).toString();
			}
		});
		bindingContext = new DataBindingContext();
		bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(fNumberOfSuccess), EMFProperties.value(CbmcPackage.Literals.RESULTS__SUCCEEDED_COUNT).observe(results), null, strategy);
		bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(fNumberOfFailures), EMFProperties.value(CbmcPackage.Literals.RESULTS__FAILED_COUNT).observe(results), null, strategy);
		bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(fNumberOfErrors), EMFProperties.value(CbmcPackage.Literals.RESULTS__ERROR_COUNT).observe(results), null, strategy);
		UpdateValueStrategy strategy2 = new UpdateValueStrategy();
		strategy2.setConverter(new IConverter() {

			@Override
			public Object getToType() {
				return String.class;
			}

			@Override
			public Object getFromType() {
				return Integer.class;
			}

			@Override
			public Object convert(Object fromObject) {
				return Messages.format(Messages.CounterPanel_runsdone, new String[] {Integer.toString(((Integer) fromObject)), Integer.toString(results.getProperties().size())});
			}
		});
		bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(fNumberOfRuns), EMFProperties.value(CbmcPackage.Literals.RESULTS__RUN_COUNT).observe(results), null, strategy2);

	}

	public void dispose() {
		if (bindingContext != null)
			bindingContext.dispose();
		disposeIcons();
	}
}
