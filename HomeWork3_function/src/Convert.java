/*8.    ㄧ计絤策-Convert
糶ㄢㄧ计だtoBinary(int n)㎝toHexidecimal(int n)ノㄓ盢n锣传Θ秈㎝せ秈
*/


public class Convert {


    static public double toBinary(int n) {


        int count = 0; // ノㄓ癘魁计
        double bin = 0; // ノㄓ癘魁程秈计
        int reminder = 0; // ノㄓ纗緇计
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
        int reminder; // 緇计


        while (n != 0) {
            reminder = n % 16;
            if (reminder > 9)
                result = hexChar[15 - reminder] + result; // 猔種抖(String逼)
            else
                result = reminder + result; // 猔種抖(String逼)
            n /= 16;
        }


        return result;


    }


    public static void main(String[] args) {


        System.out.println((int) toBinary(111));
        System.out.println(toHexdecimal(87549));
    }


}
