import java.io.*;

public class KeyboardInput {

	public static void main(String[] args) {
		String str;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		try {
			while(!(str = in.readLine()).equals(""))
				System.out.println(str);
			in.close();
			isr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
