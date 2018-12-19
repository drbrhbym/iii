
public class Greetings2 {

	String[] greetings = { "Hello", "Hi!", "Good" };

	public void printGreetings(int i) throws Exception {
		System.out.println(greetings[i]);
	}

	public static void main(String[] args) {
		Greetings2 g = new Greetings2();
		try {
			for (int i = 0; i <= g.greetings.length; i++)
				g.printGreetings(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Out of bound"); // unchecked
		} catch (Exception ex) {
			System.err.println("Out of bound"); // checked
		} finally {
			System.out.println("Always printed");

			System.out.println("program end");
		}
	}

}
