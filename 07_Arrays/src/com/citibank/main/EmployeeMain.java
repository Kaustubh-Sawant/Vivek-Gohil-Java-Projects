package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Vivek", 1000);
		Employee employee2 = new Employee(102, "Paritosh", 1000);
		Employee employee3 = new Employee(103, "Kapil", 1000);
		Employee employee4 = new Employee(104, "Debayan", 1000);
		Employee employee5 = new Employee(105, "Uday", 1000);

		System.out.println(employee1.getEmployeeId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getSalary());

		System.out.println("-------------------------");

		System.out.println(employee1.toString());
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);

		System.out.println("-------------------------");

		Employee[] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter employeeId");
			employeeId = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter Salary");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i] = employee;
			System.out.println();
		}
		System.out.println("All Employees");
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}
}


