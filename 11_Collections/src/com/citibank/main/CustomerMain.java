package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Kapil", "Pune");
		Customer customer3 = new Customer(103, "Paritosh", "Pune");
		Customer customer4 = new Customer(104, "Uday", "Pune");
		Customer customer5 = new Customer(105, "Abhishek", "Pune");

		List<Customer> customerList = new ArrayList<>();

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		printAllCustomers(customerList);

		Scanner scanner = new Scanner(System.in);
//		int customerId;
//		System.out.println("Enter CustomerId :: ");
//		customerId = scanner.nextInt();
//
//		printCustomerByCustomerId(customerList, customerId);

//		int customerId;
//		String name, address;
//		System.out.println("Enter CustomerId :: ");
//		customerId = scanner.nextInt();
//
//		scanner.nextLine();
//
//		System.out.println("Enter New Name");
//		name = scanner.nextLine();
//
//		System.out.println("Enter New Address");
//		address = scanner.nextLine();
//
//		Customer updateCustomer = new Customer(customerId, name, address);
//		updateCustomerByCustomerId(customerList, updateCustomer);

		int customerId;
		System.out.println("Enter CustomerId :: ");
		customerId = scanner.nextInt();
		deleteCustomerByCustomerId(customerList, customerId);

		System.out.println();

		printAllCustomers(customerList);

	}

	private static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer) {
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				flag = true;
				System.out.println("Customer details are updated successfully!!");
				break;
			}
		}
		if (flag == false) {
			System.out.println("No customer found for given customerId");
		}
	}

	private static void deleteCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				customerList.remove(customer);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("No customer found for given customerId");
		}
	}

	private static void printCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				System.out.println(customer);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("No customer found for given customerId");
		}
	}

	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}
