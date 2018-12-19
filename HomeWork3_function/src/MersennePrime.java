/*5.    ㄧ计絤策-MersennePrime
糶ㄧ计boolean mersennePrime (int n)ノㄓ耞n琌Mersenne借计级糶祘Αт玡8Mersenne借计
矗ボ璝借计骸ì2P-1=n (pタ俱计)玥nMersenne Prime P = PΩよ
弧讽p=323-1=7珿7Mersenne Prime
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
        
        System.out.printf("玡%d宾此借计Τ:" , n);
        
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
