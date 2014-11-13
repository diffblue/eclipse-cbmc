package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.CbmcPackage;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;

public class LoopsTableViewer extends TableViewer {

	LoopsViewerComparator comparator;
	private ObservableListContentProvider cp;

	public LoopsTableViewer(Composite parent) {
		super(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		init();
	}

	private void init() {
		cp = new ObservableListContentProvider();
		this.getTable().setHeaderVisible(true);
		createTableViewerColumn(CbmcPackage.Literals.LOOP__UNWIND, Messages.LoopsTableViewer_0, 80, 0, true);
		createTableViewerColumn(CbmcPackage.Literals.LOOP__FILENAME, Messages.LoopsTableViewer_1, 80, 1, false);
		createTableViewerColumn(CbmcPackage.Literals.LOOP__FUNCTION, Messages.LoopsTableViewer_2, 80, 2, false);
		createTableViewerColumn(CbmcPackage.Literals.LOOP__LINE, Messages.LoopsTableViewer_3, 80, 3, false);
		comparator = new LoopsViewerComparator();
		setComparator(comparator);
		setContentProvider(cp);
	}

	private TableViewerColumn createTableViewerColumn(EAttribute attribute, String title, int bound, final int colNumber, boolean editingSupport) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(this, SWT.LEFT);
		viewerColumn.setLabelProvider(new ObservableMapCellLabelProvider(EMFProperties.value(FeaturePath.fromList(attribute)).observeDetail(cp.getKnownElements())));
		if (editingSupport) {
			viewerColumn.setEditingSupport(new LoopsViewerEditingSupport(this));
		}
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		column.addSelectionListener(getSelectionAdapter(column, colNumber));
		return viewerColumn;
	}

	private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
		final TableViewer viewer = this;
		SelectionAdapter selectionAdapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				comparator.setColumn(index);
				int dir = comparator.getDirection();
				viewer.getTable().setSortDirection(dir);
				viewer.getTable().setSortColumn(column);
				viewer.refresh();
			}
		};
		return selectionAdapter;
	}
}
