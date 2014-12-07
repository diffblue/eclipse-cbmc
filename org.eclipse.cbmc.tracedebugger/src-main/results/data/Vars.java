package results.data;

import org.eclipse.emf.common.util.EList;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;


public class Vars {
	public String name;
	public String value;
	public String type;
	public String numchild;
	@SerializedName("thread-id")
	public String threadId;
	public String in_scope;
	public String type_changed;
	public String new_type;
	public String has_more;
	public String format;
	public String exp;
	
	//This method exists because the serialization format of the children is not standard 
	//[child={name="var2.x",exp="x",numchild="0",type="int",thread-id="1"},child={name="var2.y",exp="y",numchild="0",type="int",thread-id="1"},child={name="var2.z",exp=\"z",numchild="0",type="int",thread-id="1"}],has_more="0"
	public static String serializeAsChildrenList(EList<Object> children) {
		StringBuilder result = new StringBuilder(200);
		result.append('[');
		for (Object child : children) {
			result.append("child=");
			result.append(new Gson().toJson(child));
			result.append(',');
		}
		result.deleteCharAt(result.length() - 1);
		result.append(']');
		return result.toString();
	}
}
