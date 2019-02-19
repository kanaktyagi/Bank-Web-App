package com.test.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class Dbconnection {

	public static Connection getConnectionToDb()
	{
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("mysql driver loaded");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks_data","root","kanak1");
		   
		}
		catch(SQLException e)
		{
			System.out.println("connection fail");
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("driver class not found");
			e.printStackTrace();
		}
		
		if(connection!=null)
		{
			System.out.println("connection made to database");
		}
	
	
	return connection;
	}
}
