package com.itp.leave.services;

import java.util.ArrayList;

import com.itp.emp.model.Employee;
import com.itp.leave.model.Leave;

public interface ILeaveImplementation {

	public void addLeave(Leave employee);

	//public Employee getLeaveByID(String leaveID);
	
	public ArrayList<Leave> getLeave();

	public Employee updateLeave(String leaveID, Leave employee);

	public void removeLeave(String leaveID);
	
	public ArrayList<String> getLeaveIDs();
}
