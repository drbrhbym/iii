/*4.    迴圏的練習-Amstrong
Amstrong數是指一個三位數的整數，其各位數之立方和等於該數本身。
找出所有的Amstrong數。
說明：153=13+53+33，故153為Amstrong數。 3= 3次方
*/




public class Amstrong {


    public static void main(String[] args) {
        
        System.out.println("三位數之中的Amstrong數有:");
        
        for (int num = 100; num <= 999; num++) {
            double pow1 = Math.pow((num / 100) , 3);
            double pow2 = Math.pow(((num % 100) / 10), 3);
            double pow3 = Math.pow(num % 10, 3);
            if ( num == pow1 + pow2 + pow3)
                System.out.printf("%d " , num);
        }
        
        System.out.println("。");
    }


}