package com.BusOwnerDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class BusOwnerDBConnection {
	
	//Create variable and assign connection value
			private static String url = "jdbc:mysql://localhost:3306/bus_details";
			private static String user = "root";
			private static String pass = "Lahiru12@";
			private static Connection con;
			

			public static Connection getConnection() {
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					con = DriverManager.getConnection(url, user, pass);
					
				}
				catch (Exception e) {
					System.out.println("Error!");
				}
				
				return con;
			}


}
