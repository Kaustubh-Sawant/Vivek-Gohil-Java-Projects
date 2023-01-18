package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		System.out.println("Main start");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully ");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("Connection Successfull");
			String sql = "insert into customer_details(name,address) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			int i = 0;
			do {
				preparedStatement.setString(1, "Vivek Gohil");
				preparedStatement.setString(2, "Mumbai");
				int rowCount = preparedStatement.executeUpdate();
				if (rowCount > 0) {
					System.out.println("Recored inserted successfully");
				} else {
					System.out.println("No rows inserted!!");
				}
				i++;
			} while (i < 5);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found!!");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Main end");
	}
}
