package com.itp.distribution.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.distribution.model.DistItem;
import com.itp.common.utils.DBConnection;

public class IDistItemImpl implements IDistItem{

	@Override
	public void addDistItem(DistItem distribuItem) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pt = conn.prepareStatement("INSERT INTO DISTRIBUTEDITEMLIST values (?,?,?,?,?,?,?)");
			
			pt.setString(1, distribuItem.getDistributedCode());
			pt.setString(2, distribuItem.getItemCode());
			pt.setString(3, distribuItem.getShopId());
			pt.setInt(4, distribuItem.getDistributedCount());
			pt.setInt(5, distribuItem.getReturnedCount());
			pt.setInt(6, distribuItem.getIncome());
			pt.setDate(7, distribuItem.getDate());
			
			pt.executeUpdate();
			pt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public ArrayList<DistItem> viewDistItems() {
		// TODO Auto-generated method stub
		
		ArrayList<DistItem> datarate = new ArrayList<DistItem>();
		
		Connection conn = DBConnection.getConnection();
		
		try {
			Statement st = conn.createStatement();
			
			String sql = "select * from distributeditemlist";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				DistItem di1 = new DistItem();
				
				di1.setDistributedCode(res.getString("distributedcode"));
				di1.setItemCode(res.getString("itemcode"));
				di1.setShopId(res.getString("shopid"));
				di1.setDistributedCount(Integer.parseInt(res.getString("distributedcount")));
				di1.setReturnedCount(Integer.parseInt(res.getString("returncount")));
				di1.setIncome(Integer.parseInt(res.getString("income")));
				di1.setDate(res.getDate("date"));
				
				datarate.add(di1);
				
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
	public void removeFunc(String dCode) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM distributeditemlist WHERE distributedcode='"+dCode+"'");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<DistItem> searchById(String dCode) {
		// TODO Auto-generated method stub
		
		ArrayList<DistItem> data = new ArrayList<DistItem>();
		
		Connection conn = DBConnection.getConnection();
		
		try {
			Statement st = conn.createStatement();
			
			String sql = "SELECT * FROM distributeditemlist WHERE distributedcode='"+dCode+"'";
			ResultSet res1 = st.executeQuery(sql);
			
			while(res1.next()) {
				DistItem st1 = new DistItem();
				
				st1.setDistributedCode(res1.getString("distributedcode"));
				st1.setItemCode(res1.getString("itemcode"));
				st1.setShopId(res1.getString("shopid"));
				st1.setDistributedCount(res1.getInt("distributedcount"));
				st1.setReturnedCount(res1.getInt("returncount"));
				st1.setIncome(res1.getInt("income"));
				st1.setDate(res1.getDate("date"));
				
				data.add(st1);
			}
			
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

	@Override
	public void updateDistItem(DistItem distribuItem) {
		// TODO Auto-generated method stub
		
		Connection conn = DBConnection.getConnection();
		
		try {
			
			String sql = "UPDATE distributeditemlist SET itemcode =?, shopid=?,distributedcount=?,returncount=?,income=?,date=? WHERE distributedcode='"+distribuItem.getDistributedCode()+"'";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, distribuItem.getItemCode());
			ps.setString(2, distribuItem.getShopId());
			ps.setInt(3, distribuItem.getDistributedCount());
			ps.setInt(4, distribuItem.getReturnedCount());
			ps.setInt(5, distribuItem.getIncome());
			ps.setDate(6, distribuItem.getDate());
			int i = ps.executeUpdate();
			System.out.println(distribuItem.getDistributedCode());
			System.out.println(distribuItem.getDate());
			if(i > 0) {
				System.out.println("Record Updated Successfuly");
			}else {
				System.out.println("There is a problem in updating Record.");
			}
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}
