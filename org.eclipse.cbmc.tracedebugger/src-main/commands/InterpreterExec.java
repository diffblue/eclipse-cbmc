package commands;

import infra.CompositeOutput;
import infra.MICommand;
import infra.MIOutput;
import infra.StringOutput;

import java.util.ArrayList;

import org.kohsuke.args4j.Option;

import process.Process;
import results.sync.Done;

//33-interpreter-exec --thread-group i1 console kill
//681,622 ~"Kill the program being debugged? (y or n) [answered Y; input not from terminal]\n"
//681,623 =thread-exited,id="1",group-id="i1"
//681,623 =thread-group-exited,id="i1"
//681,623 33^done
public class InterpreterExec extends MICommand {
	@Option(name="--thread-group")
	String threadGroup;
	
	@Override
	public MIOutput perform(Process process) {
		//We only support the console kill command
		if (!(arguments.contains("console") && arguments.contains("kill")))
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
