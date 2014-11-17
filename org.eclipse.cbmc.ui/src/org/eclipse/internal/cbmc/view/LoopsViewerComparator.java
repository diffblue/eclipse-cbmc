package org.eclipse.internal.cbmc.view;

import org.eclipse.cbmc.Loop;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;

public class LoopsViewerComparator extends ViewerComparator {
	private int propertyIndex;
	private static final int DESCENDING = 1;
	private int direction = DESCENDING;

	public LoopsViewerComparator() {
		this.propertyIndex = 0;
		direction = DESCENDING;
	}

	public int getDirection() {
		return direction == 1 ? SWT.DOWN : SWT.UP;
	}

	public void setColumn(int column) {
		if (column == this.propertyIndex) {
			direction = 1 - direction;
		} else {
			this.propertyIndex = column;
			direction = DESCENDING;
		}
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		Loop l1 = (Loop) e1;
		Loop l2 = (Loop) e2;
		int rc = 0;
		switch (propertyIndex) {
			case 0 :
				try {
					int i1 = (l1.getUnwind().isEmpty() ? 0 : Integer.parseInt(l1.getUnwind()));
					int i2 = (l2.getUnwind().isEmpty() ? 0 : Integer.parseInt(l2.getUnwind()));
					rc = (i1 < i2 ? -1 : 1);
				} catch (NumberFormatException e) {
					//Impossible because the setter forces the string to be an int
				}
				break;
			case 1 :
				rc = l1.getFilename().compareTo(l2.getFilename());
				break;
			case 2 :
				rc = l1.getFunction().compareTo(l2.getFunction());
				break;
			case 3 :
				rc = (l1.getLine() < l2.getLine() ? -1 : 1);
				break;
			default :
				rc = 0;
		}
		if (direction == DESCENDING) {
			rc = -rc;
		}
		return rc;
	}
}
