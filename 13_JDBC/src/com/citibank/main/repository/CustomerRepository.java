package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInteface {

	private List<Customer> customersList = new ArrayList<>();

	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int rowCount;

	@Override
	public boolean addNewCustomer(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "insert into customer_details(name,address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());

			rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				return true;
		} catch (SQLException e) {
			System.out.println("Exception while executing query");
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");

				Customer customer = new Customer(customerId, name, address);

				return customer;
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {

		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				int customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");

				Customer customer = new Customer(customerId, name, address);

				customersList.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

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
