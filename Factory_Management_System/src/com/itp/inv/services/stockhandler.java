package com.itp.inv.services;

import java.util.ArrayList;


import com.itp.inv.model.stock;

public interface stockhandler {

	public void stockadd(stock stck);
	public ArrayList<stock>viewinflow();
	public ArrayList<stock>viewinOutflow();
	
}
