package results.data;

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
	public String has_more;
}
