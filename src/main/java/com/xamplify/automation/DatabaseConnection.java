package com.xamplify.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private static Connection connection = null;

	static {
		String url = "jdbc:postgresql://139.59.1.205:5432/xamplify-category";
		String user = "postgres";
		String pass = "Xtremand12";
		try {
			System.err.println("*******Connecting To DataBase Using Credentials********");
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.err.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
	}

	public static Connection getDatabaseConnection() {
		if (connection == null) {
			System.err.println("New Connection Will Be Established");
		} else {
			System.err.println("Connection Already Established.");
		}
		return connection;
	}

	public static Statement getStatement() {
		Statement statement = null;
		try {
			if (connection == null) {
				connection = getDatabaseConnection();
			}
			statement = connection.createStatement();
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
			Connection con = getDatabaseConnection();
			Statement stmt = con.createStatement();
			// Execute the SQL Query. Store results in ResultSet
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}
