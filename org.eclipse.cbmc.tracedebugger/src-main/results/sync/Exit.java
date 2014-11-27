package results.sync;
import infra.MICommand;
import infra.MIResult;

import java.util.Arrays;
import java.util.List;


public class Exit extends MIResult {

	public Exit(MICommand cmd) {
		super(cmd);
	}

	@Override
	public List<String> serialize() {
		return Arrays.asList(getCommand().getId() + "^exit");
	}

}
