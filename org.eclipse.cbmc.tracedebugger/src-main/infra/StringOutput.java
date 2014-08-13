package infra;

import java.util.Arrays;
import java.util.List;


public class StringOutput extends MIOutput{
	private String[] strings;

	public StringOutput(String...strings) {
		this.strings = strings;
	}
	
	public List<String> serialize() {
		return Arrays.asList(strings);
	}
}
