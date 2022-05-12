import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your preferred greeting: ");
			String greeting = input.nextLine();

			System.out.println("Enter your name: ");
			String name = input.nextLine();

			Greeter greet1 = new Greeter(greeting);
			System.out.println(greet1.greet(name));

			SimonGreeter greet2 = new SimonGreeter(greeting);
			System.out.println(greet2.greet(name));

			LoudGreeter greet3 = new LoudGreeter(greeting);
			System.out.println("How much volume to add? (0 to 10):");
			int volume = input.nextInt();

			for (int i = 0; i < volume; i++) {
				greet3.addVolume();
			}

			System.out.println(greet3.greet(name));

			HtmlGreeter greet4 = new HtmlGreeter(greeting);
			System.out.println(greet4.greet(name));
		}

	}
}
