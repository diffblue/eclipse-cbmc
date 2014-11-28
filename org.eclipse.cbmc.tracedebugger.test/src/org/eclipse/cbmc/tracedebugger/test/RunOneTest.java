package org.eclipse.cbmc.tracedebugger.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import main.TraceDebugger;

//This class is not a test in itself but simply a way to execute one test.
//This is especially useful when debugging from a chatter file.
public class RunOneTest {
	public static void main(String[] args) throws IOException {
		File counterExample = new File("/home/pascal/dev/cbmc/eclipse-cbmc/org.eclipse.cbmc.tracedebugger.test/testData/executionAndBreakpoints/counterexample.xml");
		Chatter chatter = new Chatter(new File("/home/pascal/dev/cbmc/eclipse-cbmc/org.eclipse.cbmc.tracedebugger.test/testData/executionAndBreakpoints/runToTheEnd.txt"), counterExample.getAbsolutePath());
		
		process.Process process = TraceDebugger.loadAsProcess(counterExample);
		Scanner scan = new Scanner(chatter.getInput());
		
		TestingInterpreterLoop interpreter = new TestingInterpreterLoop(process, scan, chatter);
		interpreter.run();
	}
}
	