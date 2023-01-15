package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		super();
		System.out.println("Default Constructor Of Circle");
	}

	public Circle(int size) {
		super(size);
		System.out.println("Param Constructor Of Circle");
		System.out.println("Size :: " + size);
	}

//	@Override
//	public void draw() {
//		System.out.println("Drawing Circle");
//	}
	
	public void print() {
		System.out.println("Print of Circle");
	}
}



