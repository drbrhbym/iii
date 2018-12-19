/*9.    遞迴函數的練習-RConvert
將上述兩個函數改成遞迴函數。
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
