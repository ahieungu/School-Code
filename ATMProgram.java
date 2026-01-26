package Account;

import java.util.Scanner;

public class ATMProgram {
	public static void main (String[] args) {
		Scanner in  = new Scanner(System.in);
		Account myAccount = new Account ("Alex Tiger", 12345, 100.00);
		int choice = 0;
		
		while (choice != 5) {
			System.out.println();
			System.out.println("TigerBank ATM");
			System.out.println("1) Show account info");
			System.out.println("2) Deposit");
			System.out.println("3) Withdraw");
			System.out.println("4) Show balance");
			System.out.println("5) Exit");
			System.out.print("Enter choice: ");
			choice = in.nextInt();
			
			if (choice == 1) {
				myAccount.printInfo();
			} else if (choice == 2) {
				System.out.print("Amount to deposit: ");
				double amount = in.nextDouble();
				myAccount.deposit(amount);
			} else if (choice == 3) {
				System.out.print("Amount to withdraw: ");
				double amount = in.nextDouble();
				myAccount.withdraw(amount);
			} else if (choice == 4) {
				System.out.printf("Balance: $%.2f%n", myAccount.getBalance());
			} else if (choice == 5) {
				System.out.println("Goodbye!");
			}
			
		}
	}
}
