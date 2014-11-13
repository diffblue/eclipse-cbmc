package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.FrameworkUtil;

public class CbmcView extends ViewPart {
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
		ViewForm top = new ViewForm(sashForm, SWT.NONE);

		CLabel labelPorperties = new CLabel(top, SWT.NONE);
		labelPorperties.setText(Messages.PropertiesView_5);
		labelPorperties.setImage(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/list.gif"), null)).createImage()); //$NON-NLS-1$);

		top.setTopLeft(labelPorperties);
		viewer = new TreeViewer(top, SWT.NONE);
		CbmcItemProviderAdapterFactory factory = new CbmcItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		top.setContent(viewer.getControl());

		ViewForm bottom = new ViewForm(sashForm, SWT.NONE);
		CLabel labelLoops = new CLabel(bottom, SWT.NONE);
		labelLoops.setText(Messages.PropertiesView_6);
		labelLoops.setImage(ImageDescriptor.createFromURL(FileLocator.find(FrameworkUtil.getBundle(this.getClass()), new Path("icons/list.gif"), null)).createImage()); //$NON-NLS-1$);
		bottom.setTopLeft(labelLoops);
		loopsViewer = new LoopsTableViewer(bottom);
		bottom.setContent(loopsViewer.getControl());

		sashForm.setWeights(new int[] {50, 50});

		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));

		toolbar = new ViewToolbar(getViewSite().getActionBars().getToolBarManager());
		createContextMenu();
	}

	private void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();

		RunPropertyAction runPropertyAction = new RunPropertyAction(Messages.PropertiesView_7);
		menuMgr.add(runPropertyAction);
		viewer.addSelectionChangedListener(runPropertyAction);

		StopPropertyAction stopPropertyAction = new StopPropertyAction(Messages.PropertiesView_8);
		menuMgr.add(stopPropertyAction);
		viewer.addSelectionChangedListener(stopPropertyAction);

		DebugTraceAction debugTraceAction = new DebugTraceAction(Messages.PropertiesView_9);
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

	protected Composite createProgressCountPanel(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
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
		generatePropertiesJob = new GeneratePropertiesJob(Messages.PropertiesView_1, cbmcHelper);
		generatePropertiesJob.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(final IJobChangeEvent event) {
				if (!event.getResult().isOK())
					return;
				results = ((GeneratePropertiesJob) event.getJob()).getCBMCResults();
				checkAllPropertiesJob = new CheckAllPropertiesJob(Messages.PropertiesView_2, results);
				if (results.getCBMCHelper().showLoops()) {
					generateLoopsJob = new GenerateLoopsJob(Messages.PropertiesView_4, cbmcHelper);
					generateLoopsJob.addJobChangeListener(new JobChangeAdapter() {
						@Override
						public void done(IJobChangeEvent event1) {
							results.getLoops().addAll(((GenerateLoopsJob) event1.getJob()).getLoops());
							if (results.getCBMCHelper().isAutoRun()) {
								checkAllPropertiesJob.schedule();
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
						changeInput(results);
					}
				});
			}
		});
		generatePropertiesJob.schedule();
		System.out.println("terminé");
	}

	void changeInput(Results newResults) {
		if (viewer.getTree() != null)
			viewer.getTree().deselectAll();
		viewer.setInput(newResults);
		viewer.expandAll();
		counterPanel.bind(newResults);
		progressBar.bind(newResults);
		toolbar.bind(checkAllPropertiesJob);
		loopsViewer.setInput(EMFProperties.list(CbmcPackage.Literals.RESULTS__LOOPS).observe(newResults));
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
