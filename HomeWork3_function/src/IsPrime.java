/*3.    ��ƪ��m��-IsPrime
�g�@���boolean isPrime (int n)�ΨӧP�_n�O�_����ơC
*/


import java.util.Scanner;


public class IsPrime {


    static boolean isPrime(int n) {


        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += 1;
        }
        if (sum == 2)
            return true;
        else
            return false;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please in put a number:");
        int n = sc.nextInt();


        System.out.println(isPrime(n));
        sc.close();
    }


}
