package commands;

import infra.MICommand;
import infra.MIOutput;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;

import process.Process;
import results.data.Child;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.Assignment;
import trace.StructValue;
import trace.Value;
import trace.impl.AssignmentImpl;

//var-list-children var2
//numchild="3",children=[child={name="var2.x",exp="x",numchild="0",type="int",thread-id="1"},child={name="var2.y",exp="y",numchild="0",type="int",thread-id="1"},child={name="var2.z",exp=\"z",numchild="0",type="int",thread-id="1"}],has_more="0"
public class VarListChildren extends MICommand {
	@Override
	public MIOutput perform(Process process) {
		String expression = arguments.get(0);
		String[] segments = AssignmentImpl.splitInTwo(expression);

		Assignment current = process.getVariableManager().getVariables().get(segments[0]);
		Value value = current.getValue(expression.replaceFirst(segments[0], current.getBaseName()));
		if (!(value instanceof StructValue)) {
			return new Error(this, "Variable does not have children");
		}
		EMap<String, Value> structValues = ((StructValue) value).getValues();
		ArrayList<Child> children = new ArrayList<Child>();
		for (Entry<String, Value> entry : structValues) {
			Vars v = new Vars();
			v.name = segments[0] + '.' + entry.getKey();
			v.exp = entry.getKey();
			v.numchild = String.valueOf(entry.getValue().getChildrenCount());
			v.type = "int"; //TODO 
			v.threadId = String.valueOf(current.getThread());
			children.add(new Child(v));
		}
		Vars result = new Vars();
		result.children = children;
		result.numchild = String.valueOf(structValues.size());
		result.has_more = "0";
		return new Done(this, result);
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
