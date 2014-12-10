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


public class MICmdFactory {
	public static MICommand createCommand(String commandName) {
		String classToLoad = toClassName(commandName);
		MICommand command = null;
		try {
			@SuppressWarnings("unchecked")
			Class<MICommand> commandClass = (Class<MICommand>) Class.forName(classToLoad);
			command = commandClass.newInstance();
		} catch (ClassNotFoundException e) {
			command = new UnknownCommand();
		} catch (InstantiationException e) {
			//Can't happen
		} catch (IllegalAccessException e) {
			//Can't happen
		}
		return command;
	}
	
	static private String toClassName(String commandName) {
		boolean capNext = false;
		StringBuffer result = new StringBuffer(commandName.length() + 10);
		result.append("commands.");
		//Change -abc-def into AbcDef
		for (int i = 0; i < commandName.length(); i++) {
			if (commandName.charAt(i) == '-') {
				capNext = true;
				continue;
			}
			result.append(capNext ? Character.toUpperCase(commandName.charAt(i)) : commandName.charAt(i) );
			capNext = false;
		}
		return result.toString();
	}
}
