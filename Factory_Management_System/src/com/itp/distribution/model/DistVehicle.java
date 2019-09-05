package com.itp.distribution.model;

import java.sql.Date;

public class DistVehicle {
	
	private String vehicleNumber;
	
	private String vehicleName;
	
	private String area;
	
	private String driverCode;
	
	private String assistantCode;
	
	private Date date;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDriverCode() {
		return driverCode;
	}

	public void setDriverCode(String driverCode) {
		this.driverCode = driverCode;
	}

	public String getAssistantCode() {
		return assistantCode;
	}

	public void setAssistantCode(String assistantCode) {
		this.assistantCode = assistantCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
