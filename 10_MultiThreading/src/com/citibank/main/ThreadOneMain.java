package com.citibank.main;

import com.citibank.main.domain.ThreadOne;

public class ThreadOneMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		ThreadOne threadOne = new ThreadOne();

		threadOne.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("main :: " + i);
		}

		System.out.println("Main end");
	}
}
