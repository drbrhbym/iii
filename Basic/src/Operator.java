
public class Operator {

	public static void main(String[] args) {
		System.out.println(9/4);
		System.out.println(9.0/4);
		System.out.println(-9/4);
		System.out.println(-9.0%4);
		
		int sec = 456;
		System.out.println(sec +"��=" + sec/60 + "��" +  sec%60 + "��");
		System.out.printf("%d��=%d��%d��%n" , sec , sec/60, sec%60);
		
		System.out.println("3"+8+5);
        System.out.println(3+"8"+5);
        System.out.println(3+8+"5");
        
        int x = 3, y = 4, z;
     // z = ++x * y;
     // z = x++ * y;
     // z = (x++) * y;
     // z = (x++)+y;
        z = x+++y;
     // z = x+(++y);
        System.out.println("x = " + x + ", y= " + y + ", z = " + z);
        
        
	}

}
