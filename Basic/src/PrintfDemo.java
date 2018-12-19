
public class PrintfDemo {

	public static void main(String[] args) {
		System.out.printf("/%5d/%n",123);
		System.out.printf("/%+5d/%n",123);
		System.out.printf("/%X/%n",123);
		System.out.printf("/%#X/%n",123);
		System.out.printf("/%f/%n",12345.678);
		System.out.printf("/%10.2f/%n",12345.678);
		System.out.printf("/%-10.1f/%n",12345.678);
		System.out.printf("/%010.2f/%n",12345.678);
		System.out.printf("/%10.2E/%n",12345.678);
		System.out.printf("/%,10.2f/%n",12345.678);
		System.out.printf("/%(10.1f/%n",-12345.678);
		System.out.printf("/%10s/%n","student");
		System.out.printf("/%C/%n",'a');
		System.out.printf("/%b/%n",3>7);
		System.out.printf("/%f/%n",50*0.85);
		System.out.printf("/%a/%n",50*0.85);
		System.out.printf("/%e/%n",50*0.85);
		System.out.printf("/%g/%n",50*0.85);
	}

}
