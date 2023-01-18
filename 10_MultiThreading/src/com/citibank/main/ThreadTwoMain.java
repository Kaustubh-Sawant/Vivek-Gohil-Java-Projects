package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {
	public static void main(String[] args) {
		ThreadTwo threadTwo = new ThreadTwo();
		Thread thread = new Thread(threadTwo);
		
		thread.start();
	}
}
