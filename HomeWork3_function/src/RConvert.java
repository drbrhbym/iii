/*9.    患癹ㄧ计絤策-RConvert
盢瓃ㄢㄧ计эΘ患癹ㄧ计
*/

public class RConvert {

	static public String dex2Bin(int n) {

		if (n < 2)
			return Integer.toString(n);
		else
			return dex2Bin(n / 2) + Integer.toString(n % 2);

	}

	public static void main(String[] args) {

		System.out.println(dex2Bin(23));

	}

}
