package com.itp.maintain.model;

public class addequipment {
	private Integer EquipmentID;
	private String EquipmentBrand;
	private Integer Value;
	private Integer Quantity;
	private String Date_of_buy;
	public Integer getEquipmentID() {
		return EquipmentID;
	}
	public void setEquipmentID(Integer equipmentID) {
		EquipmentID = equipmentID;
	}
	public String getEquipmentBrand() {
		return EquipmentBrand;
	}
	public void setEquipmentBrand(String equipmentBrand) {
		EquipmentBrand = equipmentBrand;
	}
	public Integer getValue() {
		return Value;
	}
	public void setValue(Integer value) {
		Value = value;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public String getDate_of_buy() {
		return Date_of_buy;
	}
	public void setDate_of_buy(String date_of_buy) {
		Date_of_buy = date_of_buy;
	}

}
