/*2.    ��ƪ��m��-Sigma
�g�@���double my_fun (double x, int n)�p�U�G
 
���ܡG�Q�ΤW�D��power(x,n)�M�Ұ�W��factorial(n)�ӧ����C
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
