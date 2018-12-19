/*8.    迴圏的練習-Password
出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
若輸入不正確，再次出現”請輸入密碼”的提示。
若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。
*/


import java.util.Scanner;


public class Password {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        do {
            System.out.println("Please input password:");
            String pwd = sc.next();
            if (pwd.equals("123456")) {    
                 System.out.println("\nWelcome to this system!");
                 count = count +4;
            } else {
                count++;
            }
            if (count == 3)
                System.out.println("\nOver three times, you are out!!!");
        } while ( count < 3 );
    
        sc.close();
}
}
