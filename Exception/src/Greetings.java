
public class Greetings {

	public static void main(String[] args) {
		String[] greetings = { "Hello", "Hi!", "Good" };
		try {
			for (int i = 0; i <= greetings.length; i++)
				System.out.println(greetings[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Out of bound");
		} finally {
			System.out.println("Always printed");

			System.out.println("program end");
		}
	}

}
