
/*6. ��ܩʱԭz���m��-Equation
�@���G����{��ax2+bx+c=0�C��Ja, b, c�T�ȡA�íp���{�����ڡC
b2-4ac > 0�A����Ӥ��۵�����ڡC
b2-4ac = 0�A����Ӭ۵�����ڡC
b2-4ac < 0�A�h�L�X���S����ڡ��C
*/

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�Ja , b , c �T�ӭ�:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int num = b * b - (4 * a * c);

		if (num > 0) {
			System.out.println("����Ӥ��۵������");
		} else if (num == 0) {
			System.out.println("����Ӭ۵������");
		} else
			System.out.println("�S�����");

	}

}