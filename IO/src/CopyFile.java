import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

public class CopyFile {

	public static void main(String[] args) {
		File file = new File(args[0]);
		File file2 = new File(args[1]);
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			PrintWriter out = new PrintWriter(new FileWriter(file2));
			StringBuilder sb = new StringBuilder(256);
			String str;
			while ((str = in.readLine()) != null)
				sb.append(str).append("\n");
			out.print(sb);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}	
}		