package org.eclipse.internal.cbmc.view;

import java.text.MessageFormat;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.internal.cbmc.view.messages"; //$NON-NLS-1$
	public static String CBMC_execution_error;
	public static String CounterPanel_label_runs;
	public static String CounterPanel_label_failures;
	public static String CounterPanel_label_errors;
	public static String CounterPanel_label_success;
	public static String CounterPanel_runcount;
	public static String CounterPanel_runcount_ignored_assumptionsFailed;
	public static String CounterPanel_runcount_assumptionsFailed;
	public static String CounterPanel_runcount_ignored;
	public static String CounterPanel_runcount_skipped;
	public static String PropertiesView_0;
	public static String PropertiesView_1;
	public static String PropertiesView_2;
	public static String PropertiesView_3;
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
