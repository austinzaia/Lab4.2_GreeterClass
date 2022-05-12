public class Greeter {
	private String greeting;

	public String inputGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public Greeter() {

	}

	public Greeter(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String name) {
		return greeting + ", " + name + "!";
	}
}