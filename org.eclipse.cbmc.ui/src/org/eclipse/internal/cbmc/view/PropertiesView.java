package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.Results;
import org.eclipse.cbmc.provider.CbmcItemProviderAdapterFactory;
import org.eclipse.cbmc.util.CBMCCliHelper;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;

public class PropertiesView extends ViewPart {
	public static final String ID = "org.eclipse.cbmc.ui.view.properties"; //$NON-NLS-1$

	TreeViewer viewer;
	CheckAllPropertiesJob checkAllPropertiesJob;
	CounterPanel counterPanel;
	ProgressBar progressBar;
	private GeneratePropertiesJob generatePropertiesJob;
	Results results;
	ViewToolbar toolbar;

	/**
	 * The constructor.
	 */
	public PropertiesView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = 1;
		counterPanel = new CounterPanel(composite);
		counterPanel.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		progressBar = new ProgressBar(composite);
		progressBar.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		viewer = new TreeViewer(composite, SWT.MULTI);
		viewer.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL | GridData.GRAB_VERTICAL));

		CbmcItemProviderAdapterFactory factory = new CbmcItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));

		toolbar = new ViewToolbar(getViewSite().getActionBars().getToolBarManager());
		createContextMenu();
	}

	private void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();

		RunPropertyAction runPropertyAction = new RunPropertyAction("Run");
		menuMgr.add(runPropertyAction);
		viewer.addSelectionChangedListener(runPropertyAction);

		StopPropertyAction stopPropertyAction = new StopPropertyAction("Stop");
		menuMgr.add(stopPropertyAction);
		viewer.addSelectionChangedListener(stopPropertyAction);

		DebugTraceAction debugTraceAction = new DebugTraceAction("Analyze");
		menuMgr.add(debugTraceAction);
		viewer.addSelectionChangedListener(debugTraceAction);

		OpenEditorAction openEditorAction = new OpenEditorAction();
		viewer.addDoubleClickListener(openEditorAction);

		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
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
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						changeInput(results);
					}
				});
				if (results.getCBMCHelper().isAutoRun()) {
					checkAllPropertiesJob.schedule();
				}

			}
		});
		generatePropertiesJob.schedule();
	}

	void changeInput(Results newResults) {
		if (viewer.getTree() != null)
			viewer.getTree().deselectAll();
		viewer.setInput(newResults);
		viewer.expandAll();
		counterPanel.bind(newResults);
		progressBar.bind(newResults);
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
}
