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
package org.eclipse.cbmc.tracedebugger.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
public class TestInterpreter {
	@Parameter(value=0)
	public String chatterData;
	
	@Parameter(value=1)
	public String counterExampleData;
	
	@Parameter(value=2)
	public String inputFolder; //This is here to keep the JUnit happy and allow to present a nice name.
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	private Chatter chatter;
	private File counterExample;

	//To add a test, add the folder containing the test in this list
	public static final String[] TEST_CASES = {
		"array",
		"arrayOfStruct", 
		"executionAndBreakpoints", 
		"functionCallOnFirstLine", 
		"functionWithParameters", 
		"recursion",
		"simpleTest",
		"struct",
		"variables",
		"globalVariable"
		};
	
	@Parameters(name= "{2} -> {0}")
	public static Collection<Object[]> getTestCases() throws IOException {
		Collection<Object[]> result = new ArrayList<Object[]>();
		for (String testCase : TEST_CASES) {
			result.addAll(TestHelpers.extractTestCaseFrom(testCase));
		}
		return result;
	}
	
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
		//We copy the counterexample because the tracedebugger writes in the same folder which would pollute
		TestHelpers.copy("copy counterexample.xml",	new File(counterExampleData), counterExample);
		chatter = new Chatter(new File(chatterData), counterExample.getAbsolutePath());
	}
	

}
