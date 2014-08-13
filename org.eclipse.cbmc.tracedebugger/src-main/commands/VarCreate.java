package commands;

import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.Assignment;

public class VarCreate extends MICommand {

	// 41-var-create --thread 1 --frame 0 - * tmpOne

	@Override
	public MIOutput perform(Process process) {
		int threadId = 0;
		int frameId = -1;
		String name = null;
		String localVarName = null;
		
		String[] tokens = parameters.split(" ");
		if (tokens.length < 2)
			return new Error(this, "Missing arguments");

		if (tokens[0].equals("--thread"))
			threadId = Integer.valueOf(tokens[1]);

		if (tokens[2].equals("--frame"))
			frameId = Integer.valueOf(tokens[3]);
		
		if (!tokens[4].equals("-")) {
			name = tokens[4];
		} else {
			name = "var" + (process.getVariableManager().getVariables().size() + 1);
		}
		
		localVarName = tokens[6];
		
		Assignment match = process.getThread(threadId).getFrame(frameId).getVariable(localVarName);
		process.getVariableManager().getVariables().put(name, match);
		process.getVariableManager().getPreviousValues().put(name, match);
		
		Vars v = new Vars();
		v.name = name;
		v.value = match.getFullLhsValue();
		v.type = match.getType();	//TODO voir si il ne faut pas convertir
		v.numchild = "0"; //TODO A revoir qd on aura des vraies variables
		v.has_more = "0";	//A revoir avec des vraies variables
		v.threadId = Integer.toString(threadId);
		return new Done(this, v);
	}
}
