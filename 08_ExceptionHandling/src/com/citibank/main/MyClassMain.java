package com.citibank.main;

import java.util.InputMismatchException;

import com.citibank.main.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyClass myClass = new MyClass();
		myClass.accept();
		myClass.calculate();
		myClass.display();
		System.out.println("Main end");
	}
}
