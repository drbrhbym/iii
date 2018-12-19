/*7.    迴圏的練習-Rabbit
老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。
*/


public class Rabbit {


    public static void main(String[] args) {


        int num = 1;
        while (true) {
            if (num % 3 == 1 && num % 5 == 3 && num % 7 == 2)
                break;
            num++;
        }


        System.out.printf("兔子最少有%d隻。" , num);


    }


}
