package com.itp.inv.model;

public class stock {

	private String procode;
	private int entryNo;
	public int getEntryNo() {
		return entryNo;
	}
	public void setEntryNo(int entryNo) {
		this.entryNo = entryNo;
	}
	public String getProcode() {
		return procode;
	}
	public void setProcode(String procode) {
		this.procode = procode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private int amount;
	private String date;
}
