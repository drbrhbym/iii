/*2.2. 迴圏的練習-Factor
輸入一正整數，求其所有的因數。
說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。


*/


import java.util.Scanner;


public class Factor {


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Please input number:");
int n = sc.nextInt();
sc.close();
System.out.printf("%d的因數有:" , n);
for (int i = 1; i <= n; i++) {
if (n % i == 0) {
System.out.printf("%d ", i);
}
}
        System.out.println("。");
}


}
