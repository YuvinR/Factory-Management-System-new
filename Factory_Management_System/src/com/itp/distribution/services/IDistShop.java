package com.itp.distribution.services;

import java.util.ArrayList;

import com.itp.distribution.model.DistShop;

public interface IDistShop {
	
	public void addShop(DistShop shopId);
	public ArrayList<DistShop>viewDistShops();
	public void removeFunc(String Sid);

}
