package com.itp.distribution.model;

public class DistItem {
	
	private String distributedCode;
	
	private String itemCode;
	
	private String shopId;
	
	private int distributedCount;
	
	private int returnedCount;
	
	private int income;
	
	private String date;

	public String getDistributedCode() {
		return distributedCode;
	}

	public void setDistributedCode(String distributedCode) {
		this.distributedCode = distributedCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public int getDistributedCount() {
		return distributedCount;
	}

	public void setDistributedCount(int distributedCount) {
		this.distributedCount = distributedCount;
	}

	public int getReturnedCount() {
		return returnedCount;
	}

	public void setReturnedCount(int returnedCount) {
		this.returnedCount = returnedCount;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
