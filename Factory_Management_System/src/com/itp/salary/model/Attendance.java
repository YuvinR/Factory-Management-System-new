package com.itp.salary.model;

import java.sql.Date;
import java.sql.Time;

public class Attendance {
	private String Emp_Id;
	private Date date;
	private Time Arrival_time;
	private Time Departure_time;
	
	public String getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(String emp_Id) {
		Emp_Id = emp_Id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getArrival_time() {
		return Arrival_time;
	}
	public void setArrival_time(Time arrival_time) {
		Arrival_time = arrival_time;
	}
	public Time getDeparture_time() {
		return Departure_time;
	}
	public void setDeparture_time(Time departure_time) {
		Departure_time = departure_time;
	}
	
	
	

}
