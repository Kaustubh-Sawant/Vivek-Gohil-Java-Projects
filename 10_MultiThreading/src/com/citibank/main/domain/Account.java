package com.citibank.main.domain;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public synchronized boolean withdraw(double amount) {
		System.out.println("Withdraw start");
		if (amount > 0 && amount > balance) {
			try {
				System.out.println("Waiting for Deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (amount > 0 && amount <= balance) {
			System.out.println("Withdraw started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = balance - amount;
			System.out.println("Withdraw Balance :: " + balance);
			System.out.println("Withdraw end");
			return true;
		}

		System.out.println("Withdraw end");
		return false;
	}

	public synchronized boolean deposit(double amount) {
		System.out.println("Deposit start");
		if (amount > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance + amount;
			System.out.println("Deposit Balance :: " + balance);
			System.out.println("Deposit end");
			notify();
			return true;
		}
		System.out.println("Deposit end");
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
