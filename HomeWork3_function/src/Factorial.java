/*6.    ���j��ƪ��m��-Factorial
�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
���ܡGfactorial (n) = n * factorial(n-1)�Afactorial(1)=1
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
