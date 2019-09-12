package com.itp.salary.services;

import java.util.ArrayList;

import com.itp.inv.model.product;
import com.itp.salary.model.Setting;

public interface IPay_Set {
	public void setSetting(Setting addSetting);
	public ArrayList<Setting>viewsetiing();
	public void removefunc(String idx);
	public ArrayList<Setting>getbyid(String id);
	public void updatesal(Setting prd);
	
}
