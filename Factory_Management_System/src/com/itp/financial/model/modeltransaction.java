package com.itp.financial.model;
import java.sql.Date;

public class modeltransaction {
	private String TransactionCode;
	
	private int AccountNo;
	
	private String Description;
	
	private String Type;
	
	private Date Date;
	
	private Double Amount;

	public String getTransactionCode() {
		return TransactionCode;
	}

	public void setTransactionCode(String string) {
		TransactionCode = string;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
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
