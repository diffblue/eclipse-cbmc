package commands;

import infra.MICommand;
import infra.MIOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;

import process.Process;
import results.data.Vars;
import results.sync.Done;
import results.sync.Error;
import trace.ArrayValue;
import trace.StructValue;
import trace.UnionValue;
import trace.Value;

//var-list-children var2
//numchild="3",children=[child={name="var2.x",exp="x",numchild="0",type="int",thread-id="1"},child={name="var2.y",exp="y",numchild="0",type="int",thread-id="1"},child={name="var2.z",exp=\"z",numchild="0",type="int",thread-id="1"}],has_more="0"
//42^done,children=[child={name="var1.x",type="int",numchild="0",thread-id="0",exp="x"},child={name="var1.y",type="int",numchild="0",thread-id="0",exp="y"}], numchild="2",has_more="0" 
public class VarListChildren extends MICommand {
	@Override
	public MIOutput perform(Process process) {
		final String requestedExpression = arguments.get(0);
		Value value = process.getVariableManager().getAssignment(requestedExpression).getValue();

		if (!(value instanceof StructValue || value instanceof ArrayValue)) {
			return new Error(this, "Variable does not have children");
		}
		
		ArrayList<Vars> children = null;
		if (value instanceof ArrayValue) {
			children = listChildrenForArray(requestedExpression, (ArrayValue) value);
		}
		if (value instanceof StructValue) {
			children = listChildrenForStruct(requestedExpression, (StructValue) value);
		}
		if (value instanceof UnionValue) {
			children = listChildrenForUnion(requestedExpression, (UnionValue) value); 
		}

		return new Done(this, buildAnswer(String.valueOf(children.size()), "0",children));
	}

	private ArrayList<Vars> listChildrenForStruct(String requestedExpression, StructValue struct) {
		EMap<String, Value> structValues = struct.getValues();
		ArrayList<Vars> children = new ArrayList<Vars>();
		for (Entry<String, Value> entry : structValues) {
			Vars v = new Vars();
			v.name = requestedExpression + '.' + entry.getKey();
			v.exp = entry.getKey();
			v.numchild = String.valueOf(entry.getValue().getChildrenCount());
			v.type = entry.getValue().getType();
			children.add(v);
		}
		return children;
	}
	
	private ArrayList<Vars> listChildrenForUnion(String requestedExpression, UnionValue union) {
		EMap<String, Value> structValues = union.getValues();
		ArrayList<Vars> children = new ArrayList<Vars>();
		for (Entry<String, Value> entry : structValues) {
			Vars v = new Vars();
			v.name = requestedExpression + '.' + entry.getKey();
			v.exp = entry.getKey();
			v.numchild = String.valueOf(entry.getValue().getChildrenCount());
			v.type = entry.getValue().getType();
			children.add(v);
		}
		return children;
	}
	
	private ArrayList<Vars> listChildrenForArray(String requestedExpression, ArrayValue array) {
		ArrayList<Vars> children = new ArrayList<Vars>();
		int i = 0;
		for (Value value : array.getValues()) {
			Vars v = new Vars();
			v.name = requestedExpression + '[' + i + ']';
			v.exp = "outArray[" + i + ']';
			v.numchild = String.valueOf(value.getChildrenCount());
			v.type = value.getType();
			children.add(v);
			i++;
		}
		return children;
	}
	
	private String buildAnswer(String numchild, String has_more, List<Vars> children) {
		return "numchild=\"" + numchild + "\",children=" +   Vars.serializeAsChildrenList(children) + ",has_more=\"" + has_more + "\"";
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
