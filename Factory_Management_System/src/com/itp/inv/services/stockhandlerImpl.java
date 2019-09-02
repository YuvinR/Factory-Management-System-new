package com.itp.inv.services;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.inv.model.stock;
import com.itp.common.utils.DBConnection;
import com.mysql.cj.protocol.Resultset;

public class stockhandlerImpl implements stockhandler {

	@Override
	public void stockadd(stock stck) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement st = conn.prepareStatement("insert into stock(procode,amount,date) values(?,?,?)");
			
			st.setString(1,stck.getProcode());
			st.setInt(2,stck.getAmount());
			st.setString(3,stck.getDate());
			
			
			
			st.executeUpdate();
			st.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<stock> viewinflow() {
		
		ArrayList<stock> datarate = new ArrayList<stock>();
		
		Connection conn = DBConnection.getConnection();
		try {
			Statement st =conn.createStatement();
			
			String sql="select * from stock";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				stock st1 = new stock();
				
				st1.setEntryNo(res.getInt("entryno"));
				st1.setProcode(res.getString("procode"));
				st1.setAmount(res.getInt("amount"));
				st1.setDate(res.getString("date"));
				
				
				datarate.add(st1);
				
			}
			
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return datarate;
	}

	@Override
	public ArrayList<stock> viewinOutflow() {
		// TODO Auto-generated method stub
		return null;
	}

}
