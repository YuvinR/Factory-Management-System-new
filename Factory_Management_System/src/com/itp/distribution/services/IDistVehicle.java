package com.itp.distribution.services;

import java.util.ArrayList;

import com.itp.distribution.model.DistVehicle;

public interface IDistVehicle {
	
	public void addVehicle(DistVehicle vehicleNumber);
	public ArrayList<DistVehicle>viewDistVehicles();
	public void removeFunc(String Vno);
	public ArrayList<DistVehicle> searchById(String Vno);
	public void updateDistVehicle(DistVehicle vehicleNumber);

}
