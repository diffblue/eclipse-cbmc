package commands;

import infra.MICommand;
import infra.MIOutput;

import org.eclipse.emf.common.util.EList;
import org.kohsuke.args4j.Option;

import process.Process;
import results.data.Vars;
import results.sync.Done;
import trace.Assignment;

//stack-list-locals --thread 1 --frame 0 1
//locals=[{name="tmpOne",value="0"},{name="retOne",value="0"}]
public class StackListLocals extends MICommand {
	@Option(name="--thread", required=true)
	int threadId;
	
	@Option(name="--frame", required=false)
	int frameId;
	
	@Override
	public MIOutput perform(Process process) {		
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
