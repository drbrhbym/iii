/*1. 選擇性敘述的練習-Electricity
輸入何種用電和度數，計算出需繳之電費。
電力公司使用累計方式來計算電費，分工業用電及家庭用電。
家庭用電 工業用電
240度(含)以下 0.15元 0.45元
240~540(含)度 0.25元 0.45元
540度以上 0.45元 0.45元
*/

//#1

import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請選擇您要計算的電費方式: (1)家庭用電 or (2)工業用電");
		int type = scanner.nextInt();
		System.out.println("請輸入您的電費度數:");
		double rate = scanner.nextDouble();
		scanner.close();

		if (type == 1 && rate <= 240) {
			System.out.println("您的電費是" + (rate * 0.15) + "元。");
		} else if (type == 1 && rate <= 540) {
			System.out.println("您的電費是" + (int) ((240 * 0.15) + ((rate - 240) * 0.25)) + "元。");
		} else if (type == 1 && rate > 540) {
			System.out.println("您的電費是" + (int) ((240 * 0.15) + (300 * 0.25) + ((rate - 540) * 0.45)) + "元。");
		} else
			System.out.println("您的電費是" + (int) (rate * 0.45) + "元。");

		System.out.println("\nThank you!!!");
	}

}

//#2
/*
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); System.out.println("請選擇您要計算的電費方式: (1)家庭用電 or (2)工業用電");
 * int type = scanner.nextInt(); System.out.println("請輸入您的電費度數:"); double rate =
 * scanner.nextDouble(); scanner.close();
 * 
 * 
 * switch (type) { case 1: if (rate <= 240) { System.out.println("您的電費是" + (rate
 * * 0.15) + "元。"); } else { if (rate <= 540) { System.out.println("您的電費是" +
 * ((240 * 0.15) + ((rate - 240) * 0.25)) + "元。"); } else {
 * System.out.println("您的電費是" + ((240 * 0.15) + (300 * 0.25) + ((rate - 540) *
 * 0.45)) + "元。");
 * 
 * 
 * }
 * 
 * 
 * } // case 1
 * 
 * 
 * ;break;
 * 
 * 
 * case 2: { System.out.println("您的電費是" + (rate * 0.45) + "元。"); }
 * 
 * 
 * ;break; } // end of switch
 * 
 * 
 * System.out.println("\nThank you");
 * 
 * 
 * }// main }
 */
