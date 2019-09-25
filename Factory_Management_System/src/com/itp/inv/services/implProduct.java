package com.itp.inv.services;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.inv.model.product;
import com.itp.inv.model.stock;
import com.itp.common.utils.DBConnection;

public class implProduct implements productfunction{

	@Override
	public void addproduct(product prd) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement st = conn.prepareStatement("insert into product(pid,pname,storeid,date,price) values(?,?,?,?,?)");
			
			st.setString(1,prd.getPid());
			st.setString(2,prd.getPname());
			st.setInt(3,prd.getPstore());
			
			//st.setInt(4,prd.getTotal());
			st.setDate(4,prd.getDate());
			st.setDouble(5,prd.getPrice());
			
			
			st.executeUpdate();
			st.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<product> getproduct() {
		// TODO Auto-generated method stub
		
		ArrayList<product> datarate = new ArrayList<product>();
		
		Connection conn = DBConnection.getConnection();
		try {
			Statement st =conn.createStatement();
			
			String sql="select * from product";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				product st1 = new product();
				
				st1.setPid(res.getString("pid"));
				st1.setPname(res.getString("pname"));
				st1.setPstore(res.getInt("storeid"));
				st1.setDate(res.getDate("date"));
				st1.setPrice(res.getDouble("price"));
				
				
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
	public void removeProduct(String pid) {
		// TODO Auto-generated method stub
		  
		Connection conn = DBConnection.getConnection();
		try {
			PreparedStatement stmt=conn.prepareStatement("delete from product where pid='"+pid+"'");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<product> searchById(String pid) {
		// TODO Auto-generated method stub
	
ArrayList<product> data = new ArrayList<product>();
		
		Connection conn = DBConnection.getConnection();
		try {
			Statement st =conn.createStatement();
			
			String sql="select * from product where pid='"+pid+"'";
			ResultSet res1 = st.executeQuery(sql);
			
			while(res1.next()) {
				product st1 = new product();
				
				st1.setPid(res1.getString("pid"));
				st1.setPname(res1.getString("pname"));
				st1.setPstore(res1.getInt("storeid"));
				st1.setDate(res1.getDate("date"));
				st1.setPrice(res1.getDouble("price"));
				
				
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
	public void updateproduct(product prdx) {
		// TODO Auto-generated method stub
		
		try {

   
			Connection conn = DBConnection.getConnection();
			String pid =prdx.getPid();

		
			PreparedStatement ps = conn.prepareStatement("UPDATE Product SET pname ='"+prdx.getPname()+"', storeid="+prdx.getPstore()+",date='"+prdx.getDate()+"',price="+prdx.getPrice()+" WHERE pid='"+pid+"';");
			ps.execute();

			
			ps.close();
			
			conn.close();
		  
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}
	

}
	

	

