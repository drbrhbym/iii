
public class GenericsDemo3 {

	public static void main(String[] args) {
		MyStack<Integer> s1 = new MyStack<>();
		s1.push(1);
		s1.push(3);
		s1.push(5);
		s1.push(99);
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
		System.out.println("============");
		
		MyStack<String> s2 = new MyStack<>();
		s2.push("Hello");
		s2.push("Good");
		s2.push("Morning");
		s2.push("Thursday");
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		

	}

}
