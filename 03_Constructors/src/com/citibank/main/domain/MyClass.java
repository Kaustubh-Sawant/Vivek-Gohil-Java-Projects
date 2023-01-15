package com.citibank.main.domain;

public class MyClass {

	public MyClass() {
		System.out.println("Default constructor of MyClass");
	}

	public MyClass(int i) {
		System.out.println("Integer param constructor of MyClass");
	}

	public MyClass(int i, int j) {
		System.out.println("Integer two param constructor of MyClass");
	}

	public MyClass(String s) {
		System.out.println("String param constructor of MyClass");
	}

	public void show() {
		System.out.println("Hi");
	}

}
