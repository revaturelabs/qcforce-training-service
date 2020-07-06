package com.revature.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;

@RestController
@RequestMapping(value="employee", produces="application/json")
public class EmployeeController {
	
	private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee-id/{employeeId}")
	public Employee getEmployeeByEmployeeId(@PathVariable("employeeId") int employeeId) {
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}
	
	@GetMapping("/employee-name/{firstName}/{lastName}")
	public List<Employee> getEmployeesByFullName(@PathVariable("firstName")String firstName, @PathVariable("lastName")String lastName) {
		return employeeService.getEmployeesByFullName(firstName, lastName);
	}
	
	@PostMapping("/")
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "Employee successfully created.";
	}
	
	@PutMapping("/")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Employee successfully updated.";
	}
	
	@DeleteMapping("/{employeeId}")
	public String deleteEmployee(@PathParam("employeeId") int employeeId) {
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employeeService.deleteEmployee(employee);
		return "Employee successfully deleted.";
	}


}
