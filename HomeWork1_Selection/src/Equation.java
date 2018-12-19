
/*6. 選擇性敘述的練習-Equation
一元二次方程式ax2+bx+c=0。輸入a, b, c三值，並計算方程式的根。
b2-4ac > 0，有兩個不相等的實根。
b2-4ac = 0，有兩個相等的實根。
b2-4ac < 0，則印出”沒有實根”。
*/

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入a , b , c 三個值:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int num = b * b - (4 * a * c);

		if (num > 0) {
			System.out.println("有兩個不相等的實根");
		} else if (num == 0) {
			System.out.println("有兩個相等的實根");
		} else
			System.out.println("沒有實根");

	}

}