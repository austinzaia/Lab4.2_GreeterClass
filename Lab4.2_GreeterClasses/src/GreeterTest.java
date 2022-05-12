import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void test1() {
		Greeter test1 = new Greeter("Hello");
		String expected = "Hello, Austin!";
		String actual = test1.greet("Austin");
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Greeter test2 = new Greeter("Hey");
		String expected = "Hey, Simon!";
		String actual = test2.greet("Simon");
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		SimonGreeter test3 = new SimonGreeter("Yo");
		String expected = "Simon Says, \"Yo, Andrew!\"";
		String actual = test3.greet("Andrew");
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		SimonGreeter test4 = new SimonGreeter("Go crazy");
		String expected = "Simon Says, \"Go crazy, Steve!\"";
		String actual = test4.greet("Steve");
		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		LoudGreeter test5 = new LoudGreeter("Ciao");
		String expected = "Ciao, Bella!!";
		String actual = test5.greet("Bella");
		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		LoudGreeter test6 = new LoudGreeter("Ciao");
		test6.addVolume();
		String expected = "Ciao, Bella!!!";
		String actual = test6.greet("Bella");
		assertEquals(expected, actual);
	}

	@Test
	void test7() {
		LoudGreeter test7 = new LoudGreeter("Salute");
		test7.addVolume();
		test7.addVolume();
		test7.addVolume();
		test7.addVolume();
		String expected = "Salute, Amici!!!!!!";
		String actual = test7.greet("Amici");
		assertEquals(expected, actual);
	}

	@Test
	void test8() {
		HtmlGreeter test8 = new HtmlGreeter("Hey");
		String expected = "<h1>Hey, Lawrence!</h1>";
		String actual = test8.greet("Lawrence");
		assertEquals(expected, actual);
	}

	@Test
	void test9() {
		HtmlGreeter test9 = new HtmlGreeter("Ahoy", "h2");
		String expected = "<h2>Ahoy, Luffy!</h2>";
		String actual = test9.greet("Luffy");
		assertEquals(expected, actual);
	}

	@Test
	void test10() {
		HtmlGreeter test10 = new HtmlGreeter("Wake up", "h3");
		String expected = "<h3>Wake up, folks!</h3>";
		String actual = test10.greet("folks");
		assertEquals(expected, actual);
	}

	@Test
	void test11() {
		HtmlGreeter test11 = new HtmlGreeter("HEYYYY", "h4");
		String expected = "<h4>HEYYYY, YOU GUYS!</h4>";
		String actual = test11.greet("YOU GUYS");
		assertEquals(expected, actual);
	}

}
