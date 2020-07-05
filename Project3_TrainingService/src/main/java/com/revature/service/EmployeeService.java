package com.revature.service;

import java.util.List;

import com.revature.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();

	public Employee getEmployeeByEmployeeId(int employeeId);
	
	public List<Employee> getEmployeesByFullName(String firstName, String lastName);
	
	public void createEmployee(Employee employee);

	public void updateEmployee(Employee employee);
	
	public void createOrUpdateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);
	
}
