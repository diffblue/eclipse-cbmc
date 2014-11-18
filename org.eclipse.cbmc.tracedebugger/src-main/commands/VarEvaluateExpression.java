package commands;

import infra.MICommand;
import infra.MIOutput;

import org.kohsuke.args4j.Option;

import process.Process;
import results.sync.Done;
import trace.Assignment;

public class VarEvaluateExpression extends MICommand {
	@Option(name="-f")
	String format;
	
	@Override
	public MIOutput perform(Process process) {
		String requestedVar = arguments.get(0);
		Assignment current = process.getVariableManager().getVariables().get(requestedVar);
		return new Done(this, "value", current.getFullLhsValue());
	}
	
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
	
	@Override
	protected int getMaximumNumberOfArguments() {
		return 1;
	}
}
