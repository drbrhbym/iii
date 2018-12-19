/*2.    函數的練習-Sigma
寫一函數double my_fun (double x, int n)如下：
 
提示：利用上題的power(x,n)和課堂上的factorial(n)來完成。
*/


import java.util.Scanner;


public class Sigma {


    static double my_fun(double x , int n) {
        
        double num = 1;
        double result;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            num *= i;
            result = Math.pow(x, i) / num;
            sum += result;
        }
        
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input x , n for Sigma calculation:");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        
        System.out.printf("The answer is %.2f ." , my_fun(x , n));


        sc.close();
    }


}
