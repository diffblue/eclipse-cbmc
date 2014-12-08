package org.eclipse.cbmc.tracedebugger.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import main.TraceDebugger;

import org.eclipse.cbmc.tracedebugger.test.infrastructure.Chatter;
import org.eclipse.cbmc.tracedebugger.test.infrastructure.TestHelpers;
import org.eclipse.cbmc.tracedebugger.test.infrastructure.TestingInterpreterLoop;
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
        return Arrays.asList(new String[][] { { "simpleTest" } , { "struct" } , { "arrayOfStruct" }, { "functionWithParameters" } });
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
		TestHelpers.copy("copy counterexample.xml",	TestHelpers.getTestData("getting counterexample.xml", "testData/" + testData + "/counterexample.xml"), counterExample);
		TestHelpers.copy("copy chatter.txt", TestHelpers.getTestData("getting chatter.txt", "testData/" + testData + "/chatter.txt"), chatterFile);
		chatter = new Chatter(chatterFile, counterExample.getAbsolutePath());
	}
	

}
