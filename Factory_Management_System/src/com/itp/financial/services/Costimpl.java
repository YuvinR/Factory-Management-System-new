package com.itp.financial.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.common.utils.DBConnection;
import com.itp.financial.model.modelcost;

public class Costimpl implements Costi {

	@Override
	public void addCost(modelcost costCode) {
		// TODO Auto-generated method stub
		
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("insert into Cost values(?,?,?,?,?)");
			
			pst.setInt(1,costCode.getCostCode());
			pst.setString(2,costCode.getDescription());
			pst.setString(3,costCode.getType());
			pst.setDate(4,costCode.getDate());
			pst.setDouble(5,costCode.getAmount());
			
			pst.executeUpdate();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<modelcost> viewModelcosts() {
		// TODO Auto-generated method stub
		ArrayList<modelcost> datarate =  new ArrayList<modelcost>();
		Connection conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "select * from cost";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next())
			{
				modelcost costobj = new modelcost();
				costobj.setCostCode(res.getInt("CostCode"));
				costobj.setDescription(res.getString("Description"));
				costobj.setType(res.getString("Type"));
				costobj.setDate(res.getDate("Date"));
				costobj.setAmount(res.getDouble("Amount"));
				
				datarate.add(costobj);
				
			
				
			}
			
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datarate;
	}

	@Override
	public void removeProduct(String pid) {
		// TODO Auto-generated method stub
		//System.out.println(pid);
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement stmt=conn.prepareStatement("delete from cost where CostCode='"+pid+"'");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<modelcost> searchById(String pid) {
		// TODO Auto-generated method stub
		
		ArrayList<modelcost> data = new ArrayList<modelcost>();
				
				Connection conn = DBConnection.getConnection();
				try {
					Statement st =conn.createStatement();
					
					String sql="select * from cost where CostCode='"+pid+"'";
					ResultSet res1 = st.executeQuery(sql);
					
					while(res1.next()) {
						modelcost st1 = new modelcost();
						
			
						st1.setCostCode(res1.getInt("CostCode"));
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
	public void updateproduct(modelcost prd) {
		// TODO Auto-generated method stub
	
					Connection conn = DBConnection.getConnection();
					try {
						/*PreparedStatement prst = conn.prepareStatement("UPDATE product\r\n" + 
								"SET pname = '"+prd.getPid()+"', storeid='"+prd.getPstore()+"',date='"+prd.getDate()+"',price='"+prd.getPrice()+"' \r\n" + 
								"WHERE pid='"+prd.getPid()+"'");
						
			prst.executeUpdate();
						
						prst.close();
						conn.close();*/
						
						
						
						String sql="UPDATE cost SET CostCode =?, Description=?,Type=?,Date=?,Amount=?  WHERE CostCode='"+prd.getCostCode()+"'";
						PreparedStatement ps = conn.prepareStatement(sql);
						
			
						ps.setInt(1,prd.getCostCode());
						ps.setString(2,prd.getDescription());
						ps.setString(3,prd.getType());
						ps.setDate(4,prd.getDate());
						ps.setDouble(5,prd.getAmount());
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
	

	