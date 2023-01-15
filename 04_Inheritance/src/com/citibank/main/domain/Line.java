package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("Default Constrcutor Of Line");
	}

	public Line(int size) {
		System.out.println("Param Constructor Of Line");
		System.out.println("Size :: " + size);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Line");
	}
}
