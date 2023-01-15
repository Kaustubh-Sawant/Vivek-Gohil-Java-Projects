package com.citibank.main;

import com.citibank.main.domain.Current;

public class BankingApplicationMainV5 {

	public static void main(String[] args) {
		Current current = new Current(101, "Vivek Gohil", 10000, 50000);

		if (current.withdraw(5000)) {
			System.out.println("withdraw :: 5000");
			// 5000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}

		if (current.withdraw(20000)) {
			System.out.println("withdraw :: 20000");
			// 0
			System.out.println("Balance :: " + current.getBalance());
			// 35000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}

		if (current.deposit(10000)) {
			System.out.println("deposit :: 10000");
			// 0
			System.out.println("Balance :: " + current.getBalance());
			// 45000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}

		if (current.deposit(15000)) {
			System.out.println("deposit :: 15000");
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}

		if (current.deposit(5000)) {
			System.out.println("deposit :: 5000");
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());

		}

		if (current.withdraw(70000)) {
			System.out.println("withdraw :: 70000");
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		} else {
			System.out.println("Transaction Failed");
			// 10000
			System.out.println("Balance :: " + current.getBalance());
			// 50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}
	}

}
