
/*5. ��ܩʱԭz���m��-Refund
��J�b�Y�ө��ʪ����I���B�P��I���B�C
��I���B�p�����I���B�A�h�L�X�����B�������C
��I���B�������I���B�A�h�L�X������������C
��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
�����G�Y�R�F132�����ӫ~�A�I1000���A����^�@�i500���A�T�i100���A�@��50���w���A�@��10���w���A�@��5���w���M�T��1���w���C
*/

import java.util.Scanner;

public class Refound {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("�п�J���I���B:");
int price = sc.nextInt();
System.out.println("�п�J��I���B:");
int pay = sc.nextInt();
sc.close();

int a = (pay - price) / 500;// 500
int b = (pay - price) % 500 / 100;// 100
int c = (pay - price) % 500 % 100 / 50;// 50
int d = (pay - price) % 500 % 100 % 50 / 10;// 10
int e = (pay - price) % 500 % 100 % 50 % 10 / 5;// 5
int f = (pay - price) % 500 % 100 % 50 % 10 % 5;// 1

if (price > pay) {
System.out.println("���B����!!!");
} else if (price == pay) {
System.out.println("��������C");
} else
System.out.println(
"\n����^" + a + "�i500���B" + b + "�i100���B" + c + "��50���w���B" + d + "��10���w���B" + e + "��5���w���B" + f + "��1���w���C");

}

}
