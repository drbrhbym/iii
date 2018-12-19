
public class Greetings1 {

	static String[] greetings = { "Hello", "Hi!", "Good" };

	public static void printGreetings(int i) {
		System.out.println(greetings[i]);
	}

	public static void main(String[] args) {

		try {
			for (int i = 0; i <= greetings.length; i++)
				printGreetings(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Out of bound");
		} finally {
			System.out.println("Always printed");

			System.out.println("program end");
		}
	}

}
