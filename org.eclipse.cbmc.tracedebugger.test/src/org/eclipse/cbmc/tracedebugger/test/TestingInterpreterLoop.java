package org.eclipse.cbmc.tracedebugger.test;

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
		}
	}
}
