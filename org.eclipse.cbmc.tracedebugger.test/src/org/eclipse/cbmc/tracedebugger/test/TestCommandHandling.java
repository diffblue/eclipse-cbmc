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

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import infra.MICmdFactory;
import infra.UnknownCommand;

import org.junit.Assert;
import org.junit.Test;

import results.sync.Error;

import commands.VarEvaluateExpression;

public class TestCommandHandling {
	
	@Test
	public void tooManyParameters() {
		Assert.assertThat(new VarEvaluateExpression().initialize("1", "a b c"), is(instanceOf(Error.class)));
	}
	
	@Test
	public void tooFewParameters() {
		Assert.assertThat(new VarEvaluateExpression().initialize("1", ""), is(instanceOf(Error.class)));
	}
	
	@Test
	public void okParameters() {
		Assert.assertNull(new VarEvaluateExpression().initialize("1", "a"));
	}
	
	@Test
	public void unknownOption() {
		Assert.assertThat(new VarEvaluateExpression().initialize("1", "-zoo a"), is(instanceOf(Error.class)));
	}

	@Test
	public void unknownCommand() {
		Assert.assertThat(MICmdFactory.createCommand("an-unknown-command"), is(instanceOf(UnknownCommand.class)));
	}
	
	@Test
	public void knownCommand() {
		Assert.assertThat(MICmdFactory.createCommand("-var-evaluate-expression"), is(instanceOf(VarEvaluateExpression.class)));
	}
}
