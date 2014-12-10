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
package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

public class PathsUtils {

	public String getClasspath() {
		ArrayList<String> paths = new ArrayList<String>();
		for (String dep : getDependentBundles()) {
			paths.add(getURLStringOf(dep));
		}
		StringBuffer classpath = new StringBuffer();
		int count = 0;
		for (String entry : paths) {
			classpath.append(entry);
			if (++count < paths.size())
				classpath.append(File.pathSeparatorChar);

		}
		return classpath.toString();
	}

	private Collection<String> getDependentBundles() {
		Collection<String> allDependencies = new ArrayList<String>();
		allDependencies.add("org.eclipse.cbmc.tracedebugger");
		allDependencies.add("org.eclipse.emf.ecore");
		allDependencies.add("org.eclipse.emf.common");
		allDependencies.add("org.eclipse.emf.ecore.xmi");
		allDependencies.add("org.kohsuke.args4j");
		return allDependencies;
	}

	private String getURLStringOf(String bundle) {
		String location = "";
		URL url = FileLocator.find(Platform.getBundle(bundle), new org.eclipse.core.runtime.Path("/"), null);
		if (url != null) {
			try {
				location = FileLocator.resolve(url).toExternalForm();
			} catch (IOException e) {
				return null;
			}
		}
		if (location.startsWith("jar:file:")) {
			location = location.substring(9, location.length() - 2);
		} else if (location.startsWith("file:")) {
			location = location.substring(5) + "/bin";
		}
		return location;
	}
}
