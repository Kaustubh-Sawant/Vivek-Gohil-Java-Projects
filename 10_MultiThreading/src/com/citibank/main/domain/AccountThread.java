package com.citibank.main.domain;

public class AccountThread implements Runnable {

	private Account account;
	private int transactionChoice;
	private double amount;

	public AccountThread(Account account, int transactionChoice, double amount) {
		this.account = account;
		this.transactionChoice = transactionChoice;
		this.amount = amount;
	}

	@Override
	public void run() {
		if (transactionChoice == 1) {
			if (account.withdraw(amount)) {
				System.out.println("Balance after withdraw :: " + account.getBalance());
			} else {
				System.out.println("Withdraw failed !!");
				System.out.println("Balance after withdraw :: " + account.getBalance());
			}
		} else if (account.deposit(amount)) {
			System.out.println("Balance after deposit :: " + account.getBalance());
		}
	}
}
