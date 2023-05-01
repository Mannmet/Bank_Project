package java_project2;

public class GenericBank {
	public void welcome() {
		System.out.println("Welcome");
	}
	
	protected int bankBalance;
	
	public void deposit(int amount) {
		bankBalance += amount;
		System.out.println(amount + " deposited. Current balance: " + bankBalance);
	}
	
	public void withdraw(int amount) {
		if (amount > bankBalance) {
		System.out.println("Insufficient balance.");
		} else {
		bankBalance -= amount;
		System.out.println(amount + " withdrawn. Current balance: " + bankBalance);
		}
	}
	
	public void checkBalance() {
		System.out.println("Current balance: " + bankBalance);
		}
	}
	
