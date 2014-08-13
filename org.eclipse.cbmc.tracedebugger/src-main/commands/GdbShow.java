package commands;
import infra.MICommand;
import infra.MIOutput;
import process.Process;
import results.sync.Done;


public class GdbShow extends MICommand {

	@Override
	public MIOutput perform(Process process) {
		if (parameters.contains("--thread-group") && parameters.contains("language"))
			return new Done(this, "value", "auto", true);
		return new Done(this);
	}
	
}
