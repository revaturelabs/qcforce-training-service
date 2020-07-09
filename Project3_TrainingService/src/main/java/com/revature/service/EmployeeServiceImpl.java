package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.logger.AppLogger;
import com.revature.model.Employee;
import com.revature.repo.EmployeeRepo;

/**
 * Class which implements the {@link EmployeeService} interface for methods
 * linked with the {@link Employee} class.
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeeRepo;

	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeRepo.findById(employeeId).get();
	}

	@Override
	public List<Employee> getEmployeesByFullName(String firstName, String lastName) {
		return employeeRepo.findAllByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeRepo.save(employee);
		AppLogger.log.info("New Employee record created");

	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepo.findById(employee.getEmployeeId()).ifPresent((existingEmployee) -> employeeRepo.save(employee));
		AppLogger.log.info("Existing Employee record updated");

	}

	@Override
	public void createOrUpdateEmployee(Employee employee) {
		if (!(employeeRepo.findByEmail(employee.getEmail()) == null)) {
			employee.setEmployeeId(employeeRepo.findByEmail(employee.getEmail()).getEmployeeId());
			updateEmployee(employee);
		} else {
			createEmployee(employee);
		}
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepo.delete(employee);
		AppLogger.log.info("Existing Employee record deleted");

	}

}
