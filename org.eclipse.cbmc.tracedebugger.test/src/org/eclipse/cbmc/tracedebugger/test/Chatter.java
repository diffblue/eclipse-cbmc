package org.eclipse.cbmc.tracedebugger.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This code is responsible for loading the commands and associated responses
//that occurs between a Eclipse-gdb and a gdb-backend.
//The only purpose of this class is to drive testing and read files that have been carefully crafted
public class Chatter {
	private static final String INPUT_FILE_MARKER = "<<inputFile>>";

	enum LineKind {
		command, response;
	}
	
	File input;
	FileWriter outputStream;
	Map<String, List<String>> responses = new HashMap<>();

	LineKind lastLineKind = LineKind.command;
	String commandId = "";
	String counterExamplePath;
	
	public Chatter(File filename, String counterExample) throws IOException {
		counterExamplePath = counterExample;
		input = File.createTempFile("cbmcTest", "txt");
		input.deleteOnExit();
		outputStream = new FileWriter(input);
		Scanner scanner = new Scanner(filename);
		readData(scanner);
		scanner.close();
		outputStream.close();
	}
	
	private void readData(Scanner scan) throws IOException {
		Pattern pattern = Pattern.compile("([0-9]+)-(\\S+)(.*)");
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.trim().length() == 0)
				continue;
			Matcher matches = pattern.matcher(line);
			if (matches.find()) {
				addCommand(line);
			} else {
				addResponse(line);
			}
			
		}
		scan.close();
	}
	
	private void addCommand(String line) throws IOException {
		lastLineKind = LineKind.command;
		commandId = "";
		Pattern pattern = Pattern.compile("([0-9]+)(.*)");
		Matcher matches = pattern.matcher(line);
		if (matches.find())
			commandId = matches.group(1);
		line = line.replaceAll(INPUT_FILE_MARKER, counterExamplePath);
		outputStream.write(line + '\n');
	}

	private void addResponse(String line) {
		try {
			if ("(gdb)".equals(line))
				return;
//			Pattern pattern = Pattern.compile("([0-9]+)\\^(\\S+)");
//			Matcher matches = pattern.matcher(line);
			String resultToInsert = null;
//			if (matches.find()) {
//				resultToInsert  = matches
//			} else {
				resultToInsert = line;
//			}
			resultToInsert = resultToInsert.replaceAll(INPUT_FILE_MARKER, counterExamplePath);
			List<String> value = responses.getOrDefault(commandId, new ArrayList<String>());
			value.add(resultToInsert);
			responses.put(commandId, value);
		} finally {
			lastLineKind = LineKind.response;
		}
	}

	public File getInput() throws IOException {
		return input;
	}
	
	public Map<String, List<String>> getResponses() {
		return responses;
	}
}
