package com.guvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String query="select * from ssc limit 10 offset 3";//select * from ssc limit 10"  // offset 4 // 
	     String url="jdbc:mysql://localhost:3306/student";
	        String username="root";
	        String password="Professor@17";
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver load succesfully");
	        }catch (ClassNotFoundException e)
	        {
	            System.out.print(e.getMessage());
	        }

	        try {
	            Connection connection= DriverManager.getConnection(url,username,password);
	        //    Connection connection1=DriverManager.getConnection();
	          
	            
	            System.out.print("Connection created  succesfully");  
	            Statement stmt=connection.createStatement();
	            ResultSet rs=stmt.executeQuery(query);
	            
	            while(rs.next()) {
	            	int id=rs.getInt("Id");
	            	String name=rs.getString("city");
	            //	String country=rs.getString("county");	
	            	
	            	System.err.print(id+ " " + "");
	            	System.err.print(name);
	            	System.err.println("country");
	            }
	            
	        }catch (SQLException e) {
	        	
	        System.err.println("Connection failed: " + e.getMessage());
	    }
	         
	       // this is foe creatin SQL exception
	
	      /*  Connection conn = null;
	        Statement stmt = null;

	        try {
	            // Register JDBC driver
	            Class.forName("com.mysql.jdbc.Driver");

	            // Open a connection
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "username", "password");

	            // Execute a query
	            stmt = conn.createStatement();
	            String sql = "INSERT INTO employees (id, name) VALUES (1, 'John Doe')";
	            stmt.executeUpdate(sql);

	        } catch (SQLException se) {
	            // Handle errors for JDBC
	            se.printStackTrace();
	            System.out.println("SQLState: " + se.getSQLState());
	            System.out.println("Error Code: " + se.getErrorCode());
	            System.out.println("Message: " + se.getMessage());
	            Throwable t = se.getCause();
	            while (t != null) {
	                System.out.println("Cause: " + t);
	                t = t.getCause();
	            }
	        } catch (Exception e) {
	            // Handle errors for Class.forName
	            e.printStackTrace();
	        } finally {
	            // Finally block to close resources
	            try {
	                if (stmt != null) stmt.close();
	            } catch (SQLException se2) {
	            } // Nothing we can do
	            try {
	                if (conn != null) conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }*/
	    }
	}
	
	


