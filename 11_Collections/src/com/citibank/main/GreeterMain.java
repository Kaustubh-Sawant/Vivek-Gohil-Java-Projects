package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {
	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();
		greeter.greet();
		System.out.println("-----------------------");

		Greeter goodEveningGreeter = new Greeter() {
			@Override
			public void greet() {
				System.out.println("Good Evening Java");
			}
		};
		goodEveningGreeter.greet();
		System.out.println("-----------------------");

		Greeter greeter2 = () -> {
			System.out.println("This is lambda code");
		};

		greeter2.greet();

		Greeter goodNightGreeter = () -> System.out.println("Good Night Java");
		goodNightGreeter.greet();

		Runnable runnable = () -> System.out.println("We are in thread");
		Thread thread = new Thread(runnable);
		thread.start();

		System.out.println("--------------------------");

		Thread thread2 = new Thread(() -> System.out.println("We are in thread"));
		thread2.start();

		System.out.println("--------------------------");
		new Thread(() -> System.out.println("We are in thread")).start();
		System.out.println("--------------------------");
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread is running");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
}
