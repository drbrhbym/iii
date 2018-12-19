import java.io.*;

public class KeyboardInput2 {

	public static void main(String[] args) {
		String str;
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader in = new BufferedReader(isr);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (!(str = in.readLine()).equals(""))
				System.out.println(str);
			in.close();
			// isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
