package results.sync;
import infra.MICommand;
import infra.MIResult;

import java.util.Arrays;
import java.util.List;


public class Running extends MIResult {

	public Running(MICommand cmd) {
		super(cmd);
	}

	@Override
	public List<String> serialize() {
		return Arrays.asList(cmd.getId() + "^running");
	}

}
