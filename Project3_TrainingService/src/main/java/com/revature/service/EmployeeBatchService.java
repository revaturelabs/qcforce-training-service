package com.revature.service;

import java.util.List;

import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;

public interface EmployeeBatchService {

	public List<EmployeeBatch> getAllEmployeeBatches();

	public EmployeeBatch getEmployeeBatchByEmployeeBatchId(EmployeeBatchId employeeBatchId);
	
	public void createEmployeeBatch(EmployeeBatch employeeBatch);

	public void updateEmployeeBatch(EmployeeBatch employeeBatch);
	
	public void createOrUpdateEmployeeBatch(EmployeeBatch employeeBatch);

	public void deleteEmployeeBatch(EmployeeBatch employeeBatch);
}
