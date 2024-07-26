package com.guvi;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.LogManager;

public class Jdbc {
	  //private static Logger logger = LogManager.getLogManager(Jdbc.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String q ="Select from avengers where country=us";
String url="jdbc:mysql://localhost:3306/marvel";
String username="root";
String password="Professor@17";

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Jdbc.main()driver load>>>");
	
}catch(ClassNotFoundException e)
{
	
	   
	       
System.err.println(e.getLocalizedMessage());
}

try {
	Connection con2 = DriverManager.getConnection(url,username,password);
	System.err.println("<<Driver load sucessfully>>");

	 Connection connection= DriverManager.getConnection(url,username,password);
     //    Connection connection1=DriverManager.getConnection();
         System.out.print("Connection created  succesfully");  
         Statement stmt=connection.createStatement();
         ResultSet rs=stmt.executeQuery(q);
         while(rs.next()) {
         	int id=rs.getInt("Id");
         	//String name=rs.getString("city");
         //	String country=rs.getString("county");	
         //	System.err.print(id+ " " + "");
         	//System.err.print(name);
         catch (SQLException e) {
	// TODO: handle exception
	}

}
