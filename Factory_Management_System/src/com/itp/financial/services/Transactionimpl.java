package com.itp.financial.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.common.utils.DBConnection;
import com.itp.financial.model.modeltransaction;

public class Transactionimpl  implements Transactioni {
	
	public static final String Transaction_ID_Letter= "BT";
	public static String TransactionID;
	public static int TransactionCnt;
	
	@Override
	public void addTransaction(modeltransaction TransactionCode) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("insert into transaction values(?,?,?,?,?,?)");
			
			pst.setString(1,TransactionCode.getTransactionCode());
			pst.setInt(2,TransactionCode.getAccountNo());
			pst.setString(3,TransactionCode.getDescription());
			pst.setString(4,TransactionCode.getType());
			pst.setDate(5,TransactionCode.getDate());
			pst.setDouble(6,TransactionCode.getAmount());
			
			pst.executeUpdate();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public ArrayList<modeltransaction> viewmodeltransaction() {
		// TODO Auto-generated method stub
		ArrayList<modeltransaction> datarate =  new ArrayList<modeltransaction>();
		Connection conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "select * from transaction";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next())
			{
				modeltransaction transactionobj = new modeltransaction();
				transactionobj.setTransactionCode(res.getString("TransactionCode"));
				transactionobj.setAccountNo(res.getInt("AccountNo"));
				transactionobj.setDescription(res.getString("Description"));
				transactionobj.setType(res.getString("Type"));
				transactionobj.setDate(res.getDate("Date"));
				transactionobj.setAmount(res.getDouble("Amount"));
				
				datarate.add(transactionobj);
				
			
				
			}
			
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datarate;
	}
	
	
	


	
	
	
	//new TransactionID Genarator
	
	
		@Override
		public ArrayList<String> getClientID() {
			// TODO Auto-generated method stub
			ArrayList<String> clientID_List = new ArrayList<String>();
			
			try {
				Connection connection = DBConnection.getConnection();
		
				PreparedStatement pst = connection.prepareStatement("SELECT * FROM financialcostdb.transaction;");

				ResultSet clientIDs = pst.executeQuery();
				
				while (clientIDs.next()) {
					//clientID_List.add(clientIDs.getString(1));	
					System.out.println(clientIDs.getString(0));
				}
				
				pst.close();
				connection.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return clientID_List;
		}
		
		
		
		@Override
		public String clientID_Generator(ArrayList<String> arrayList) {
			TransactionCnt = arrayList.size();
			
			TransactionCnt++;
			TransactionID = Transaction_ID_Letter+ String.format("%04d",TransactionCnt);
			
			if (arrayList.contains(TransactionID)) {
				TransactionCnt++;
				TransactionID = Transaction_ID_Letter+ String.format("%04d", TransactionCnt);
			}
			
			return TransactionID;
			
		}
		@Override
		public void removeProduct(String pid) {
			// TODO Auto-generated method stub
			//System.out.println(pid);
			Connection conn = DBConnection.getConnection();
			try {
				PreparedStatement stmt=conn.prepareStatement("delete from transaction where TransactionCode='"+pid+"'");
				
				stmt.executeUpdate();
				
				stmt.close();
				conn.close();
			
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		@Override
		public ArrayList<modeltransaction> searchById(String pid) {
			// TODO Auto-generated method stub

			ArrayList<modeltransaction> data = new ArrayList<modeltransaction>();
					
					Connection conn = DBConnection.getConnection();
					try {
						Statement st =conn.createStatement();
						
						String sql="select * from transaction where TransactionCode='"+pid+"'";
						ResultSet res1 = st.executeQuery(sql);
						
						while(res1.next()) {
							modeltransaction st1 = new modeltransaction();
							
				
							st1.setTransactionCode(res1.getString("TransactionCode"));
							st1.setAccountNo(res1.getInt("AccountNo"));
							st1.setDescription(res1.getString("Description"));
							st1.setType(res1.getString("Type"));
							st1.setDate(res1.getDate("Date"));
							st1.setAmount(res1.getDouble("Amount"));
							

							
							data.add(st1);
							
						}
						
						st.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					// TODO Auto-generated method stub
					return data;
					
						
					
				
		}
		@Override
		public void updateproduct(modeltransaction prd) {
			// TODO Auto-generated method stub
			

			Connection conn = DBConnection.getConnection();
			try {
				/*PreparedStatement prst = conn.prepareStatement("UPDATE product\r\n" + 
						"SET pname = '"+prd.getPid()+"', storeid='"+prd.getPstore()+"',date='"+prd.getDate()+"',price='"+prd.getPrice()+"' \r\n" + 
						"WHERE pid='"+prd.getPid()+"'");
				
	prst.executeUpdate();
				
				prst.close();
				conn.close();*/
				
				
				
				String sql="UPDATE transaction SET TransactionCode =?,AccountNo=?, Description=?,Type=?,Date=?,Amount=?  WHERE TransactionCode='"+prd.getTransactionCode()+"'";
				PreparedStatement ps = conn.prepareStatement(sql);
				
	
				ps.setString(1,prd.getTransactionCode());
				ps.setInt(2,prd.getAccountNo());
				ps.setString(3,prd.getDescription());
				ps.setString(4,prd.getType());
				ps.setDate(5,prd.getDate());
				ps.setDouble(6,prd.getAmount());
				int i = ps.executeUpdate();
				System.out.println(prd.getAmount());
				if(i > 0)
				{
				System.out.print("Record Updated Successfully");
				}
				else
				{
				System.out.print("There is a problem in updating Record.");
				}
				ps.close();
				conn.close();
			  
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

		


}
