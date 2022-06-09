package com.xamplify.automation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	public static void main(String args[]) {
	      Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://139.59.1.205:5432/xamplify-category",
	            "postgres", "Xtremand12");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }

}
