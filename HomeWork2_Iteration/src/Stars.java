/*(1)    *         (2)   * * * * *    (3)         *
        * *               * * * *            * * *
        * * *               * * *          * * * * *  
        * * * *               * *        * * * * * * *
        * * * * *               *      * * * * * * * * *
*/


public class Stars {


    public static void main(String[] args) {
        System.out.println("(1)\n");


        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                if (a >= b)
                    System.out.print("*");


            }
            System.out.println();
        }


        System.out.println("\n(2)\n");


        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if (i >= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }


        System.out.println("\n(3)\n");
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5 - x; y++)
                System.out.print(" ");
            for (int z = 1; z <= x + x - 1; z++)
                System.out.print("*");
            System.out.println();
        }


    }


}
