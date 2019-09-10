package com.itp.distribution.services;

import java.util.ArrayList;

import com.itp.distribution.model.DistItem;

public interface IDistItem {
	
	public void addDistItem(DistItem distribuItem);
	public ArrayList<DistItem>viewDistItems();
	public  void removeFunc(String dCode);
	public ArrayList<DistItem>updateDistItems();

}
