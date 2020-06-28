package com.revature.service;

import java.sql.Date;
import java.util.List;
import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;

public interface EmployeeBatchService {
	
	public List<EmployeeBatch> getAllEmployeeBatches();

	public EmployeeBatch getEmployeeBatchByEmployeeBatchId(EmployeeBatchId id);
	
	public EmployeeBatch getEmployeeBatchByEmployeeRole(String employeeRole);
	
	public EmployeeBatch getEmployeeBatchByDeletedAt(Date deletedAt);
	
	public void createEmployeeBatch(EmployeeBatch employeeBatch);

	public void updateEmployeeBatch(EmployeeBatch employeeBatch);

	public void deleteEmployeeBatch(EmployeeBatch employeeBatch);
}
