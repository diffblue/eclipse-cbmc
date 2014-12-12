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
package org.eclipse.internal.cbmc.launcher;

import java.text.MessageFormat;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.internal.cbmc.launcher.messages"; //$NON-NLS-1$
	public static String MainLaunchingTab_name;
	public static String MainLaunchingTab_error_cbmc_isEmpty;
	public static String MainLaunchingTab_error_cbmc_notExist;
	public static String MainLaunchingTab_error_cbmc_isOldVersion;
	public static String MainLaunchingTab_error_cbmc_versionNotFound;
	public static String MainLaunchingTab_error_cbmc_compilerNotFound;
	public static String MainLaunchingTab_error_file_isEmpty;
	public static String MainLaunchingTab_error_file_notExists;
	public static String MainLaunchingTab_error_file_isNotSourceOrBinary;
	public static String MainLaunchingTab_error_file_gotoNotFound;
	public static String MainLaunchingTab_error_unwind;

	public static String MainLaunchingTab_labelCBMC;
	public static String MainLaunchingTab_labelFile;
	public static String MainLaunchingTab_showloops;
	public static String MainLaunchingTab_labelAutorun;
	public static String MainLaunchingTab_labelFunction;
	public static String MainLaunchingTab_labelOptions;
	public static String MainLaunchingTab_labelLoops;
	public static String MainLaunchingTab_labelBrowse;
	public static String MainLaunchingTab_projectsBrowse;
	public static String MainLaunchingTab_sourcesBrowse;
	public static String MainLaunchingTab_binaryBrowse;
	public static String MainLaunchingTab_labelUnwind;
	public static String MainLaunchingTab_dialogCbmc;
	public static String MainLaunchingTab_dialogProjectsTitle;
	public static String MainLaunchingTab_dialogProjectsMessage;
	public static String MainLaunchingTab_dialogSourcesTitle;
	public static String MainLaunchingTab_dialogSourcesMessage;
	public static String MainLaunchingTab_dialogBinaryTitle;
	public static String MainLaunchingTab_dialogBinaryMessage;
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
