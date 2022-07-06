package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter the account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(holder, number, initialDeposit);
		}
		else {
			bank = new Bank(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		bank.withdraw(withDrawValue);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		sc.close();
		
	}

}
