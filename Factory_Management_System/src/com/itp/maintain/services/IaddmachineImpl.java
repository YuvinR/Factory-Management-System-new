package com.itp.maintain.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.itp.emp.model.Employee;
import com.itp.login.model.Login;
import com.itp.maintain.model.addmechine;
import com.itp.common.utils.CommonConstants;
import com.itp.common.utils.DBConnection;
import com.itp.common.utils.QueryUtilities;
import com.mysql.cj.protocol.Resultset;

public class IaddmachineImpl {

	public static final Logger log = Logger.getLogger(IaddmachineImpl.class.getName());

	private static Connection connection;

	private static PreparedStatement preparedstatement;

	public ArrayList<addmechine> getMachines() {

		return viewMachines(null);
	}
	
	
	public void addmechinemethod(addmechine AM) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DBConnection.getDBConnection();
			PreparedStatement pStatement=conn.prepareStatement("INSERT INTO view_machines (machine_no, machine_brand, value, date_of_buy, date_of_fixed) values(?,?,?,?,?)");
			conn.setAutoCommit(false);
			pStatement.setString(1 , AM.getMachine_Number());
			pStatement.setString(2, AM.getMachine_Brand());
			pStatement.setDouble(3, AM.getValue());
			pStatement.setString(4, AM.getDate_of_buy());
			pStatement.setString(5, AM.getDate_of_fixed());
			pStatement.execute();
			conn.commit();
		
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public ArrayList<addmechine> viewMachines(String machineID) {

		ArrayList dataList = new ArrayList<>();

		try {

			connection = DBConnection.getDBConnection();

			preparedstatement = connection.prepareStatement("select * from view_machines");

			ResultSet resultset = preparedstatement.executeQuery();

			while (resultset.next()) {

				addmechine vadd = new addmechine();

				vadd.setMachine_Number(resultset.getString(CommonConstants.COLUMN_INDEX_ONE));
				vadd.setMachine_Brand(resultset.getString(CommonConstants.COLUMN_INDEX_TWO));
				vadd.setValue(resultset.getDouble(CommonConstants.COLUMN_INDEX_THREE));
				vadd.setDate_of_buy(resultset.getString(CommonConstants.COLUMN_INDEX_FOUR));
				vadd.setDate_of_fixed(resultset.getString(CommonConstants.COLUMN_INDEX_FIVE));

				dataList.add(vadd);
			}

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
			System.out.println("Get Employee Exception");
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
				// log.log(Level.SEVERE, e.getMessage());
			}
		}

		return dataList;

	}

	public ArrayList<String> getMachineIDs() {

		ArrayList<String> machineList = new ArrayList<String>();

		try {

			connection = DBConnection.getDBConnection();
			preparedstatement = connection
					.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_MACHINE_IDS));

			ResultSet resultSet = preparedstatement.executeQuery();

			while (resultSet.next()) {
				machineList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			e.getMessage();
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
				e.getMessage();
			}
		}
		return machineList;

	}
	
	public void removeMachine(String machineID) {

		if (machineID != null && !machineID.isEmpty()) {

			try {
				connection = DBConnection.getDBConnection();
				preparedstatement = connection
						.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_REMOVE_MACHINES));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, machineID);
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
	
	public addmechine updateMachine(String mid, addmechine am) {
		
		if(mid != null && !mid.isEmpty() ) {
			
			
			try {
				
				connection = DBConnection.getDBConnection();
				preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_UPDATE_MACHINES));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, am.getMachine_Brand());
				preparedstatement.setDouble(CommonConstants.COLUMN_INDEX_TWO, am.getValue());
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_THREE, am.getDate_of_buy());
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_FOUR, am.getDate_of_fixed());
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_FIVE, am.getMachine_Number());
				
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


}
