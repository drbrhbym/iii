
/*5. 選擇性敘述的練習-Refund
輸入在某商店購物應付金額與實付金額。
實付金額小於應付金額，則印出”金額不足”。
實付金額等於應付金額，則印出”不必找錢”。
實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
說明：若買了132元的商品，付1000元，應找回一張500元，三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。
*/

import java.util.Scanner;

public class Refound {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("請輸入應付金額:");
int price = sc.nextInt();
System.out.println("請輸入實付金額:");
int pay = sc.nextInt();
sc.close();

int a = (pay - price) / 500;// 500
int b = (pay - price) % 500 / 100;// 100
int c = (pay - price) % 500 % 100 / 50;// 50
int d = (pay - price) % 500 % 100 % 50 / 10;// 10
int e = (pay - price) % 500 % 100 % 50 % 10 / 5;// 5
int f = (pay - price) % 500 % 100 % 50 % 10 % 5;// 1

if (price > pay) {
System.out.println("金額不足!!!");
} else if (price == pay) {
System.out.println("不必找錢。");
} else
System.out.println(
"\n應找回" + a + "張500元、" + b + "張100元、" + c + "個50元硬幣、" + d + "個10元硬幣、" + e + "個5元硬幣、" + f + "個1元硬幣。");

}

}
