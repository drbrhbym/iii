/*8.    ��ƪ��m��-Convert
�g��Ө�Ƥ��O��toBinary(int n)�MtoHexidecimal(int n)�ΨӱNn�ഫ���G�i��M�Q���i��ȡC
*/


public class Convert {


    static public double toBinary(int n) {


        int count = 0; // �ΨӰO�����
        double bin = 0; // �ΨӰO���̫᪺�G�i���
        int reminder = 0; // �ΨӦs�x�l��
        while (n != 0) {
            reminder = n % 2;
            n = n / 2;
            bin += reminder * Math.pow(10, count);
            count++;
        }
        return bin;


    }


    static public String toHexdecimal(int n) {


        char[] hexChar = { 'F', 'E', 'D', 'C', 'B', 'A' };


        String result = ""; // Store final result
        int reminder; // �l��


        while (n != 0) {
            reminder = n % 16;
            if (reminder > 9)
                result = hexChar[15 - reminder] + result; // �`�N����(String�ƦC)
            else
                result = reminder + result; // �`�N����(String�ƦC)
            n /= 16;
        }


        return result;


    }


    public static void main(String[] args) {


        System.out.println((int) toBinary(111));
        System.out.println(toHexdecimal(87549));
    }


}
