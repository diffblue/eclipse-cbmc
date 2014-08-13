package results.async;
import infra.MIAsync;

import java.util.Arrays;
import java.util.List;


public class Running extends MIAsync {
	public String threadId;
	
	@Override
	public List<String> serialize() {
		return Arrays.asList("*running,thread-id=\"" + threadId + '"');
	}

}
