package com.itp.salary.model;

import java.sql.Date;

public class UnitInsert {
	private String Emp_Id;
	private Integer NumUnits;
	private Date date;
	public String getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(String emp_Id) {
		Emp_Id = emp_Id;
	}
	public Integer getNumUnits() {
		return NumUnits;
	}
	public void setNumUnits(Integer numUnits) {
		NumUnits = numUnits;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
