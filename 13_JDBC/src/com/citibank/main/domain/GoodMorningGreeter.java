package com.citibank.main.domain;

public class GoodMorningGreeter implements Greeter {
	@Override
	public void greet() {
		System.out.println("Good Morning Java");
	}
}
