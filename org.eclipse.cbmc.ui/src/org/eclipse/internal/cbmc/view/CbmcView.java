package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.LoopResults;
import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

public class CbmcView extends ViewPart {

	public static final String ID = "org.eclipse.cbmc.ui.view.properties"; //$NON-NLS-1$
	CheckAllPropertiesJob checkAllPropertiesJob;
	CounterPanel counterPanel;
	ProgressBar progressBar;
	private GeneratePropertiesJob generatePropertiesJob;
	GenerateLoopsJob generateLoopsJob;
	Results results;
	ViewToolbar toolbar;
	static final int VIEW_ORIENTATION_VERTICAL = 0;
	static final int VIEW_ORIENTATION_HORIZONTAL = 1;
	static final int VIEW_ORIENTATION_AUTOMATIC = 2;

	private Composite parent;
	private Composite counterComposite;
	private SashForm sashForm;
	private int currentOrientation;
	private PropertiesViewForm propertiesViewForm;
	private LoopsViewForm loopsViewForm;

	/**
	 * The constructor.
	 */
	public CbmcView() {
	}

	public void createPartControl(Composite p) {
		this.parent = p;
		addResizeListener(p);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 4;
		gridLayout.marginHeight = 4;
		p.setLayout(gridLayout);

		counterComposite = createProgressCountPanel(p);
		counterComposite.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		sashForm = new SashForm(p, SWT.VERTICAL);

		propertiesViewForm = new PropertiesViewForm(sashForm, SWT.NONE);
		loopsViewForm = new LoopsViewForm(sashForm, SWT.NONE);

		sashForm.setWeights(new int[] {50, 50});
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		toolbar = new ViewToolbar(getViewSite().getActionBars().getToolBarManager());
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//		viewer.getControl().setFocus();
	}

	protected Composite createProgressCountPanel(Composite p) {
		Composite composite = new Composite(p, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		setCounterColumns(layout);

		counterPanel = new CounterPanel(composite);
		counterPanel.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		progressBar = new ProgressBar(composite);
		progressBar.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		return composite;
	}

	public void startVerification(final CBMCCliHelper cbmcHelper) {
		reset();
		generatePropertiesJob = new GeneratePropertiesJob(Messages.PropertiesView_jobGenerateAllProperties, cbmcHelper);
		generatePropertiesJob.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (!event.getResult().isOK())
					return;
				results = ((GeneratePropertiesJob) event.getJob()).getCBMCResults();
				checkAllPropertiesJob = new CheckAllPropertiesJob(Messages.PropertiesView_jobCheckingAllProperties, results);
				if (results.getErrorMessage().isEmpty() && cbmcHelper.showLoops()) {
					generateLoopsJob = new GenerateLoopsJob(Messages.PropertiesView_jobGenerateLoops, cbmcHelper);
					generateLoopsJob.addJobChangeListener(new JobChangeAdapter() {
						@Override
						public void done(IJobChangeEvent event1) {
							if (!event1.getResult().isOK())
								return;
							final LoopResults loopResults = ((GenerateLoopsJob) event1.getJob()).getLoopResults();
							results.setLoopResults(loopResults);
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									bindLoops();
								}
							});
							if (cbmcHelper.isAutoRun()) {
								checkAllPropertiesJob.schedule();
							}
						}
					});
					generateLoopsJob.schedule();
				} else {
					if (cbmcHelper.isAutoRun()) {
						checkAllPropertiesJob.schedule();
					}
				}
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						bindProperties();
					}
				});
			}
		});
		generatePropertiesJob.schedule();
	}

	private void reset() {
		results = null;
		counterPanel.reset();
		progressBar.reset();
		toolbar.reset();
		propertiesViewForm.reset();
		loopsViewForm.reset();
	}

	void bindLoops() {
		loopsViewForm.bind(results.getLoopResults());
	}

	void bindProperties() {
		propertiesViewForm.bind(results);
		counterPanel.bind(results);
		progressBar.bind(results);
		toolbar.bind(checkAllPropertiesJob);
	}

	@Override
	public void dispose() {
		super.dispose();
		if (counterPanel != null)
			counterPanel.dispose();
		if (progressBar != null)
			progressBar.dispose();
	}

	private void addResizeListener(Composite parent1) {
		parent1.addControlListener(new ControlListener() {
			public void controlMoved(ControlEvent e) {
				//Nothing to do
			}

			public void controlResized(ControlEvent e) {
				computeOrientation();
			}
		});
	}

	void computeOrientation() {
		Point size = parent.getSize();
		if (size.x != 0 && size.y != 0) {
			if (size.x > size.y)
				setOrientation(VIEW_ORIENTATION_HORIZONTAL);
			else
				setOrientation(VIEW_ORIENTATION_VERTICAL);
		}
	}

	private void setOrientation(int orientation) {
		if ((sashForm == null) || sashForm.isDisposed())
			return;
		boolean horizontal = orientation == VIEW_ORIENTATION_HORIZONTAL;
		sashForm.setOrientation(horizontal ? SWT.HORIZONTAL : SWT.VERTICAL);
		currentOrientation = orientation;
		GridLayout layout = (GridLayout) counterComposite.getLayout();
		setCounterColumns(layout);
		parent.layout();
	}

	private void setCounterColumns(GridLayout layout) {
		if (currentOrientation == VIEW_ORIENTATION_HORIZONTAL)
			layout.numColumns = 2;
		else
			layout.numColumns = 1;
	}
}
