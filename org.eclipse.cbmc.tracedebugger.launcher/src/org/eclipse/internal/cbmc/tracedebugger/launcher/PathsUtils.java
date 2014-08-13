package org.eclipse.internal.cbmc.tracedebugger.launcher;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class PathsUtils {

	public String getClasspath(Bundle b) {
		Collection<Bundle> allDependencies = new ArrayList<Bundle>();
		getDependentBundles(allDependencies);
		
		ArrayList<String> paths = new ArrayList<String>(allDependencies.size());
		for (Bundle dep : allDependencies) {
			paths.add(getURLStringOf(dep));
		}
		paths.add(getURLStringOf(b));
		StringBuffer classpath = new StringBuffer();
		int count = 0;
		for (String entry : paths) {
			classpath.append(entry);
			if (++count < paths.size())
				classpath.append(File.pathSeparatorChar);
			
		}
		return classpath.toString();
	}
	
	private void getDependentBundles(Collection<Bundle> collected) {
		collected.add(Platform.getBundle("org.eclipse.cbmc.tracedebugger"));
		collected.add(Platform.getBundle("org.eclipse.emf.ecore"));
		collected.add(Platform.getBundle("org.eclipse.emf.common"));
		collected.add(Platform.getBundle("org.eclipse.emf.ecore.xmi"));
	}

	private String getURLStringOf(Bundle b) {
		String location = b.getLocation();
		if (location.startsWith("reference:file:"))
			location = location.substring(15);
		if (location.endsWith(".jar"))
			return location;
		else
			location = location + "/bin";
		return location;
	}
	
}
