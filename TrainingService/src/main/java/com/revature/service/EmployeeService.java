package com.revature.service;

import java.util.List;

import com.revature.model.Employee;

/**
 * Interface for methods linked with the {@link Employee} class.
 */
public interface EmployeeService {

	/**
	 * Retrieves all {@link Employee}
	 * 
	 * @return list of {@link Employee}
	 */
	public List<Employee> getAllEmployees();

	/**
	 * Retrieves an employee by the employee id
	 * 
	 * @param employeeId is id of employee
	 * @return employee
	 */
	public Employee getEmployeeByEmployeeId(int employeeId);

	/**
	 * Retrieves {@link Employee} by full name of Employee.
	 * 
	 * @param firstName is first name of the employee
	 * @param lastName  is last name of the employee
	 * @return a list {@link Employee}
	 */
	public List<Employee> getEmployeesByFullName(String firstName, String lastName);

	/**
	 * Create a new employee
	 * 
	 * @param employee is an employee
	 */
	public void createEmployee(Employee employee);

	/**
	 * Updates an existing employee
	 * 
	 * @param employee is an employee
	 */
	public void updateEmployee(Employee employee);

	/**
	 * Creates and updates an employee
	 * 
	 * @param employee is an employee
	 */
	public void createOrUpdateEmployee(Employee employee);

	/**
	 * Deletes an employee
	 * 
	 * @param employee is an employee
	 */
	public void deleteEmployee(Employee employee);

}
