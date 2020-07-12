package com.revature.service;

import java.util.List;

import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;

/**
 * Interface for methods linked with the {@link EmployeeBatch} class.
 */
public interface EmployeeBatchService {

	/**
	 * Retrieves all {@link EmployeeBatch}
	 * 
	 * @return list of {@link EmployeeBatch}
	 */
	public List<EmployeeBatch> getAllEmployeeBatches();

	/**
	 * Retrieves an Employee batch by employee batch id
	 * 
	 * @param employeeBatchId is id of employee batch
	 * @return a EmployeeBatch
	 */
	public EmployeeBatch getEmployeeBatchByEmployeeBatchId(EmployeeBatchId employeeBatchId);

	/**
	 * Creates an employee batch by employeeBatch
	 * 
	 * @param employeeBatch is employeeBatch
	 */
	public void createEmployeeBatch(EmployeeBatch employeeBatch);

	/**
	 * Updates an existing employeeBatch
	 * 
	 * @param employeeBatch is employeeBatch
	 */
	public void updateEmployeeBatch(EmployeeBatch employeeBatch);

	/**
	 * Creates or updates an employeeBatch
	 * 
	 * @param employeeBatch is an employeeBatch
	 */
	public void createOrUpdateEmployeeBatch(EmployeeBatch employeeBatch);

	/**
	 * Deletes an existing employee batch
	 * 
	 * @param employeeBatch is an employeeBatch
	 */
	public void deleteEmployeeBatch(EmployeeBatch employeeBatch);
}
