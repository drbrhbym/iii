
public class StaticDemo {

	int x;
	static int y; //or static int y = 10;
	
	static {
		y = 10;
	}
	
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		sd.x++;
		//x++; compile error
		System.out.println(sd.x);
		
		y++;
		System.out.println(y);
		//sd.y++; // warning message
		//System.out.println(y);		
		StaticDemo.y++;
		System.out.println(y);

	}

}
