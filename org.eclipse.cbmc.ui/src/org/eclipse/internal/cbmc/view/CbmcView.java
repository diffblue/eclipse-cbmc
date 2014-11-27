package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.*;
import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.internal.cbmc.Activator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.FrameworkUtil;

public class CbmcView extends ViewPart {
	private static final String ICONS_LIST = "icons/list.gif"; //$NON-NLS-1$
	private static final String ICONS_ERROR = "icons/error.gif"; //$NON-NLS-1$

	public static final String ID = "org.eclipse.cbmc.ui.view.properties"; //$NON-NLS-1$

	TreeViewer viewer;
	CheckAllPropertiesJob checkAllPropertiesJob;
	CounterPanel counterPanel;
	ProgressBar progressBar;
	private GeneratePropertiesJob generatePropertiesJob;
	GenerateLoopsJob generateLoopsJob;
	Results results;
	ViewToolbar toolbar;
	LoopsTableViewer loopsViewer;
	static final int VIEW_ORIENTATION_VERTICAL = 0;
	static final int VIEW_ORIENTATION_HORIZONTAL = 1;
	static final int VIEW_ORIENTATION_AUTOMATIC = 2;

	private Composite parent;
	private Composite counterComposite;
	private SashForm sashForm;
	private int currentOrientation;
	CLabel labelLoops;
	CLabel labelErrorProperties;
	CLabel labelErrorLoops;

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
		createPropertiesForm();
		createLoopsForm();
		sashForm.setWeights(new int[] {50, 50});
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		toolbar = new ViewToolbar(getViewSite().getActionBars().getToolBarManager());
		createContextMenu();
	}

	private void createPropertiesForm() {
		ViewForm propertiesWebForm = new ViewForm(sashForm, SWT.NONE);

		CLabel labelPorperties = new CLabel(propertiesWebForm, SWT.NONE);
		labelPorperties.setText(Messages.PropertiesView_sectionProperties);
		labelPorperties.setImage(getImageDescriptor(ICONS_LIST));
		propertiesWebForm.setTopLeft(labelPorperties);

		Composite composite = new Composite(propertiesWebForm, SWT.NONE);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		gridData.horizontalSpan = 1;
		composite.setLayout(new GridLayout());

		labelErrorProperties = new CLabel(composite, SWT.NONE);
		labelErrorProperties.setImage(getImageDescriptor(ICONS_ERROR));
		hideErrorMessage(labelErrorProperties);

		viewer = new TreeViewer(composite, SWT.NONE);
		CbmcItemProviderAdapterFactory factory = new CbmcItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		propertiesWebForm.setContent(composite);
	}

	private void createLoopsForm() {
		ViewForm loopsViewForm = new ViewForm(sashForm, SWT.NONE);
		labelLoops = new CLabel(loopsViewForm, SWT.NONE);
		labelLoops.setText(Messages.PropertiesView_sectionLoopsNo);
		labelLoops.setImage(getImageDescriptor(ICONS_LIST));
		loopsViewForm.setTopLeft(labelLoops);

		Composite composite = new Composite(loopsViewForm, SWT.NONE);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		gridData.horizontalSpan = 1;
		composite.setLayout(new GridLayout());

		labelErrorLoops = new CLabel(composite, SWT.NONE);
		labelErrorLoops.setImage(getImageDescriptor(ICONS_ERROR));
		hideErrorMessage(labelErrorLoops);
		loopsViewer = new LoopsTableViewer(composite);
		loopsViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		loopsViewForm.setContent(composite);
	}

	private void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();

		RunPropertyAction runPropertyAction = new RunPropertyAction(Messages.PropertiesView_actionRun);
		menuMgr.add(runPropertyAction);
		viewer.addSelectionChangedListener(runPropertyAction);

		StopPropertyAction stopPropertyAction = new StopPropertyAction(Messages.PropertiesView_actionStop);
		menuMgr.add(stopPropertyAction);
		viewer.addSelectionChangedListener(stopPropertyAction);

		DebugTraceAction debugTraceAction = new DebugTraceAction(Messages.PropertiesView_actionDebug);
		menuMgr.add(debugTraceAction);
		viewer.addSelectionChangedListener(debugTraceAction);

		OpenEditorAction openEditorAction = new OpenEditorAction();
		viewer.addDoubleClickListener(openEditorAction);
		loopsViewer.addDoubleClickListener(openEditorAction);

		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
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
				if (results == null || !results.getErrorMessage().isEmpty()) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							if (results == null || !(results.getErrorMessage().isEmpty())) {
								showErrorMessage(labelErrorProperties, Messages.format(Messages.PropertiesView_errorProperties, new String[] {results == null ? " see Error Log view" : results.getErrorMessage()}));
							}
						}
					});
					return;
				}
				checkAllPropertiesJob = new CheckAllPropertiesJob(Messages.PropertiesView_jobCheckingAllProperties, results);
				if (results.getCBMCHelper().showLoops()) {
					generateLoopsJob = new GenerateLoopsJob(Messages.PropertiesView_jobGenerateLoops, cbmcHelper);
					generateLoopsJob.addJobChangeListener(new JobChangeAdapter() {
						@Override
						public void done(IJobChangeEvent event1) {
							if (event1.getJob().getResult().isOK()) {
								final LoopResults loopResults = ((GenerateLoopsJob) event1.getJob()).getLoopResults();
								if (loopResults == null || !loopResults.getErrorMessage().isEmpty()) {
									Display.getDefault().asyncExec(new Runnable() {
										public void run() {
											showErrorMessage(labelErrorLoops, Messages.format(Messages.PropertiesView_errorLoops, new String[] {loopResults == null ? " See Error Log view" : loopResults.getErrorMessage()}));
										}
									});
								} else {
									results.getLoopResults().getLoops().addAll(loopResults.getLoops());
									Display.getDefault().asyncExec(new Runnable() {
										public void run() {
											changeLoopInput();
										}
									});
								}
								if (results.getCBMCHelper().isAutoRun()) {
									checkAllPropertiesJob.schedule();
								}
							}
						}
					});
					generateLoopsJob.schedule();
				} else {
					if (results.getCBMCHelper().isAutoRun()) {
						checkAllPropertiesJob.schedule();
					}
				}
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						changeInput();
					}
				});
			}
		});
		generatePropertiesJob.schedule();
	}

	private void reset() {

		hideErrorMessage(labelErrorProperties);
		hideErrorMessage(labelErrorLoops);
		results = null;
		viewer.setInput(null);
		counterPanel.reset();
		progressBar.reset();
		toolbar.reset();
		loopsViewer.setInput(null);
	}

	void changeLoopInput() {
		labelLoops.setText(Messages.format(Messages.PropertiesView_sectionLoopsYes, new String[] {Integer.toString(results.getLoopResults().getLoops().size())}));
		loopsViewer.setInput(EMFProperties.list(CbmcPackage.Literals.LOOP_RESULTS__LOOPS).observe(results.getLoopResults()));
	}

	void changeInput() {
		if (viewer.getTree() != null)
			viewer.getTree().deselectAll();
		viewer.setInput(results);
		viewer.expandAll();
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

	private Image getImageDescriptor(String imageName) {
		return ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path(imageName), null)).createImage();
	}

	void showErrorMessage(CLabel label, String message) {
		Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, null));
		label.setText(message);
		label.setVisible(true);
		label.getParent().pack();
	}

	private void hideErrorMessage(CLabel label) {
		label.setText(""); //$NON-NLS-1$
		label.setVisible(false);
		label.getParent().pack();
	}
}
