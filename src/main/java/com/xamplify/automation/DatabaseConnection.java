package com.xamplify.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	static Connection connection;
	
	public static Connection getDatabaseConnection() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
			e.printStackTrace();
		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection("jdbc:postgresql://139.59.1.205:5432/xamplify-category", "postgres", "Xtremand12");
			//jdbc:postgresql://xamplify-postgresql-sfo2-dec-6-backup-jan-24-backup-do-user-134.db.ondigitalocean.com:25060/xamplify-test?sslmode=require
			//jdbc:postgresql://xamplify-postgresql-sfo2-do-user-1344108-0.db.ondigitalocean.com:25060/xamplify-release?sslmode=require
			
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		if(connection==null) {
			System.out.println("connecting database again");
			connection = getDatabaseConnection();
			}
		else {
			System.out.println("Database Already connected");
		}
		return connection;
	}
	
	public static Statement getStatement() {
		Statement statement = null;
		try {
			if(connection==null) {
				connection = getDatabaseConnection();
			}
			statement =  connection.createStatement();
		} catch (SQLException e) {
			System.out.println("Error in getStatement()");
			e.printStackTrace();
		}
		
		return statement;
		
	}
	
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Failed to close the connection");
			e.printStackTrace();
		}
	}
	
	public static ResultSet getResultSet(String query) {
		ResultSet rs = null;
		try {
			Connection con  = getDatabaseConnection();
			Statement stmt = con.createStatement();					
			// Execute the SQL Query. Store results in ResultSet		
			rs= stmt.executeQuery(query);							
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return rs;
	}

}
