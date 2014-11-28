package commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import infra.MICommand;
import infra.MIOutput;
import infra.VarHelpers;

import org.kohsuke.args4j.Option;

import process.Process;
import results.data.VarHelper;
import results.data.Vars;
import results.sync.Done;
import trace.Assignment;
import trace.SimpleValue;
import trace.TraceFactory;
import trace.Value;

// 41-var-create --thread 1 --frame 0 - * tmpOne
public class VarCreate extends MICommand {
	@Option(name="--thread", required=true)
	int threadId = 0;
	
	@Option(name="--frame", required=false)
	int frameId;
	
	//Here we are not using the default parsing capabilities of MICommand because the '-' passed as an argument trips args4j
	public results.sync.Error parseParameters(String[] tokens) {
		if (tokens.length < 2)
			return new results.sync.Error(this, "Missing arguments");

		if (tokens[0].equals("--thread"))
			threadId = Integer.valueOf(tokens[1]);

		if (tokens[2].equals("--frame"))
			frameId = Integer.valueOf(tokens[3]);
		
		if (tokens.length > 4) {
			for (int i = 4; i < tokens.length; i++) {
				arguments.add(tokens[i]);
			}
		}
		return null;
	}
	
	@Override
	public MIOutput perform(Process process) {
		String internalVarName = null;
		String expression = null;
		
		if (!arguments.get(0).equals("-")) {
			internalVarName = arguments.get(0);
		} else {
			internalVarName = "var" + (process.getVariableManager().getVariables().size() + 1);
		}
		expression = arguments.get(2);
		
		Assignment match = VarHelpers.getAssignment(process, expression, threadId, frameId);
		process.getVariableManager().getVariables().put(internalVarName, match);
		process.getVariableManager().getPreviousValues().put(internalVarName, match);
		
		Value value = match.getParsedValue();
		
		Vars v = new Vars();
		v.name = internalVarName;
		v.value = value.getUserFriendlyRepresentation(true);
		v.type = VarHelper.getMIType(match.getType());
		v.numchild = String.valueOf(value.getChildrenCount());
		v.has_more = "0";
		v.threadId = Integer.toString(threadId);
		return new Done(this, v);
	}
}
