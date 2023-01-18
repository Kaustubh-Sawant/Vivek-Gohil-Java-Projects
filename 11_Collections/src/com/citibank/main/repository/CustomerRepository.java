package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInteface {

	private List<Customer> customersList = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customersList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		for (Customer customer : customersList) {
			if (customer.getCustomerId() == customerId) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customersList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		for (Customer c : customersList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				return true;
				// c = customer;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		for (Customer c : customersList) {
			if (c.getCustomerId() == customerId) {
				return customersList.remove(c);
			}
		}
		return false;
	}

}
