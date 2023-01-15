package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter num1");
			num1 = scanner.nextDouble();
			System.out.println("Enter num2");
			num2 = scanner.nextDouble();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				System.out.println("Thank you");
				scanner.close();
			} catch (Exception e) {
				// TODO: handle exception
			} finally {

			}
		}
	}

	public void calculate() {
		System.out.println("Calculating Result");
		result = num1 / num2;
	}

	public void display() {
		System.out.println("Result is :: " + result);
	}
}
