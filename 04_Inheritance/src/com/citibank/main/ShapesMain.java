package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {
	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		circle.draw();

//		Circle circle = new Circle();
//		circle.draw();
//		
//		circle.print();

//		Shapes shapes = new Circle();
//		shapes.print();

		// all the methods of base class and commn method of base
		// and child
//		Shapes shapes = new Circle();
//		shapes.convertShapes();

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Circle 2.Triangel 3.Line");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();

		Shapes shapes = getShape(choice);
		shapes.draw();
	}

	public static Shapes getShape(int choice) {
		if (choice == 1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if (choice == 2) {
			return new Triangle();
		}
		if (choice == 3) {
			return new Line();
		}
		return null;
	}

}
