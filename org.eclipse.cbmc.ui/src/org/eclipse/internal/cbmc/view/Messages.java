package org.eclipse.internal.cbmc.view;

import java.text.MessageFormat;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.internal.cbmc.view.messages"; //$NON-NLS-1$

	public static String CheckPropertyJob_errorExitValue0;

	public static String CheckPropertyJob_errorExitValue1;

	public static String CheckPropertyJob_errorExitValue2;

	public static String CheckPropertyJob_errorExitValue3;

	public static String CounterPanel_0;
	public static String CounterPanel_1;
	public static String CounterPanel_2;
	public static String CounterPanel_3;
	public static String CounterPanel_4;

	public static String LoopsTableViewer_0;
	public static String LoopsTableViewer_1;
	public static String LoopsTableViewer_2;
	public static String LoopsTableViewer_3;

	public static String PauseAction_0;

	public static String PropertiesView_0;
	public static String PropertiesView_1;
	public static String PropertiesView_2;
	public static String PropertiesView_3;
	public static String PropertiesView_4;
	public static String PropertiesView_5;
	public static String PropertiesView_6;
	public static String PropertiesView_7;
	public static String PropertiesView_8;
	public static String PropertiesView_9;

	public static String RunAction_0;
	public static String StopAction_0;

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
