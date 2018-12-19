/*4. 選擇性敘述的練習-LeapYear
輸入一西元年，如2015。判斷此年份是否為閏年。
提示：每四年一閏，每百年不閏，每四百年一閏，每四千年不閏。
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