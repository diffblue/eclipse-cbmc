package results.data;

import java.util.List;

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
	public List<Child> children;
}
