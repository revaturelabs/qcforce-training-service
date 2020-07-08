package com.revature.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

/**
 * The controller containing all of the end-points related to the
 * {@link Employee} class.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "employee", produces = "application/json")
public class EmployeeController {

	/**
	 * Creates an instance of {@link EmployeeService} for retrieving data from the
	 * database.
	 */
	private EmployeeService employeeService;

	/**
	 * Initializes employeeService.
	 */
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * Sets up an end-point for retrieving a list of all employees.
	 */
	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	/**
	 * Sets up an end-point for retrieving the employee with the provided ID.
	 */
	@GetMapping("/employee-id/{employeeId}")
	public Employee getEmployeeByEmployeeId(@PathVariable("employeeId") int employeeId) {
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}

	/**
	 * Sets up an end-point for retrieving a list of employees with the given first
	 * and last names.
	 * 
	 * @param firstName is first name of employee
	 * @param lastName  is last name of employee
	 * @return a list of {@link Employee}
	 */
	@GetMapping("/employee-name/{firstName}/{lastName}")
	public List<Employee> getEmployeesByFullName(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return employeeService.getEmployeesByFullName(firstName, lastName);
	}

	/**
	 * Sets up an end-point for creating a new employee.
	 * 
	 * @param employee is an employee
	 * @return is a string
	 */
	@PostMapping("/")
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "Employee successfully created.";
	}

	/**
	 * Sets up an end-point for updating an existing employee.
	 * 
	 * @param employee is employee
	 * @return a string
	 */
	@PutMapping("/")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return "Employee successfully updated.";
	}

	/**
	 * Sets up an end-point for deleting an employee with the provided ID.
	 * 
	 * @param employeeId is id of an employee
	 * @return a string
	 */
	@DeleteMapping("/{employeeId}")
	public String deleteEmployee(@PathParam("employeeId") int employeeId) {
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employeeService.deleteEmployee(employee);
		return "Employee successfully deleted.";
	}

}
