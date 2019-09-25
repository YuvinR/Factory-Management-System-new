package com.itp.financial.services;

import java.util.ArrayList;

import com.itp.financial.model.modelcost;


public interface Costi {

	public void addCost(modelcost costCode);
	public ArrayList<modelcost>viewModelcosts();
	public void removeProduct(String pid);
	public ArrayList<modelcost>searchById(String pid);
	public void updateproduct(modelcost prd);

}
