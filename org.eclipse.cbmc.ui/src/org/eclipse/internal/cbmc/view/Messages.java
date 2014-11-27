package org.eclipse.internal.cbmc.view;

import java.text.MessageFormat;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.internal.cbmc.view.messages"; //$NON-NLS-1$

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

	public static String PropertiesView_jobGenerateAllProperties;
	public static String PropertiesView_jobCheckingAllProperties;
	public static String PropertiesView_actionRun;
	public static String PropertiesView_jobGenerateLoops;
	public static String PropertiesView_sectionProperties;
	public static String PropertiesView_sectionLoopsYes;
	public static String PropertiesView_sectionLoopsNo;

	public static String PropertiesView_errorProperties;
	public static String PropertiesView_errorLoops;

	public static String PropertiesView_actionStop;
	public static String PropertiesView_actionDebug;
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
