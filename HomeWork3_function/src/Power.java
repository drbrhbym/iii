/*1.	函數的練習-Power
寫一函數int power(int x, int n)用來計算x的n次方。
說明：power(5,3)即計算53。
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
		
		System.out.printf("%n%d的%d次方=%d", num1, num2 , power(num1 , num2));

		sc.close();
	}

}
