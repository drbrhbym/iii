
/*3. 選擇性敘述的練習-Salary
輸入便利商店工讀生的工作時數，並計算其薪資。
60小時以內，時薪120元。
61~80小時，以時薪1.25倍計算。
81小時以上，以時薪1.5倍計算。
說明：薪資以累計方式計算。若工時為90小時，則薪資為60*120 + 20*120*1.25 + 10*120*1.5元。
*/

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入工讀生的工作時數(hrs):");
		int hrs = sc.nextInt();
		sc.close();

		if (hrs <= 60) {
			System.out.println("合計薪資為" + hrs * 120 + "元。");
		} else if (hrs > 60 && hrs <= 80) {
			System.out.println("合計薪資為" + (int) ((60 * 120) + ((hrs - 60) * 120 * 1.25)) + "元。");
		} else
			System.out.println("合計薪資為" + (int) ((60 * 120) + (20 * 120 * 1.25) + ((hrs - 80) * 120 * 1.5)));

		System.out.println("\n辛苦了!!!");
	}

}
