package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.Results;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

/**
 * A progress bar with a red/green indication for success or failure.
 */
public class ProgressBar extends Canvas {
	private static final int DEFAULT_WIDTH = 160;
	private static final int DEFAULT_HEIGHT = 18;

	int fCurrentTickCount = 0;
	private int fMaxTickCount = 0;
	int fColorBarWidth = 0;

	public int getfColorBarWidth() {
		return fColorBarWidth;
	}

	public void setfColorBarWidth(int fColorBarWidth) {
		this.fColorBarWidth = fColorBarWidth;
		redraw();
	}

	Color fOKColor;
	Color fFailureColor;
	Color fStoppedColor;
	boolean fError;

	private boolean fStopped = false;
	private Text fNumberOfRuns;
	private DataBindingContext bindingContext;

	public ProgressBar(Composite parent) {
		super(parent, SWT.NONE);
		fNumberOfRuns = new Text(parent, SWT.NONE);
		fNumberOfRuns.setVisible(false);
		addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				fColorBarWidth = scale(fCurrentTickCount);
				redraw();
			}
		});
		addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {
				paint(e);
			}
		});
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				fFailureColor.dispose();
				fOKColor.dispose();
				fStoppedColor.dispose();
			}
		});
		Display display = parent.getDisplay();
		fFailureColor = new Color(display, 159, 63, 63);
		fOKColor = new Color(display, 95, 191, 95);
		fStoppedColor = new Color(display, 120, 120, 120);
	}

	public void setMaximum(int max) {
		fMaxTickCount = max;
	}

	public void reset() {
		fError = false;
		fStopped = false;
		fCurrentTickCount = 0;
		fMaxTickCount = 0;
		fColorBarWidth = 0;
		redraw();
	}

	private void setStatusColor(GC gc) {
		if (fStopped)
			gc.setBackground(fStoppedColor);
		else if (fError)
			gc.setBackground(fFailureColor);
		else
			gc.setBackground(fOKColor);
	}

	public void stopped() {
		fStopped = true;
		redraw();
	}

	int scale(int value) {
		if (fMaxTickCount > 0) {
			Rectangle r = getClientArea();
			if (r.width != 0)
				return Math.max(0, value * (r.width - 2) / fMaxTickCount);
		}
		return value;
	}

	private void drawBevelRect(GC gc, int x, int y, int w, int h, Color topleft, Color bottomright) {
		gc.setForeground(topleft);
		gc.drawLine(x, y, x + w - 1, y);
		gc.drawLine(x, y, x, y + h - 1);

		gc.setForeground(bottomright);
		gc.drawLine(x + w, y, x + w, y + h);
		gc.drawLine(x, y + h, x + w, y + h);
	}

	void paint(PaintEvent event) {
		GC gc = event.gc;
		Display disp = getDisplay();

		Rectangle rect = getClientArea();
		gc.fillRectangle(rect);
		drawBevelRect(gc, rect.x, rect.y, rect.width - 1, rect.height - 1, disp.getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW), disp.getSystemColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));

		setStatusColor(gc);
		fColorBarWidth = Math.min(rect.width - 2, fColorBarWidth);
		gc.fillRectangle(1, 1, fColorBarWidth, rect.height - 2);
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean changed) {
		checkWidget();
		Point size = new Point(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		if (wHint != SWT.DEFAULT)
			size.x = wHint;
		if (hHint != SWT.DEFAULT)
			size.y = hHint;
		return size;
	}

	public void refresh(boolean hasErrors) {
		fError = hasErrors;
		redraw();
	}

	public void bind(final Results results) {
		if (bindingContext != null)
			bindingContext.dispose();

		if (results == null)
			return;

		fMaxTickCount = results.getProperties().size();
		bindingContext = new DataBindingContext();
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new IConverter() {

			@Override
			public Object getToType() {
				return Integer.class;
			}

			@Override
			public Object getFromType() {
				return Integer.class;
			}

			@Override
			public Object convert(Object fromObject) {
				fError = results.getErrorCount() + results.getFailedCount() > 0;
				fCurrentTickCount = (Integer) fromObject;
				return scale((Integer) fromObject);
			}
		});
		bindingContext.bindValue(PojoProperties.value("fColorBarWidth").observe(this), EMFProperties.value(CbmcPackage.Literals.RESULTS__RUN_COUNT).observe(results), null, strategy); //$NON-NLS-1$
	}

	public void dispose() {
		if (bindingContext != null)
			bindingContext.dispose();
	}
}
