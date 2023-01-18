package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

class CalculationsMain {
	public static void main(String[] args) {
		// addition
		CalculationsInterface calculationsInterface = new CalculationsInterface() {
			@Override
			public double doCalculations(double number1, double number2) {
				return number1 + number2;
			}
		};

		double result = calculationsInterface.doCalculations(10, 20);
		System.out.println("Addition :: " + result);

		System.out.println("----------------------------");
		calculationsInterface = (n1, n2) -> n1 + n2;
		System.out.println("Result :: " + calculationsInterface.doCalculations(10, 20));
		System.out.println("----------------------------");

		CalculationsInterface calculationsInterface2 = (n1, n2) -> {
			double res = n1 + n2;
			return res;
		};

		result = calculationsInterface2.doCalculations(10, 20);
		System.out.println("Result :: " + result);

	}
}
