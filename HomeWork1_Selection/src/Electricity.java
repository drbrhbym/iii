/*1. ��ܩʱԭz���m��-Electricity
��J��إιq�M�׼ơA�p��X��ú���q�O�C
�q�O���q�ϥβ֭p�覡�ӭp��q�O�A���u�~�ιq�ήa�x�ιq�C
�a�x�ιq �u�~�ιq
240��(�t)�H�U 0.15�� 0.45��
240~540(�t)�� 0.25�� 0.45��
540�ץH�W 0.45�� 0.45��
*/

//#1

import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�ܱz�n�p�⪺�q�O�覡: (1)�a�x�ιq or (2)�u�~�ιq");
		int type = scanner.nextInt();
		System.out.println("�п�J�z���q�O�׼�:");
		double rate = scanner.nextDouble();
		scanner.close();

		if (type == 1 && rate <= 240) {
			System.out.println("�z���q�O�O" + (rate * 0.15) + "���C");
		} else if (type == 1 && rate <= 540) {
			System.out.println("�z���q�O�O" + (int) ((240 * 0.15) + ((rate - 240) * 0.25)) + "���C");
		} else if (type == 1 && rate > 540) {
			System.out.println("�z���q�O�O" + (int) ((240 * 0.15) + (300 * 0.25) + ((rate - 540) * 0.45)) + "���C");
		} else
			System.out.println("�z���q�O�O" + (int) (rate * 0.45) + "���C");

		System.out.println("\nThank you!!!");
	}

}

//#2
/*
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); System.out.println("�п�ܱz�n�p�⪺�q�O�覡: (1)�a�x�ιq or (2)�u�~�ιq");
 * int type = scanner.nextInt(); System.out.println("�п�J�z���q�O�׼�:"); double rate =
 * scanner.nextDouble(); scanner.close();
 * 
 * 
 * switch (type) { case 1: if (rate <= 240) { System.out.println("�z���q�O�O" + (rate
 * * 0.15) + "���C"); } else { if (rate <= 540) { System.out.println("�z���q�O�O" +
 * ((240 * 0.15) + ((rate - 240) * 0.25)) + "���C"); } else {
 * System.out.println("�z���q�O�O" + ((240 * 0.15) + (300 * 0.25) + ((rate - 540) *
 * 0.45)) + "���C");
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
 * case 2: { System.out.println("�z���q�O�O" + (rate * 0.45) + "���C"); }
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
