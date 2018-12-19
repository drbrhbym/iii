/*
* 輸入兩數算最大公因數
*/

import java.util.Scanner;

public class GreatCommonDivisor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

		int tmp = 0;
		while (x % y != 0) {
			tmp = y;
			y = x % y;
			x = tmp;
		}
		System.out.printf("\nThe answer is: %d" , y); 

	} 

}
