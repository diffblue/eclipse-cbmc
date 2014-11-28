package org.eclipse.cbmc.tracedebugger.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import main.TraceDebugger;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExecutionAndBreakpointTests {
	//stepInWithBreakpoint
	//stepOutWithBreakpoint
	//run with Breakpoint
	@Parameters
	public static Collection<String[]> data() {
       return Arrays.asList(new String[][] { { "runToBreakpoint.txt" } , {"keepRunningAfterError.txt"}, {"nextStepUntilTheEnd.txt"}, {"stackListFrames.txt"} });
   }
	
	public String testData = "executionAndBreakpoints";
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	private File counterExample;
	
	@Parameter
	public String chatterFile;
	
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
		File file = new File(folder.getRoot(), chatterFile);
		TestHelpers.copy("copy counterexample.xml",	TestHelpers.getTestData("getting counterexample.xml", "testData/" + testData + "/counterexample.xml"), counterExample);
		TestHelpers.copy("copy " +  chatterFile, TestHelpers.getTestData("getting chatter.txt", "testData/" + testData + "/" +  chatterFile), file);
		chatter = new Chatter(file, counterExample.getAbsolutePath());
	}
}
