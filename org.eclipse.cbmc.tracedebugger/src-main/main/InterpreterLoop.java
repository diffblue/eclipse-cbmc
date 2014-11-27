package main;

import infra.MICmdFactory;
import infra.MICommand;
import infra.MIOutput;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import process.Process;
import results.sync.Error;

import commands.GdbExit;

public class InterpreterLoop {
	Logger logger;
	Process process;
	Scanner scan;
	PrintStream out;

	public InterpreterLoop(Process process, Scanner scanner, PrintStream out, Logger logger) {
		this.process = process;
		this.logger = logger;
		this.scan = scanner;
		this.out = out;
	}

	public void run() {
		out.println("CBMC Trace debugger - MI frontend");
		out.println("(gdb)");

		Pattern pattern = Pattern.compile("([0-9]+)(\\S+)(.*)");
		while (scan.hasNextLine()) {
			String input = scan.nextLine();
			logger.info(input);

			if (input.startsWith("13source")) {
				out.println("13^error,msg=\".gdbinit: No such file or directory.\"");
				out.println("(gdb)");
				continue;
			}

			Matcher matcher = pattern.matcher(input);
			if (!matcher.find())
				continue;
			String commandNumber = matcher.group(1);
			String commandName = matcher.group(2);
			String parameters = matcher.group(3);

			MICommand command = MICmdFactory.createCommand(commandName);
			MIOutput result = null;
			try {
				result = command.initialize(commandNumber, parameters.trim());
				if (result == null)
					result = command.perform(process);
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Exception occured while processing command", e);
				result = new Error(command, "Command could not be executed successfully");
			}
			serializeResult(result);
			if (command instanceof GdbExit) {
				return;
			}
		}
	}

	//Method public to allow for testing by subclassing the InterpreterLoop
	public void serializeResult(MIOutput result) {
		List<String> entries = result.serialize();
		for (String entry : entries) {
			logger.info(entry);
			out.println(entry);
		}
		out.println("(gdb)");
		out.flush();
	}
}
