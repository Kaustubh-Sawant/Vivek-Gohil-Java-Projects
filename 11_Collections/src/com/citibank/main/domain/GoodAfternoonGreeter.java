package com.citibank.main.domain;

public class GoodAfternoonGreeter implements Greeter {
	@Override
	public void greet() {
		System.out.println("Good Afternoon Java");
	}
}
