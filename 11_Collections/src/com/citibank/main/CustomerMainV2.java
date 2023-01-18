package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();

		// add 5 customers
		System.out.println("Adding Customers");
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Kapil", "Pune");
		Customer customer3 = new Customer(103, "Paritosh", "Pune");
		Customer customer4 = new Customer(104, "Uday", "Pune");
		Customer customer5 = new Customer(105, "Abhishek", "Pune");
		Customer customer6 = new Customer(105, "Abhishek", "Pune");

		System.out.println("Adding First Customer :: " + customerService.addNewCustomer(customer1));
		System.out.println("Adding Second Customer :: " + customerService.addNewCustomer(customer2));
		System.out.println("Adding Third Customer :: " + customerService.addNewCustomer(customer3));
		System.out.println("Adding Forth Customer :: " + customerService.addNewCustomer(customer4));
		System.out.println("Adding Fifth Customer :: " + customerService.addNewCustomer(customer5));
		System.out.println("Adding Fifth Customer :: " + customerService.addNewCustomer(customer6));

		System.out.println("-------------------------------------");
		System.out.println("Reading all customers from database");
		List<Customer> customerList = customerService.getAllCustomers();
		// System.out.println(customerList);
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		
//		System.out.println("-------------------------------------");
//		System.out.println("Read One customer from database");
//		Customer customer = customerService.getCustomerByCustomerId(101);
//		System.out.println(customer);
//		
//		System.out.println("-------------------------------------");
//		System.out.println("Update Customer Details");
//		Customer customerUpdated = new Customer(101, "Vivek", "Bombay");
//		boolean result = customerService.updateCustomerByCustomerId(customerUpdated);
//		if(result) 
//			System.out.println("Updated Successfully");
//		else
//			System.out.println("No customer found!!");
//		
		
	}
}







