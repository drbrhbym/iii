/*10.    迴圈敘述的練習-NineNine
   印出下列九九乘法表：


           |    1    2    3    4    5    6    7    8    9
    -----------------------------------------------------------------
     9    |    9    18    27    36    45    54    63    72    81
     8    |    8    16    24    32    40    48    56    64
     7    |    7    14    21    28    35    42    49
     6    |    6    12    18    24    30    36
     5    |    5    10    15    20    25
     4    |    4    8    12    16
     3    |    3    6    9
     2    |    2    4
     1    |     1
*/


public class NineNine {


    public static void main(String[] args) {


        System.out.print("   |");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%4d", i);


        System.out.println("\n-----------------------------------------------------");


        for (int j = 9; j >= 1; j--) {
            System.out.print(" " + j +" |" + "   ");
            for (int k = 1; k <= j; k++)
                System.out.printf("%-4d" ,j * k);
            System.out.println();
        }


    }


}
