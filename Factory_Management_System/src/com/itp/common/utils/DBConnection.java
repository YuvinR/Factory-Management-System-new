package com.itp.common.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection extends CommonUtilities{
	

	private static Connection connection;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory_management_system","root","cubieboard");
//			return conn;
//			
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//			return null;
//		}catch(SQLException e) {
//			e.printStackTrace();
//			return null;
//			
//		}
//				
//	}
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
		if(connection==null || connection.isClosed()) {
			Class.forName(properties.getProperty(CommonConstants.DRIVER_NAME));
			connection = DriverManager.getConnection(properties.getProperty(CommonConstants.URL),
					properties.getProperty(CommonConstants.USERNAME), properties.getProperty(CommonConstants.PASSWORD));
			System.out.println("Connected");
			
			
		}
		
		return connection;
	}
	
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory_management_system","root","cubieboard");
			return conn;
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
}
