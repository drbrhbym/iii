
/*3. ��ܩʱԭz���m��-Salary
��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
60�p�ɥH���A���~120���C
61~80�p�ɡA�H���~1.25���p��C
81�p�ɥH�W�A�H���~1.5���p��C
�����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA�h�~�ꬰ60*120 + 20*120*1.25 + 10*120*1.5���C
*/

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�uŪ�ͪ��u�@�ɼ�(hrs):");
		int hrs = sc.nextInt();
		sc.close();

		if (hrs <= 60) {
			System.out.println("�X�p�~�ꬰ" + hrs * 120 + "���C");
		} else if (hrs > 60 && hrs <= 80) {
			System.out.println("�X�p�~�ꬰ" + (int) ((60 * 120) + ((hrs - 60) * 120 * 1.25)) + "���C");
		} else
			System.out.println("�X�p�~�ꬰ" + (int) ((60 * 120) + (20 * 120 * 1.25) + ((hrs - 80) * 120 * 1.5)));

		System.out.println("\n���W�F!!!");
	}

}
