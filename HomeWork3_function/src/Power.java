/*1.	��ƪ��m��-Power
�g�@���int power(int x, int n)�Ψӭp��x��n����C
�����Gpower(5,3)�Y�p��53�C
*/

import java.util.Scanner;

public class Power {

	static int power(int x, int y) {
		int result = (int)Math.pow(x, y);
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%n%d��%d����=%d", num1, num2 , power(num1 , num2));

		sc.close();
	}

}
