package com.guvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<Start>>>>>>.");
			// Database URL

			String url = "jdbc:mysql://localhost:3306/student";

			// Database credentials

			String username = "root";

			String password = "Professor@17";

			// Establish the connection

			try (Connection connection = DriverManager.getConnection(url, username, password)) 
			{ System.out.println("Connected to the database.");

			// Perform database operations here

			} catch (SQLException e) {

			System.err.println("Connection failed: "+e.getMessage());
	}

}}
