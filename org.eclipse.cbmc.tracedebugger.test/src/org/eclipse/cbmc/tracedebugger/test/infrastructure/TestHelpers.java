package org.eclipse.cbmc.tracedebugger.test.infrastructure;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;

public class TestHelpers {
	public static File getTestData(String message, String entry) {
		if (entry == null)
			Assert.fail(message + " entry is null.");
		URL base = Activator.getContext().getBundle().getEntry(entry);
		if (base == null)
			Assert.fail(message + " entry not found in bundle: " + entry);
		try {
			return toFile(message, base);
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
		// avoid compile error... should never reach this code
		return null;
	}

	public static File toFile(String message, URL base) throws IOException {
		String osPath = new Path(FileLocator.toFileURL(base).getPath()).toOSString();
		File result = new File(osPath);
		if (!result.getCanonicalPath().equals(result.getPath()))
			Assert.fail(message + " result path: " + result.getPath() + " does not match canonical path: " + result.getCanonicalFile().getPath());
		return result;
	}

	/*
	 * Copy
	 * - if we have a file, then copy the file
	 * - if we have a directory then merge
	 */
	public static void copy(String message, File source, File target, FileFilter filter) {
		if (!source.exists())
			return;
		if (source.isDirectory()) {
			if (target.exists() && target.isFile())
				target.delete();
			if (!target.exists())
				target.mkdirs();
			File[] children = source.listFiles(filter);
			for (int i = 0; i < children.length; i++)
				copy(message, children[i], new File(target, children[i].getName()));
			return;
		}
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new BufferedInputStream(new FileInputStream(source));
			output = new BufferedOutputStream(new FileOutputStream(target));

			byte[] buffer = new byte[8192];
			int bytesRead = 0;
			while ((bytesRead = input.read(buffer)) != -1)
				output.write(buffer, 0, bytesRead);
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.err.println("Exception while trying to close input stream on: " + source.getAbsolutePath());
					e.printStackTrace();
				}
			}
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					System.err.println("Exception while trying to close output stream on: " + target.getAbsolutePath());
					e.printStackTrace();
				}
			}
		}
	}

	public static void copy(String message, File source, File target) {
		copy(message, source, target, null);
	}

	public static Collection<Object[]> extractTestCaseFrom(String folder) throws IOException {
		List<File> chatterFiles = TestHelpers.getFiles("testData/" + folder, "*.txt");
		if (chatterFiles.size() == 0)
			Assert.fail("No chatter file (*.txt) found in " + folder);
		List<File> counterExample = TestHelpers.getFiles("testData/" + folder, "*.xml");
		if (counterExample.size() != 1)
			Assert.fail("Too many or too few counterexample files in " + folder);
		Collection<Object[]> result = new ArrayList<Object[]>(chatterFiles.size());
		for (File chatterFile : chatterFiles) {
			result.add(new Object[] { chatterFile.getAbsolutePath(), counterExample.get(0).getAbsolutePath(), folder });
		}
		return result;
	}

	public static List<File> getFiles(String folder, String pattern) throws IOException {
		List<File> result = new ArrayList<File>();
		Enumeration<URL> matches = Activator.getContext().getBundle().findEntries(folder, pattern, false);
		while (matches.hasMoreElements()) {
			URL url = (URL) matches.nextElement();
			result.add(toFile("", url));
		}
		return result;
	}
}
