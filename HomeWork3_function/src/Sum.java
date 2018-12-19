/*7.    遞迴函數的練習-Sum
寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。
*/




public class Sum {


    static int sum(int n) {
        
        if ( n == 0)
            return 0;
        else
            return 2*n + sum(n-1);
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.print(sum(4));


    }


}
