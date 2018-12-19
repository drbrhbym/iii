/*6.    遞迴函數的練習-Factorial
寫一遞迴函數int factorial (int n)用來計算1*2*3*…*n的值。
提示：factorial (n) = n * factorial(n-1)，factorial(1)=1
*/

public class Factorial {

	static int factorial(int n) {

		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(factorial(4));

	}

}
