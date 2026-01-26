package Account;

public class Account {
	public String ownerName;
	private int accountNumber;
	private double balance; 
	
	public Account (String name, int number, double initialBalance) {
		ownerName = name;
		accountNumber = number;
		balance = initialBalance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}
	public void withdraw (double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Not enough money!");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void printInfo() {
	System.out.println("Owner: " + ownerName);
	System.out.println("Account: " + accountNumber);
	System.out.printf("Balance: $%.2f%n", balance);
	}
}