package com.revature.service;

import java.util.List;

import com.revature.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployes();

	public Employee getEmployeeByEmployeeId(int employeeId);
	
	public Employee getEmployeeByFullName(String firstName, String lastName);
	
	public Employee getEmployeeByEmail(String email);
	
	public void createEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);
}
