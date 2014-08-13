package results.sync;

import infra.MICommand;
import infra.MIResult;

import java.util.Arrays;
import java.util.List;

public class Error extends MIResult {

	private String reason;

	public Error(MICommand cmd) {
		super(cmd);
	}

	public Error(MICommand cmd, String reason) {
		super(cmd);
		this.reason = reason;
	}

	@Override
	public List<String> serialize() {
		return Arrays.asList(cmd.getId() + "^error" + (reason != null ? ",msg=\"" + reason + '"': ""));
	}

}
