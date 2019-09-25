package com.itp.supplierPayment.services;

import java.util.logging.Logger;

import com.itp.sup.model.Supplier;
import com.itp.supplierPayment.model.supplier_payment;

public interface ISupPaymentServices {

	public static final Logger log = Logger.getLogger(ISupPaymentServices.class.getName());

	/**
	 * Add supplier payment for supplier payment table
	 * @param supplier payment
	 */
	public void addSupPayment(supplier_payment supPayment);
	
	
}
