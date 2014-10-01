package commands;

import infra.CompositeOutput;
import infra.MICommand;
import infra.MIOutput;
import infra.StringOutput;

import java.util.ArrayList;

import process.Process;
import results.sync.Done;

public class InterpreterExec extends MICommand {
	

//	33-interpreter-exec --thread-group i1 console kill
//	681,622 ~"Kill the program being debugged? (y or n) [answered Y; input not from terminal]\n"
//	681,623 =thread-exited,id="1",group-id="i1"
//	681,623 =thread-group-exited,id="i1"
//	681,623 33^done
	
	private String threadGroup;
	
	public void initialize(String id, String parameters) {
		super.initialize(id, parameters);
		if (parameters.length() > 0) {
			String[] segments = parameters.split("\\s");
			if (segments[0].equals("--thread-group")) {
				threadGroup = segments[1];
			}
		}
	}
	
	@Override
	public MIOutput perform(Process process) {
		//We only support the console kill command
		if (!parameters.endsWith("console kill"))
			return new Done(this);
		
		ArrayList<String> output = new ArrayList<String>();
		output.add(" ~\"Kill the program being debugged? (y or n) [answered Y; input not from terminal]\\n\"");
		for (process.Thread threadToStop : process.getThreads()) {
			output.add("=thread-exited,id=\"" + threadToStop.getId() + "\",group-id=\"" + threadGroup + "\"");
		}
		output.add("=thread-group-exited,id=\"" + threadGroup + "\"");
		
		return new CompositeOutput(new StringOutput(output.toArray(new String[output.size()])), new Done(this));
	}

}
