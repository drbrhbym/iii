/*5.    �j�骺�m��-Prime
��J�@����ơA��X�Ҧ��p��ε��󪺽�ơC
*/


import java.util.Scanner;


public class Prime {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a numner:");
        int num = sc.nextInt();
        sc.close();


        System.out.printf("%d��������Ʀ�:", num);
        
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += 1; //�u��Q1�Φۤv�㰣
                }


            }
            if (sum == 2)
                System.out.printf("%d,", i);
        }
        System.out.println("�C");


    }


}
