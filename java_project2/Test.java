package java_project2;

public class Test {
	public static void main(String[] args) {
		GenericBank hb1 = new GenericBank();
		hb1.welcome();
		hb1.deposit(1000);
		hb1.checkBalance();
		hb1.withdraw(500);
		hb1.checkBalance();
		
		GenericBank hb = new HdfcBank();
		hb.welcome();
		hb.deposit(2000);
		hb.checkBalance();
		hb.withdraw(1000);
		hb.checkBalance();
	}
}