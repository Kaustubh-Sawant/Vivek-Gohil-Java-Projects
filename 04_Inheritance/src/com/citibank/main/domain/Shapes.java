package com.citibank.main.domain;

//Generalization
public abstract class Shapes extends Object {
	public Shapes() {
		System.out.println("Default Constructor Of Shapes");
	}

	public Shapes(int size) {
		System.out.println("Param Constrcutor Of Shapes");
		System.out.println("Size :: " + size);
	}

	public abstract void draw();

	public void convertShapes() {
		System.out.println("Converting Shapes");
	}

}
