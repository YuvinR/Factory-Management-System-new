package com.itp.maintain.model;

public class addmechine {
	private String Machine_Number;
	private String Machine_Brand;
	private Double Value;
	private String Date_of_buy;
	private String Date_of_fixed;
	
	public String getMachine_Brand() {
		return Machine_Brand;
	}
	public void setMachine_Brand(String machine_Brand) {
		Machine_Brand = machine_Brand;
	}
	
	public String getDate_of_buy() {
		return Date_of_buy;
	}
	public void setDate_of_buy(String date_of_buy) {
		Date_of_buy = date_of_buy;
	}
	public String getDate_of_fixed() {
		return Date_of_fixed;
	}
	public void setDate_of_fixed(String date_of_fixed) {
		Date_of_fixed = date_of_fixed;
	}
	public String getMachine_Number() {
		return Machine_Number;
	}
	public void setMachine_Number(String machine_Number) {
		Machine_Number = machine_Number;
	}
	public Double getValue() {
		return Value;
	}
	public void setValue(Double value) {
		Value = value;
	}
}
