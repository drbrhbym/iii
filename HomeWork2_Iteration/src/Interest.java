/*11.    �j��ԭz���m��-Interest
���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C(27�~��)
���ܡG��Q�����GP(1+r*n)    �ƧQ�����GP(1+r)n
P�G�����Ar�G�Q�v�An�G�h�֦~
*/


public class Interest {


    public static void main(String[] args) {


        int n = 1;
        double a;
        double b;
        do {


            a = 100000 * (1 + 0.1 * n);
            b = 100000 * Math.pow((1 + 0.05), n);
            n++;


        } while (a > b);


        System.out.println(n + "�~��A�q�Ӻ⪺���(" + (int)b + ")�i�H�W�L���르(" + (int)a + ")�C");


    }


}
