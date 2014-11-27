package org.eclipse.cbmc.tracedebugger.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import main.TraceDebugger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class IntegrationTest {
	 @Parameters
	public static Collection<String[]> data() {
        return Arrays.asList(new String[][] { { "simpleTest" } });
    }
	
	@Parameter
	public String testData;
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	private File counterExample;
	private Chatter chatter;
	
	@Test
	public void test() throws FileNotFoundException, IOException {
		process.Process process = TraceDebugger.loadAsProcess(counterExample);
		Scanner scan = new Scanner(chatter.getInput());
		
		TestingInterpreterLoop interpreter = new TestingInterpreterLoop(process, scan, chatter);
		interpreter.run();
	}
	
	@Before
	public void setupInput() throws IOException {
		counterExample = new File(folder.getRoot(), "counterexample.xml");
		File chatterFile = new File(folder.getRoot(), "chatter.txt");
		copy("copy counterexample.xml",	getTestData("getting counterexample.xml", "testData/" + testData + "/counterexample.xml"), counterExample);
		copy("copy chatter.txt", getTestData("getting chatter.txt", "testData/" + testData + "/chatter.txt"), chatterFile);
		chatter = new Chatter(chatterFile, counterExample.getAbsolutePath());
	}
	
	public static File getTestData(String message, String entry) {
		if (entry == null)
			Assert.fail(message + " entry is null.");
		URL base = Activator.getContext().getBundle().getEntry(entry);
		if (base == null)
			Assert.fail(message + " entry not found in bundle: " + entry);
		try {
			String osPath = new Path(FileLocator.toFileURL(base).getPath()).toOSString();
			File result = new File(osPath);
			if (!result.getCanonicalPath().equals(result.getPath()))
				Assert.fail(message + " result path: " + result.getPath() + " does not match canonical path: " + result.getCanonicalFile().getPath());
			return result;
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
		// avoid compile error... should never reach this code
		return null;
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
}
