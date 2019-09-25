package com.itp.salary.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sound.midi.Soundbank;

import com.itp.common.utils.DBConnection;
import com.itp.inv.model.product;
import com.itp.salary.model.Setting;

public class IPay_SetImpl implements IPay_Set{

	@Override
	public void setSetting(Setting addSetting) {
		Connection conn=DBConnection.getConnection();
		
		try {
			PreparedStatement pStatement=conn.prepareStatement("INSERT INTO payment_setting values(?,?)");
			pStatement.setString(1, addSetting.getPayment_Type());
			pStatement.setInt(2, addSetting.getValue());
			pStatement.executeUpdate();
			pStatement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Setting> viewsetiing() {

		ArrayList<Setting> datarate=new ArrayList<Setting>();
		Connection conn= DBConnection.getConnection();
		 try {
			Statement st=conn.createStatement();
			String sql="select * from payment_setting";
			ResultSet res=st.executeQuery(sql);
			while(res.next()) {
				Setting vsSetting=new Setting();
				vsSetting.setPayment_Type(res.getString("Payment_Type"));
				vsSetting.setValue(res.getInt("value"));
				
				datarate.add(vsSetting);
				
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
	public void removefunc(String idx) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement stmt=conn.prepareStatement("delete from payment_setting where Payment_Type='"+idx+"'");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Setting> getbyid(String id) {
		// TODO Auto-generated method stub
		
		
ArrayList<Setting> data = new ArrayList<Setting>();
		
		Connection conn = DBConnection.getConnection();
		try {
			Statement st =conn.createStatement();
			
			String sql="select * from payment_setting where Payment_Type='"+id+"'";
			ResultSet res1 = st.executeQuery(sql);
			
			while(res1.next()) {
				Setting st1 = new Setting();
				
				st1.setPayment_Type(res1.getString("Payment_Type"));
				st1.setValue(res1.getInt("value"));
			
				
				
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
	public void updatesal(Setting prd) {
		// TODO Auto-generated method stub
try {
			
			
	Connection conn = DBConnection.getConnection();
			
			
	
			String sql="UPDATE payment_setting SET value=? WHERE Payment_Type='"+prd.getPayment_Type()+"'";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			/*//ps.setString(1, prd.getPayment_Type());
*/			ps.setInt(1, prd.getValue());
			System.out.println(prd.getValue());  
			System.out.println(prd.getPayment_Type());  
		System.out.println("hiii");
			int i = ps.executeUpdate();
			
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
