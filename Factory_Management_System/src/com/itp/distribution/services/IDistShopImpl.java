package com.itp.distribution.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.distribution.model.DistShop;
import com.itp.common.utils.DBConnection;

public class IDistShopImpl implements IDistShop{

	@Override
	public void addShop(DistShop shopId) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pt = conn.prepareStatement("INSERT INTO SHOPLIST values (?,?,?,?,?,?)");
			
			pt.setString(1, shopId.getShopId());
			pt.setString(2, shopId.getShopName());
			pt.setString(3, shopId.getOwnerName());
			pt.setString(4, shopId.getContactNo());
			pt.setString(5, shopId.getEmail());
			pt.setString(6, shopId.getAddress());
			
			pt.executeUpdate();
			pt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<DistShop> viewDistShops() {
		// TODO Auto-generated method stub
		
		ArrayList<DistShop> datarate = new ArrayList<DistShop>();
		
		Connection conn = DBConnection.getConnection();
		
		try {
			Statement st = conn.createStatement();
			
			String sql = "select * from shoplist";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				DistShop ds1 = new DistShop();
				
				ds1.setShopId(res.getString("shopId"));
				ds1.setShopName(res.getString("shopName"));
				ds1.setOwnerName(res.getString("ownerName"));
				ds1.setContactNo(res.getString("contactNo"));
				ds1.setEmail(res.getString("email"));
				ds1.setAddress(res.getString("address"));
				
				datarate.add(ds1);
				
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
	public void removeFunc(String Sid) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM shoplist WHERE shopId='"+Sid+"'");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<DistShop> searchById(String Sid) {
		// TODO Auto-generated method stub
		
		ArrayList<DistShop> data = new ArrayList<DistShop>();
		
		Connection conn = DBConnection.getConnection();
		
		try {
			Statement st = conn.createStatement();
			
			String sql = "SELECT * FROM shoplist WHERE shopId='"+Sid+"'";
			ResultSet res1 = st.executeQuery(sql);
			
			while(res1.next()) {
				DistShop st1 = new DistShop();
				
				st1.setShopId(res1.getString("shopId"));
				st1.setShopName(res1.getString("shopName"));
				st1.setOwnerName(res1.getString("ownerName"));
				st1.setContactNo(res1.getString("contactNo"));
				st1.setContactNo(res1.getString("email"));
				st1.setAddress(res1.getString("address"));
				
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
	public void updateDistShop(DistShop shopId) {
		// TODO Auto-generated method stub
		
		Connection conn = DBConnection.getConnection();
		
		try {	

			String sql = "Update shoplist Set shopName =?, ownerName=?,contactNo=?,email=?,address=? WHERE shopId='"+shopId.getShopId()+"'";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, shopId.getShopName());
			ps.setString(2, shopId.getOwnerName());
			ps.setString(3, shopId.getContactNo());
			ps.setString(4, shopId.getEmail());
			ps.setString(5, shopId.getAddress());
			int i = ps.executeUpdate();
			System.out.println(shopId.getShopId());
			System.out.println(shopId.getOwnerName());
			if(i>0) {
				System.out.println("Record Updated Successfully");
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
