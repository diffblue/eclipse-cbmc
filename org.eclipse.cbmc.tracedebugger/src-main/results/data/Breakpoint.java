package results.data;


//https://sourceware.org/gdb/onlinedocs/gdb/GDB_002fMI-Breakpoint-Information.html#GDB_002fMI-Breakpoint-Information
public class Breakpoint {
	public String number;
	public String type;
	public String disp; //keep or del
	public String enabled; //y or n
//	public String addr;
	public String func;
	public String line;
	public String file;
	public String fullname;
//	@SerializedName("thread-groups") public String threadGroups;
//	public String times;
//	@SerializedName("original-location") public String originalLocation;
	
	public Breakpoint(process.Breakpoint bkpt) {
		number = bkpt.getId();
		type = "breakpoint";
		line = bkpt.getLine();
		fullname = bkpt.getFile();
		file = bkpt.getFile();
		enabled = bkpt.isEnabled() ? "y" : "n";
		func = bkpt.getFunctionName();
	}
}
