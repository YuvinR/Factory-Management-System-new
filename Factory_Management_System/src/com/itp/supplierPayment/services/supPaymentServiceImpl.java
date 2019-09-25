package com.itp.supplierPayment.services;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import com.itp.supplierPayment.model.supplier_payment;

public class supPaymentServiceImpl implements ISupPaymentServices {

	/*Initialize logger */
	public static final Logger log =Logger.getLogger(supPaymentServiceImpl.class.getName());
	
	private static Connection connection;
	
	private static Statement statement;
	
	private static PreparedStatement preparedstatement;
	
	/* ADD SUPPLIER PAYMENT BEGIN*/
	
	@Override
	public void addSupPayment(supplier_payment supPayment) {
		
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

	private ArrayList<String> getSupPaymentIDs() {
		return null;
		
	}

	
}
