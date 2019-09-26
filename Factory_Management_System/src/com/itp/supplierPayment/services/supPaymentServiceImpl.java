package com.itp.supplierPayment.services;

import java.beans.Statement;
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

import com.itp.common.utils.CommonConstants;
import com.itp.common.utils.CommonUtilities;
import com.itp.common.utils.DBConnection;
import com.itp.common.utils.QueryUtilities;
import com.itp.sup.model.Supplier;
import com.itp.supplierPayment.model.supplierPayment;

public class supPaymentServiceImpl implements ISupPaymentServices {

	/*Initialize logger */
	public static final Logger log =Logger.getLogger(supPaymentServiceImpl.class.getName());
	
	private static Connection connection;
	
	private static Statement statement;
	
	private static PreparedStatement preparedstatement;
	
	/* ADD SUPPLIER PAYMENT BEGIN*/
	
	@Override
	public void addSupPayment(supplierPayment supPayment) {
		
		String supPaymentID = CommonUtilities.generateSupplierPaymentID(getSupPaymentIDs());
		
		try {
			connection = DBConnection.getDBConnection();
			
			preparedstatement = connection.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_INSERT_SupplierPayment));
			connection.setAutoCommit(false);
			
			supPayment.setSupPaymentID(supPaymentID);
			
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, supPayment.getSupPaymentID());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_TWO, supPayment.getSupplierID());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_THREE, supPayment.getRawID());
			preparedstatement.setString(CommonConstants.COLUMN_INDEX_FOUR, supPayment.getRawName());
			preparedstatement.setDouble(CommonConstants.COLUMN_INDEX_FIVE, supPayment.getQty());
			preparedstatement.setDouble(CommonConstants.COLUMN_INDEX_SIX, supPayment.getUnitPrice());
			preparedstatement.setDouble(CommonConstants.COLUMN_INDEX_SEVEN, supPayment.getTotalPrice());
			preparedstatement.execute();
			connection.commit();
			
		}catch (SQLException | SAXException | ParserConfigurationException | ClassNotFoundException | IOException e) {
			
			System.out.println(e);
			System.out.println("Error");
			
		}finally {
			
			try {
				if(preparedstatement != null) {
					preparedstatement.close();
				}
				if (connection != null) {
					connection.close();
					
				}
			}catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
				
			}
		}
	}/*Add supplier payment end*/

	public ArrayList<String> getSupPaymentIDs() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * List of supplier payment IDs will be retrieved from Factory.xml
		 */
		try {
			connection = DBConnection.getDBConnection();
			preparedstatement = connection
					.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_SupplierPayment_IDS));
			ResultSet resultSet = preparedstatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}
		} catch (SQLException | SAXException | IOException | ParserConfigurationException
				| ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
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
		return arrayList;

		
	}

	@Override
	public supplierPayment getSupPaymenyByID(String supPaymentID) {
		
		return actionOnsupPayment(supPaymentID).get(0);
	}

	@Override
	public ArrayList<supplierPayment> getSupPayments() {
		
		return  actionOnsupPayment(null);
	}

	private ArrayList<supplierPayment> actionOnsupPayment(String supPaymentID) {

		ArrayList<supplierPayment> supPaymentList = new ArrayList<supplierPayment>();
		try {
			connection = DBConnection.getDBConnection();
			/*
			 * Before fetching supplier payments it checks whether supplier payment ID is
			 * available
			 */
			if (supPaymentID != null && !supPaymentID.isEmpty()) {
				/*
				 * Get payment by ID query will be retrieved from
				 * Factory.xml
				 */
				preparedstatement = connection
						.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_GET_SupplierPayment_ID));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, supPaymentID);
			}
			
			else {
				preparedstatement = connection
						.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_ALL_SupplierPayments));
			}
			ResultSet resultSet = preparedstatement.executeQuery();

			while (resultSet.next()) {
				supplierPayment sPayment = new supplierPayment();
				sPayment.setSupPaymentID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				sPayment.setSupplierID(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				sPayment.setRawID(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				sPayment.setRawName(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				sPayment.setQty(resultSet.getDouble(CommonConstants.COLUMN_INDEX_FIVE));
				sPayment.setUnitPrice(resultSet.getDouble(CommonConstants.COLUMN_INDEX_SIX));
				sPayment.setTotalPrice(resultSet.getDouble(CommonConstants.COLUMN_INDEX_SEVEN));

				supPaymentList.add(sPayment);
			}

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
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
		return supPaymentList;
	}

	/*
	 * public double getUnitPrice(String rawID) {
	 * 
	 * double value = 0; connection = DBConnection.getConnection();
	 * 
	 * try { preparedstatement =
	 * connection.prepareStatement("SELECT uPrice FROM raw_material  WHERE rID=?");
	 * preparedstatement.setString(1,rawID); ResultSet resultSet =
	 * preparedstatement.executeQuery();
	 * 
	 * if(resultSet.next()) {
	 * 
	 * value = resultSet.getDouble(1); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * System.out.println("Value: " + value); return value; }
	 */

	@Override
	public void removeSupPayment(String supPaymentID) {
		
		// Before deleting check whether payment ID is available
		if (supPaymentID != null && !supPaymentID.isEmpty()) {
			/*
			 * Remove payment query will be retrieved from Factory.xml
			 */
			try {
				connection = DBConnection.getDBConnection();
				preparedstatement = connection
						.prepareStatement(QueryUtilities.queryByID(CommonConstants.QUERY_ID_REMOVE_SupplierPayment));
				preparedstatement.setString(CommonConstants.COLUMN_INDEX_ONE, supPaymentID);
				preparedstatement.executeUpdate();
			} catch (SQLException | SAXException | IOException | ParserConfigurationException
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
	}

	
}
