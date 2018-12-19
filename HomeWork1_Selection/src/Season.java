
/*2. 選擇性敘述的練習-Season
輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。
*/

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入月份:");
		int mon = sc.nextInt();
		sc.close();

		switch (mon) {
		case 3:
		case 4:
		case 5:
			System.out.println("百花爭鳴的春天");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("熱得要命的夏天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("忽冷忽熱的秋天");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冷得要命的冬天");
			break;
		default:
			System.out.println("\ninput error");
		}

	}

}