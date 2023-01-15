package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Current;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account;

		int accountNumber;
		String name;
		double balance;
		int accountChoice;

		System.out.println("Account Menu");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		System.out.println("Enter your choice");
		accountChoice = scanner.nextInt();
		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		account = getAccountByChoice(accountChoice, accountNumber, name, balance);
		if (account != null) {
			System.out.println("Your accout has been opened successfully");
			System.out.println("Account Number :: " + account.getAccountNumber());
			System.out.println("Name :: " + account.getName());
			System.out.println("Balance :: " + account.getBalance());
			if (accountChoice == 1) {
				Savings savings = (Savings) account;
				System.out.println("IsSalary  :: " + savings.isSalary());
			} else {
				Current current = (Current) account;
				System.out.println("Overdraft Limit  :: " + current.getOverdraftLimit());
			}
			do {
				showTransactionMenu(scanner, account, accountChoice);
			} while (true);

		} else {
			System.out.println("Invalid Choice!!");
			System.out.println("Thanks ");
		}

	}

	public static Account getAccountByChoice(int choice, int accountNumber, String name, double balance) {

		boolean isSalary;
		double overdraftLimit;

		Scanner scanner = new Scanner(System.in);

		if (choice == 1) {
			System.out.println("Do you want to open salary account(true/false)");
			isSalary = scanner.nextBoolean();
			return new Savings(accountNumber, name, balance, isSalary);
		}
		if (choice == 2) {
			System.out.println("Enter overdraft limit");
			overdraftLimit = scanner.nextDouble();
			return new Current(accountNumber, name, balance, overdraftLimit);
		}
		return null;
	}

	private static void showTransactionMenu(Scanner scanner, Account account, int accountChoice) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1. For Withdraw");
		System.out.println("Press 2. For Deposit");
		System.out.println("Press 3. For Check Balance");
		System.out.println("Press 4. For Exit");
		System.out.println("Enter your choice");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter amount to Withdraw");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdraw Successfull!");
			else
				System.out.println("Withdraw Failed");
			break;
		case '2':
			System.out.println("Enter amount to Deposit");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit Successfull!");
			else
				System.out.println("Deposit Failed");
			break;

		case '3':
			System.out.println("Balance :: " + account.getBalance());
			if (accountChoice == 2) {
				Current current = (Current) account;
				System.out.println("Overdraft Limit  :: " + current.getOverdraftLimit());
			}
			break;
		case '4':
			System.out.println("Thank you!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
