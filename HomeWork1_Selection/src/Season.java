
/*2. ��ܩʱԭz���m��-Season
��J���1~12��A�Q��switch�P�_�۹������u�`�K�B�L�B��B�V�æL�X�C�Y���b���d��h�L�X����J���~���C
*/

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J���:");
		int mon = sc.nextInt();
		sc.close();

		switch (mon) {
		case 3:
		case 4:
		case 5:
			System.out.println("�ʪᪧ�諸�K��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���o�n�R���L��");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("���N���������");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�N�o�n�R���V��");
			break;
		default:
			System.out.println("\ninput error");
		}

	}

}