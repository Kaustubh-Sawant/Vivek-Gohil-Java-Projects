package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account(50000);

		AccountThread accountWithdrawThread = new AccountThread(account, 1, 51000);
		Thread withdrawThread = new Thread(accountWithdrawThread);
		withdrawThread.start();

		System.out.println("---------------------------");

		AccountThread accountDepositThread = new AccountThread(account, 2, 2000);
		Thread depositThread = new Thread(accountDepositThread);
		depositThread.start();

	}
}
