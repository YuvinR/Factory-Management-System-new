package com.itp.login.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itp.common.utils.CommonConstants;
import com.itp.common.utils.DBConnection;
import com.itp.common.utils.QueryUtilities;
import com.sun.crypto.provider.RSACipher;



public class LoginHandlingServices {

	private static Connection connection;

	private static Statement statement;

	private static PreparedStatement preparedstatement;
	
	
	public boolean loginValidation(String username, String passwrd) {
		
		String designationType = findDesignation(username, passwrd);
		
		try {
			connection = DBConnection.getDBConnection();
			
			preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_LOGIN_CREDS));
			connection.setAutoCommit(false);
			
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, username);
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_TWO, passwrd);
			
			ResultSet rs = preparedstatement.executeQuery();
			
			if(rs.next()) {
				
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
		
	}
	
	public String findDesignation(String uname, String pwrd) {
		
		String designation="";
		
		try {
			connection = DBConnection.getDBConnection();
			
			preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_LOGIN_CREDS));
			connection.setAutoCommit(false);
			
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, uname);
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_TWO, pwrd);
			
			ResultSet rs = preparedstatement.executeQuery();
			
			if(rs.next()) {
				
			designation = rs.getString(1);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return designation;
		
	}
	
	
}
