/*1. 迴圏的練習-Expression
利用for迴圏計算12-22+32-42+…+492-502的值。 2 代表 平方
*/

public class Expression {

	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i <= 49; i += 2) {
			int odd = i * i;
			sum1 += odd;
		}
		for (int j = 2; j <= 50; j += 2) {
			int even = (j * j);
			sum2 += -(even);
		}

		sum3 = sum1 + sum2;
		System.out.println("Ans:" + sum3 + "!");
	}

}