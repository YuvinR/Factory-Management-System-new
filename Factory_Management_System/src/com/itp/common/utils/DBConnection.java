package com.itp.common.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection extends CommonUtilities{
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","yuvin123");
			return conn;
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
			
		}
				
	}
	
//	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
//		if(connection==null || connection.isClosed()) {
//			Class.forName(properties.getProperty(CommanConstants.DRIVER_NAME));
//			connection = DriverManager.getConnection(properties.getProperty(CommanConstants.URL),
//					properties.getProperty(CommanConstants.USERNAME), properties.getProperty(CommanConstants.PASSWORD));
//			System.out.println("Connected");
//		}
//		
//		return connection;
//	}
//	}
}
