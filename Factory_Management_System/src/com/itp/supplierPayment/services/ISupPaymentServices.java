package com.itp.supplierPayment.services;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.itp.sup.model.Supplier;
import com.itp.supplierPayment.model.supplierPayment;

public interface ISupPaymentServices {

	public static final Logger log = Logger.getLogger(ISupPaymentServices.class.getName());

	/**
	 * Add supplier payment for supplier payment table
	 * @param supplier payment
	 */
	public void addSupPayment(supplierPayment supPayment);
	
	/**
	 * Get a particular Supplier Payment
	 * 
	 * @param supplierPaymentID
	 * @return SupplierPayment
	 */
	public supplierPayment getSupPaymenyByID(String supPaymentID);
	
	/**
	 * Get all list of supplier_Payment
	 * 
	 * @return ArrayList<Supplier Payment>
	 */
	public ArrayList<supplierPayment> getSupPayments();
	
	public ArrayList<String> getSupPaymentIDs();

	public void removeSupPayment(String supPaymentID);




}
