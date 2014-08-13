package commands;

import infra.MICommand;
import infra.MIOutput;

import org.eclipse.emf.common.util.EList;

import process.Process;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.Assignment;

public class StackListLocals extends MICommand {
//	stack-list-locals --thread 1 --frame 0 1
	//locals=[{name="tmpOne",value="0"},{name="retOne",value="0"}]
	@Override
	public MIOutput perform(Process process) {
		//stack-list-frames
		int threadId = 0;
		int frameId = 0;
		
		String[] tokens = parameters.split(" ");
		if (tokens.length < 2)
			return new Error(this, "Missing arguments");
		
		if (tokens[0].equals("--thread"))
			threadId = Integer.valueOf(tokens[1]);

		if (tokens[2].equals("--frame"))
			frameId = Integer.valueOf(tokens[3]);

		EList<Assignment> localVariables = process.getThread(threadId).getFrame(frameId).getVariables();
		Vars[] results = new Vars[localVariables.size()];
		int i = 0;
		for (Assignment assignment : localVariables) {
			results[i] = new Vars();
			results[i].name = assignment.getBaseName();
			results[i].value = assignment.getFullLhsValue();
			i++;
		}
		return new Done(this, "locals", results);
	}

}
