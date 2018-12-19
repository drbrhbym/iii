/*11.    迴圈敘述的練習-Interest
錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
提示：單利公式：P(1+r*n)    複利公式：P(1+r)n
P：本金，r：利率，n：多少年
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


        System.out.println(n + "年後，郝細算的投資(" + (int)b + ")可以超過錢精打(" + (int)a + ")。");


    }


}
