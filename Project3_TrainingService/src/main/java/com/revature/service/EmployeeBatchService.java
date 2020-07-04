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

	public List<EmployeeBatch> getEmployeeBatchByEmployeeBatchLocation(String batchLocation);

	public List<EmployeeBatch> getEmployeeBatchByEmployeeBatchStartDate(Date batchStartDate);

	public List<EmployeeBatch> getEmployeeBatchByCurrentWeek(String currentWeek);

	public List<EmployeeBatch> getEmployeeBatchByEmployeeBatchType(String batchType);
	
	public void createEmployeeBatch(EmployeeBatch employeeBatch);

	public void updateEmployeeBatch(EmployeeBatch employeeBatch);

	public void deleteEmployeeBatch(EmployeeBatch employeeBatch);

}
