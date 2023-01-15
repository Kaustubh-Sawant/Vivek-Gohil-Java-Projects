package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("main start");

		// Object Creation
		Account account = new Account();

//		account.accountNumber = 101;
//		account.name = "Vivek Gohil";
//		account.balance = 1000;

		account.setAccountNumber(101);
		System.out.println(account.getAccountNumber());

		// Function Calling
		account.withdraw(100);

		System.out.println("main end");

	}
}
