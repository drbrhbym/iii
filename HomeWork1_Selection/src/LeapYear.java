/*4. ��ܩʱԭz���m��-LeapYear
��J�@�褸�~�A�p2015�C�P�_���~���O�_���|�~�C
���ܡG�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�C�|�d�~���|�C
*/

import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Please input a year:");
Long year = sc.nextLong();
sc.close();

if (year % 4 != 0 || year % 4000 == 0 || year % 100 == 0 && year % 400 != 0){
System.out.println("No, it's not a Leap year!!!");
} else {
System.out.println("Yes, it's a Leap year!!!");
}

}

}