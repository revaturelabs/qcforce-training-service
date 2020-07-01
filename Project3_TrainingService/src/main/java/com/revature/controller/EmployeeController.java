package com.revature.controller;

import java.sql.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllForms() {
		return employeeService.getAllEmployes();
	}
	
	@GetMapping("/employee/{employeeId}")
	public List<Employee> getEmployeeByEmployeeName(@PathVariable("employeeId")int employeeId) {
		return (List<Employee>) employeeService.getEmployeeByEmployeeId(employeeId);
	}
	
	@GetMapping("/employee/{firstname+lastname}")
	public List<Employee> getEmployeeByFullName(@PathVariable("firstname")String firstname, @PathVariable("lastname")String lastname) {
		return (List<Employee>) employeeService.getEmployeeByFullName(firstname, lastname);
	}
	
	@GetMapping("/employee/{email}")
	public List<Employee> getEmployeeByEmail(@PathVariable("email")String email) {
		return (List<Employee>) employeeService.getEmployeeByEmail(email);
	}
	
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "Employee successfully created";
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Employee successfully updated";
	}
	
	@DeleteMapping("/Employee/{employeeId}")
	public String deleteEmployee(@PathParam("employeeId") int employeeId) {
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employeeService.deleteEmployee(employee);
		return "Employee successfully deleted";
	}


}
