
/**
 * 
 */
package com.itp.login.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.itp.emp.model.Employee;
import com.itp.login.model.Login;
import com.itp.common.utils.CommonConstants;
import com.itp.common.utils.CommonUtilities;
import com.itp.common.utils.DBConnection;
import com.itp.common.utils.QueryUtilities;

/**
 * @author Yuvin Nimnaka
 *
 */
public class LoginServicesImpl implements ILoginServices {

	public static final Logger log = Logger.getLogger(LoginServicesImpl.class.getName());

	private static Connection connection;

	private static Statement statement;

	private static PreparedStatement preparedstatement;
	
	@Override
	public void addLogin(Login login) {
		
		String loginID = CommonUtilities.generateLoginID(getLoginIDs());
		
		try {

			connection = DBConnection.getDBConnection();

			preparedstatement = connection
					.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_INSERT_LOGIN));
			connection.setAutoCommit(false);

			// get login ids
			login.setLoginID(loginID);
			System.out.println(loginID);
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, login.getLoginID());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_TWO, login.getImg());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_THREE, login.getEmpID());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_FOUR, login.getFname());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_FIVE, login.getLname());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_SIX, login.getDesignation());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_SEVEN, login.getUsername());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_EIGHT, login.getPassword());
			preparedstatement.execute();
			connection.commit();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if (preparedstatement != null) {
					preparedstatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		
	}

	
	@Override
	public Login getLoginByID(String empoyeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ArrayList<Login> getLogin() {
		
		return actionOnLogin(null);
	}


	@Override
	public Login updateLogin(String loginID, Login login) {
	
		if(loginID != null && !loginID.isEmpty() ) {
			
			
			try {
				
				connection = DBConnection.getDBConnection();
				preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_UPDATE_LOGIN));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, login.getUsername());
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_TWO, login.getPassword());
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_THREE, login.getLoginID());
				preparedstatement.executeUpdate();
				
			}catch (SQLException | SAXException | IOException | ParserConfigurationException
					| ClassNotFoundException e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				try {
					if (preparedstatement != null) {
						preparedstatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
			
		}
		
		return null;
	}

	@Override
	public void removeLogin(String empID) {
	
		if (empID != null && !empID.isEmpty()) {

			try {
				connection = DBConnection.getDBConnection();
				preparedstatement = connection
						.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_REMOVE_LOGIN));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, empID);
				preparedstatement.executeUpdate();

			} catch (SQLException | SAXException | IOException | ParserConfigurationException
					| ClassNotFoundException e) {
				log.log(Level.SEVERE, e.getMessage());

			} finally {
				/*
				 * Close prepared statement and database connectivity at the end of transaction
				 */
				try {
					if (preparedstatement != null) {
						preparedstatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
		}
		
	}
	
	private ArrayList<String> getLoginIDs(){
		
		ArrayList<String> idList = new ArrayList<String>();
		try {

			connection = DBConnection.getDBConnection();
			preparedstatement = connection
					.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_LOGIN_IDS));
			ResultSet resultSet = preparedstatement.executeQuery();

			while (resultSet.next()) {
				idList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if (preparedstatement != null) {
					preparedstatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return idList;
	}

	private ArrayList<Login> actionOnLogin(String loginID){
		
		ArrayList<Login> loginList = new ArrayList<Login>();
	
		try {
			connection = DBConnection.getDBConnection();
			
			if(loginID != null && !loginID.isEmpty()) {
				
				preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_LOGIN_ID));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, loginID);
				
			}
			else {
				
				preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_ALL_LOGINS));
			}
			
			ResultSet resultSet = preparedstatement.executeQuery();
			
			while(resultSet.next()) {
				Login login = new Login();
				login.setLoginID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				login.setImg(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				login.setEmpID(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				login.setFname(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				login.setLname(resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE));
				login.setDesignation(resultSet.getString(CommonConstants.COLUMN_INDEX_SIX));
				login.setUsername(resultSet.getString(CommonConstants.COLUMN_INDEX_SEVEN));
				login.setPassword(resultSet.getString(CommonConstants.COLUMN_INDEX_EIGHT));
				loginList.add(login);
			}
			
		}catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
			System.out.println("Get Employee Exception");
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedstatement != null) {
					preparedstatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		
		return loginList;
	
	}
}
