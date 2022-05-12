public class LoudGreeter extends Greeter {
	private String extra = "!";

	public void addVolume() {
		extra += "!";
	}

	public LoudGreeter(String greeting) {
		super(greeting);
	}

	@Override
	public String greet(String name) {
		return super.greet(name) + extra;
	}

}