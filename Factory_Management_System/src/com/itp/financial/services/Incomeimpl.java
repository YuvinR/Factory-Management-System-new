package com.itp.financial.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.common.utils.DBConnection;
import com.itp.financial.model.modelincome;

public class Incomeimpl implements Incomei {

	@Override
	public void addIncome(modelincome IncomeCode) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("insert into income values(?,?,?,?,?)");
			
			pst.setInt(1,IncomeCode.getIncomeCode());
			pst.setString(2,IncomeCode.getDescription());
			pst.setString(3,IncomeCode.getType());
			pst.setString(4,IncomeCode.getDate());
			pst.setString(5,IncomeCode.getAmount());
			
			pst.executeUpdate();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public ArrayList<modelincome> viewmodelincome() {
		ArrayList<modelincome> datarate =  new ArrayList<modelincome>();
		Connection conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String sql = "select * from income";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next())
			{
				modelincome incomeobj = new modelincome();
				incomeobj.setIncomeCode(res.getInt("IncomeCode"));
				incomeobj.setDescription(res.getString("Description"));
				incomeobj.setType(res.getString("Type"));
				incomeobj.setDate(res.getString("Date"));
				incomeobj.setAmount(res.getString("Amount"));
				
				datarate.add(incomeobj);
				
			
				
			}
			
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datarate;
	}


	

}
