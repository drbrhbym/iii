/*3.    ㄧ计絤策-IsPrime
糶ㄧ计boolean isPrime (int n)ノㄓ耞n琌借计
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
