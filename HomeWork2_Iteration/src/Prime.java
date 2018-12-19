/*5.    迴圈的練習-Prime
輸入一正整數，找出所有小於或等於的質數。
*/


import java.util.Scanner;


public class Prime {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a numner:");
        int num = sc.nextInt();
        sc.close();


        System.out.printf("%d之內的質數有:", num);
        
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += 1; //只能被1或自己整除
                }


            }
            if (sum == 2)
                System.out.printf("%d,", i);
        }
        System.out.println("。");


    }


}
