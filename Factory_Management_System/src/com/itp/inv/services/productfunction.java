package com.itp.inv.services;

import java.util.ArrayList;

import com.itp.inv.model.product;
import com.itp.inv.model.stock;

public interface productfunction {

	public void addproduct(product prd);
	public ArrayList<product>getproduct();
	public void removeProduct(String pid);
	public ArrayList<product>searchById(String pid);
	public void updateproduct(product prdx);
	
}
