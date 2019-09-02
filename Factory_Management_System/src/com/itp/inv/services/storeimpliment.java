package com.itp.inv.services;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itp.inv.model.storeinf;
import com.itp.common.utils.DBConnection;

public class storeimpliment implements storefunction {

	public void addstore(storeinf stinfo) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement st = conn.prepareStatement("insert into new_table(storeName,phoneNo,addline1,addline2,email,city,province,zip,maxitems) values(?,?,?,?,?,?,?,?,?)");
			
			st.setString(1,stinfo.getStoreName());
			st.setInt(2,stinfo.getPhoneNo());
			st.setString(3,stinfo.getAdline1());
			
			st.setString(4,stinfo.getAdline2());
			st.setString(5,stinfo.getStemail());
			st.setString(6,stinfo.getCity());
			
			st.setString(7,stinfo.getProvince());
			st.setInt(8,stinfo.getZip());
			st.setInt(9,stinfo.getMaxitem());
			
			st.executeUpdate();
			st.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}