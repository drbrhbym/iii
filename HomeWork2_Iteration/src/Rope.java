/*6.    迴圏的練習-Rope
若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。
*/


public class Rope {


    public static void main(String[] args) {


        int day = 1; 
        int length = 3500; 
        while (true) { 
            length = length / 2;
            if (length < 5) {
                break; 
            }
            day++;
        }
        System.out.printf("總共要花%d天才能小於5公尺", day);


    }


}
