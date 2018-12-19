
public class AccountMain {
	public static void main(String[] args) {

		/*Account a1 = new Account("127333", 57730.0);
		a1.printAccData();
		
		CheckingAccount a2 = new CheckingAccount ("837444" , 18730 , 20);
		a2.printAccData();*/
		
		Account[] a = new Account[2];
		a[0] = new Account("127333", 57730.0);
		a[1] = new CheckingAccount ("837444" , 18730 , 20);
		for (int i = 0; i < a.length; i ++) {
			a[i].printAccData();
		}
		
	}
}
