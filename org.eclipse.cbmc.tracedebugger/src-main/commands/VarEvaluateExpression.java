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
		String expression = arguments.get(0);
		String requestedVariable = VarUpdate.getVariableName(expression);
		Assignment current = process.getVariableManager().getVariables().get(requestedVariable);
		expression = VarUpdate.resolveInternalVariableName(current, expression);
		return new Done(this, "value", current.getValue(expression).getUserFriendlyRepresentation(false));
	}
	
	@Override
	protected int getMinimalNumberOfArguments() {
		return 1;
	}
	
	@Override
	protected int getMaximumNumberOfArguments() {
		return 1;
	}
}
