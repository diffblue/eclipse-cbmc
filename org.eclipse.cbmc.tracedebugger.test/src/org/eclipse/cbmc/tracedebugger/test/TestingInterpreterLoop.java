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
			Assert.assertEquals(result.serialize(), chatter.getResponses().get(((MIResult) result).getCommand().getId()));
		}
		// TODO Auto-generated method stub
		super.serializeResult(result);
	}
}
