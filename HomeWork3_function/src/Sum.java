/*7.    ���j��ƪ��m��-Sum
�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
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
