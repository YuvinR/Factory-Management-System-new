package com.itp.supplierPayment.model;

public class supplierPayment {

	private String supPaymentID;
	
	private String supplierID;
	
	private String rawID;
	
	private String rawName;
	
	private double qty;
	
	private double unitPrice;
	
	private double totalPrice;

	public String getSupPaymentID() {
		return supPaymentID;
	}

	public void setSupPaymentID(String supPaymentID) {
		this.supPaymentID = supPaymentID;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getRawID() {
		return rawID;
	}

	public void setRawID(String rawID) {
		this.rawID = rawID;
	}

	public String getRawName() {
		return rawName;
	}

	public void setRawName(String rawName) {
		this.rawName = rawName;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
}
