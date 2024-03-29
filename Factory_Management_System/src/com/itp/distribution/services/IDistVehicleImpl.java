package com.itp.distribution.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.distribution.model.DistVehicle;
import com.itp.common.utils.DBConnection;

public class IDistVehicleImpl implements IDistVehicle{

	@Override
	public void addVehicle(DistVehicle vehicleNumber) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pt = conn.prepareStatement("INSERT INTO VEHICLELIST values (?,?,?,?,?,?)");
			
			pt.setString(1, vehicleNumber.getVehicleNumber());
			pt.setString(2, vehicleNumber.getVehicleName());
			pt.setString(3, vehicleNumber.getArea());
			pt.setString(4, vehicleNumber.getDriverCode());
			pt.setString(5, vehicleNumber.getAssistantCode());
			pt.setDate(6, vehicleNumber.getDate());
			
			pt.executeUpdate();
			pt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<DistVehicle> viewDistVehicles() {
		// TODO Auto-generated method stub
		
		ArrayList<DistVehicle> datarate = new ArrayList<DistVehicle>();
		
		Connection conn = DBConnection.getConnection();
		
		
		try {
			Statement st = conn.createStatement();
			
			String sql = "select * from vehiclelist";
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()) {
				DistVehicle ds1 = new DistVehicle();
				
				ds1.setVehicleNumber(res.getString("vehicleNumber"));
				ds1.setVehicleName(res.getString("vehicleName"));
				ds1.setArea(res.getString("area"));
				ds1.setDriverCode(res.getString("driverCode"));
				ds1.setAssistantCode(res.getString("assistantCode"));
				ds1.setDate(res.getDate("date"));
				
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


	public void removeFunc(String Vno) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM vehiclelist WHERE vehicleNumber='"+Vno+"'");
			
			stmt.executeUpdate();
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public ArrayList<DistVehicle> searchById(String Vno) {
		// TODO Auto-generated method stub
		
		ArrayList<DistVehicle> data = new ArrayList<DistVehicle>();
		
		Connection conn = DBConnection.getConnection();
		
		try {
			Statement st = conn.createStatement();
			
			String sql = "SELECT * FROM vehiclelist WHERE vehicleNumber='"+Vno+"'";
			ResultSet res1 = st.executeQuery(sql);
			
			while(res1.next()) {
				DistVehicle st1 = new DistVehicle();
				
				st1.setVehicleNumber(res1.getString("vehicleNumber"));
				st1.setVehicleName(res1.getString("vehicleName"));
				st1.setArea(res1.getString("area"));
				st1.setDriverCode(res1.getString("driverCode"));
				st1.setAssistantCode(res1.getString("assistantCode"));
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


	public void updateDistVehicle(DistVehicle vehicleNumber) {
		// TODO Auto-generated method stub
		
		Connection conn = DBConnection.getConnection();
		
		try {
		
		String sql = "UPDATE vehiclelist SET vehicleName =?, area=?,driverCode=?,assistantCode=?,date=? WHERE vehicleNumber='"+vehicleNumber.getVehicleNumber()+"'";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, vehicleNumber.getVehicleName());
		ps.setString(3, vehicleNumber.getArea());
		ps.setString(2, vehicleNumber.getDriverCode());
		ps.setString(4, vehicleNumber.getAssistantCode());
		ps.setDate(5, vehicleNumber.getDate());
		int i = ps.executeUpdate();
		System.out.println(vehicleNumber.getVehicleNumber());
		System.out.println(vehicleNumber.getDriverCode());
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
