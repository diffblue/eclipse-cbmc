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
package infra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import process.Process;
import trace.Assignment;
import trace.SimpleValue;
import trace.TraceFactory;
import trace.Value;

public class VarHelpers {

	//Take an internal variable name (e.g. var1) and replace it by its real name
	public static String resolveInternalVariableName(Assignment assignment, String expression) {
		String[] segments = VarHelpers.splitInTwo(expression);
		return expression.replaceFirst(segments[0], java.util.regex.Matcher.quoteReplacement(assignment.getBaseName()));
	}

	public static String[] splitInTwo(String expression) {
		int dotIdx = expression.indexOf('.');
		int bracketIdx = expression.indexOf('[');
		if (dotIdx < 0 && bracketIdx >=0 || (bracketIdx >=0 && bracketIdx < dotIdx)) {
			if (bracketIdx == 0)
				return VarHelpers.extractFromBracket(expression);
			return VarHelpers.splitAsBracket(expression);
		}
		if (dotIdx < 0)
			return new String[] {expression};
		
		if (dotIdx == 0) {
			if (expression.length() > 0)
				return splitInTwo(expression.substring(1));
			return new String[] {""};
		}
		else 
			return new String[] {expression.substring(0,dotIdx), expression.substring(dotIdx)};	
	}

	//for an expression [3].g, return 3 and ".g"
	//for an expression [3], return 3
	public static String[] extractFromBracket(String expression) {
		int finalBracketIdx = expression.indexOf(']');
		if (finalBracketIdx < 0)
			throw new RuntimeException("Malformed expression");
		if (finalBracketIdx == expression.length() - 1)
			return new String[] { expression.substring(1, finalBracketIdx) };
		else
			return new String[] { expression.substring(1, finalBracketIdx) , expression.substring(finalBracketIdx + 1) };
	}

	public static String[] splitAsBracket(String expression) {
		int bracketIdx = expression.indexOf('[');
		return new String[] { expression.substring(0, bracketIdx),  expression.substring(bracketIdx) };
	}

	public static String getVariableName(String expression) {
		return splitInTwo(expression)[0];
	}

	public static Assignment getAssignment(process.Process process, String expression, int threadId, int frameId) {
		if (expression.startsWith("&")) {
			return createAssignmentForReference(process, expression, threadId);
		}
		String topLevelVariable = VarHelpers.getVariableName(expression);
		Assignment match = process.getThread(threadId).getFrame(frameId).getVariable(topLevelVariable);
		if (match == null)
			throw new IllegalStateException("The requested variable does not exist: " + topLevelVariable);
		
		if (VarHelpers.splitInTwo(expression).length == 2) {
			match = createTemporaryAssignment(match, expression, match.getValue(expression));
		}
		return match;
	}

	private static Assignment createTemporaryAssignment(Assignment parent, String expression, Value value) {
		Assignment result = TraceFactory.eINSTANCE.createAssignment();
		result.setValue(value);
		result.setBaseName(expression);
		result.setThread(parent.getThread());
		result.setLocation(parent.getLocation());
		result.setNumber(parent.getNumber());
		return result;
	}
	

	private static Assignment createAssignmentForReference(Process process, String expression, int threadId) {
		Pattern pattern = Pattern.compile("&\\((.*)\\).*");
		Matcher matcher = pattern.matcher(expression);
		if (matcher.find()) {
			matcher.group(1);
		}
		SimpleValue value = TraceFactory.eINSTANCE.createSimpleValue();
		value.setValue("Address unknown");
		Assignment result = TraceFactory.eINSTANCE.createAssignment();
		result.setValue(value);
		result.setBaseName(expression);
		result.setThread(threadId);
		return result;
	}
}
