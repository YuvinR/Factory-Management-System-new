package com.itp.financial.model;
import java.sql.Date;

public class modelcost {

	private int CostCode;
	
	private String Description;
	
	private String Type;
	
	private Date Date;
	
	private Double Amount;

	public int getCostCode() {
		return CostCode;
	}

	public void setCostCode(int costCode) {
		CostCode = costCode;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
		Amount = amount;
	}
}
