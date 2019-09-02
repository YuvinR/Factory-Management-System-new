package com.itp.inv.services;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itp.inv.model.product;
import com.itp.common.utils.DBConnection;

public class implProduct implements productfunction{

	@Override
	public void addproduct(product prd) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement st = conn.prepareStatement("insert into product(pid,pname,storeid,date) values(?,?,?,?)");
			
			st.setString(1,prd.getPid());
			st.setString(2,prd.getPname());
			st.setInt(3,prd.getPstore());
			
			//st.setInt(4,prd.getTotal());
			st.setDate(4,prd.getDate());
			
			
			st.executeUpdate();
			st.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	
}
