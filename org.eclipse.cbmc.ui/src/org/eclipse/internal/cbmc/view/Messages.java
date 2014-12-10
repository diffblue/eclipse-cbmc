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

import java.text.MessageFormat;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.internal.cbmc.view.messages"; //$NON-NLS-1$

	public static String PropertiesViewForm_helpMessage;

	public static String CheckPropertyJob_errorExitValue0;
	public static String CheckPropertyJob_errorExitValue1;
	public static String CheckPropertyJob_errorExitValue2;
	public static String CheckPropertyJob_errorExitValue3;

	public static String CounterPanel_runs;
	public static String CounterPanel_success;
	public static String CounterPanel_failures;
	public static String CounterPanel_errors;
	public static String CounterPanel_runsdone;

	public static String LoopsTableViewer_headerUnwind;
	public static String LoopsTableViewer_headerFile;
	public static String LoopsTableViewer_headerFunction;
	public static String LoopsTableViewer_headerLine;

	public static String LoopsViewForm_sectionLoops;
	public static String LoopsViewForm_helpMessage;
	public static String LoopsViewForm_infoMessage;

	public static String PropertiesView_jobGenerateAllProperties;
	public static String PropertiesView_jobCheckingAllProperties;
	public static String PropertiesViewForm_actionRun;
	public static String PropertiesView_jobGenerateLoops;
	public static String PropertiesViewForm_sectionProperties;

	public static String PropertiesViewForm_errorMessage;
	public static String PropertiesView_errorLoops;

	public static String PropertiesViewForm_actionStop;
	public static String PropertiesViewForm_actionDebug;
	public static String PropertiesView_actionPause;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

	public static String format(String message, Object[] objects) {
		return MessageFormat.format(message, objects);
	}
}
