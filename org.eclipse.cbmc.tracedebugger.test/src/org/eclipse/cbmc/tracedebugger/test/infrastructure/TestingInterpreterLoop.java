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
package org.eclipse.cbmc.tracedebugger.test.infrastructure;

import infra.CompositeOutput;
import infra.MIOutput;
import infra.MIResult;

import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Assert;

import main.InterpreterLoop;
import process.Process;

public class TestingInterpreterLoop extends InterpreterLoop {

	private Chatter chatter;

	public TestingInterpreterLoop(Process process, Scanner scanner, Chatter chatter) {
		super(process, scanner, System.out, Logger.getAnonymousLogger());
		this.chatter = chatter;
	}

	@Override
	public void serializeResult(MIOutput result) {
		if (result instanceof MIResult) {
			//TODO to be more resilient to reordering of fields, we should deserialize the objects and compare those
			Assert.assertEquals(chatter.getResponses().get(((MIResult) result).getCommand().getId()), result.serialize());
			return;
		} 
		if (result instanceof CompositeOutput) {
			Assert.assertEquals(chatter.getResponses().get(((CompositeOutput) result).getCommand().getId()), result.serialize());
			return;
		}
		Assert.fail("Unexpected type of result");
	}
}
