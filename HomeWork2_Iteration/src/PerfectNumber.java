/*3. 迴圏的練習-PerfectNumber
一個數字若等於其所有因數的總和，則此數為perfect number。
找出100以內所有的完美數。
說明：6的因數為1, 2, 3，6=1+2+3，故6為完美數。
*/


public class PerfectNumber {


public static void main(String[] args) {


System.out.print("1 ~ 100中的完美數有:");
for (int num = 2; num <= 100; num++) {
int sum = 0;
for (int i = 1; i < num; i++) {
if (num % i == 0) {
sum += i;
}


}
if (sum == num) {
System.out.printf("%d ",num);
}
}
System.out.print("。");
}
}
