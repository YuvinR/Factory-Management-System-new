package com.itp.financial.services;

import java.util.ArrayList;

import com.itp.financial.model.modeltransaction;

public interface Transactioni {
	public void addTransaction(modeltransaction TransactionCode);
	public ArrayList<modeltransaction>viewmodeltransaction();
	
	public ArrayList<String> getClientID();
	public String clientID_Generator(ArrayList<String> arrayList);
	
	public void removeProduct(String pid);
	public ArrayList<modeltransaction>searchById(String pid);
	public void updateproduct(modeltransaction prd);

}
