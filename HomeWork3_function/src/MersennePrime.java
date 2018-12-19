/*5.    ��ƪ��m��-MersennePrime
�g�@���boolean mersennePrime (int n)�ΨӧP�_n�O�_��Mersenne��ơC���g�@�{����X�e8��Mersenne��ơC
���ܡG�Y��ƺ���2P-1=n (p�������)�A�hn��Mersenne Prime�C P = P����
�����G��p=3�ɡA23-1=7�A�G7��Mersenne Prime�C
*/


import java.util.Scanner;


public class MersennePrime {


    static boolean isPrime(long n) {


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


    static boolean mersennePrime(long n) {


        int i = 0;
        int reminder = 0;
        while ((Math.pow(2, i) - 1) <= n) {
            i++;
            if ((Math.pow(2, i) - 1) == n && isPrime(n) == true) {
                reminder += 1;
            } else {
                reminder += 0;
            }
        } 
            
        if (reminder == 1) 
            return true;
        else 
            return false;
        
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = sc.nextInt();
        sc.close();
        
        System.out.printf("�e%d�ӱ��˽�Ʀ�:" , n);
        
          long i = 0;
          while ( n > 0) {
              i++;
              if (mersennePrime(i) == true) {
                  System.out.printf("%d ", i);
                  n--;
              }
        }
        
        
        
    }


}
