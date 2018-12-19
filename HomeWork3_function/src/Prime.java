/*4.    ㄧ计絤策-Prime
糶ㄧ计int prime (int n)ノㄓт材n借计
*/


import java.util.Scanner;


public class Prime {
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


    static int prime(int n) {


        int i = 0;
        while (true) {
            i++;
            if (isPrime(i) == true) {
                n--;
                if (n == 0) {
                    break;
                }
            }
        }
        
        return i;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int n = sc.nextInt();


        System.out.printf("材%d借计琌%d" , n , prime(n));
        sc.close();


    }


}




/*int i = 2, j = 1;
        while (true) {
            j = j + 1;
            if (j > i / j) {
                n--;
                if (n == 0) 
                    break;
                j = 1;
            }
            if (i % j == 0) {
                i++;
                j = 1;
            }
        }
        return i;
*/
