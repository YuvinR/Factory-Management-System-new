package com.itp.leave.services;

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

import com.itp.common.utils.CommonConstants;
import com.itp.common.utils.DBConnection;
import com.itp.common.utils.QueryUtilities;
import com.itp.emp.model.Employee;
import com.itp.emp.services.EmployeeServiceImpl;
import com.itp.leave.model.Leave;

public class LeaveServiceImpl implements ILeaveImplementation{

	public static final Logger log = Logger.getLogger(LeaveServiceImpl.class.getName());

	private static Connection connection;

	private static Statement statement;

	private static PreparedStatement preparedstatement;
	
	@Override
	public void addLeave(Leave leave) {
		try {

			connection = DBConnection.getDBConnection();

			preparedstatement = connection
					.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_INSERT_LEAVE));
			connection.setAutoCommit(false);

			// get employee ids
//			employee.setEmployeeID(employeeID);
			
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, leave.getLeaveid());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_TWO, leave.getEmpid());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_THREE, leave.getName());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_FOUR, leave.getDate());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_FIVE, leave.getDescription());
			

			preparedstatement.execute();
			connection.commit();

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			
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
	public ArrayList<Leave> getLeave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateLeave(String leaveID, Leave employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLeave(String leaveID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<String> getLeaveIDs() {
		// TODO Auto-generated method stub
		ArrayList<String> idList = new ArrayList<String>();
		try {

			connection = DBConnection.getDBConnection();
			preparedstatement = connection
					.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_LEAVE_IDS));
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
	private ArrayList<Leave> actionOnLeave(String leaveID){
		
		
		ArrayList<Leave> leaveList = new ArrayList<Leave>();
		
		try {
			connection = DBConnection.getDBConnection();
			
			
			if(leaveID != null && !leaveID.isEmpty()) {
				
				preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_LEAVE_ID));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, leaveID);
				
				
			}
			
			else {
				
				preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_ALL_LEAVES));
				
			}
			
			ResultSet resultSet = preparedstatement.executeQuery();
			
			while (resultSet.next()) {
				Leave leave = new Leave();
				leave.setLeaveid(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				leave.setEmpid(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				leave.setName(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				leave.setDate(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				leave.setDescription(resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE));
				
				leaveList.add(leave);
			}
			
		}catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
			System.out.println("Get Leave Exception");
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
		
		return leaveList;
	}

}
