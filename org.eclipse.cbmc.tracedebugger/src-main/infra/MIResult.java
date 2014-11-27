package infra;

import com.google.gson.GsonBuilder;

public abstract class MIResult extends MIOutput {
	private MICommand cmd;

	public MIResult(MICommand cmd) {
		this.cmd = cmd;
	}
	
	protected String toJson(Object o) {
		return new GsonBuilder().disableHtmlEscaping().create().toJson(o);
	}
	
	public MICommand getCommand() {
		return cmd;
	}
}
