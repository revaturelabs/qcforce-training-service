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
import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;
import com.revature.service.EmployeeBatchService;

@RestController
public class EmployeeBatchController {
	
	private EmployeeBatchService employeeBatchService;

	@Autowired
	public void setEmployeeEmployeeBatchService(EmployeeBatchService employeeBatchService) {
		this.employeeBatchService = employeeBatchService;
	}
	
	@GetMapping("/employeebatch")
	public List<EmployeeBatch> getAllForms() {
		return employeeBatchService.getAllEmployeeBatches();
	}
	
	@GetMapping("/employeebatch/{id}")
	public List<EmployeeBatch> getEmployeeEmployeeBatchByEmployeeBatchId(@PathVariable("id")EmployeeBatchId id) {
		return (List<EmployeeBatch>) employeeBatchService.getEmployeeBatchByEmployeeBatchId(id);
	}
	
	@GetMapping("/employeebatch/{employeeRole}")
	public List<Employeebatch> getEmployeeBatchByEmployeeRole(@PathVariable("employeeRole")String employeeRole) {
		return (List<EmployeeBatch>) EmployeeEmployeeEmployeeBatchService.getEmployeeBatchByEmployeeRole(employeeRole);
	}
	
	@GetMapping("/employeebatch/{batchLocation}")
	public List<EmployeeBatch> getEmployeeBatchByEmployeeBatchLocation(@PathVariable("batchLocation")String batchLocation) {
		return (List<EmployeeBatch>) EmployeeEmployeeEmployeeBatchService.getEmployeeBatchByEmployeeBatchLocation(batchLocation);
	}
	
	@GetMapping("/EmployeeBatch/{batchStartDate}")
	public List<EmployeeBatch> getEmployeeBatchByEmployeeBatchStartDate(@PathVariable("batchStartDate")Date batchStartDate) {
		return (List<EmployeeBatch>) EmployeeEmployeeEmployeeBatchService.getEmployeeBatchByEmployeeBatchStartDate(batchStartDate);
	}
	
	@GetMapping("/EmployeeBatch/{currentWeek}")
	public List<EmployeeBatch> getEmployeeBatchByCurrentWeek(@PathVariable("currentWeek")String currentWeek) {
		return (List<EmployeeBatch>) EmployeeEmployeeEmployeeBatchService.getEmployeeBatchByCurrentWeek(currentWeek);
	}
	
	@GetMapping("/batch/{batchType}")
	public List<EmployeeBatch> getEmployeeBatchByEmployeeBatchType(@PathVariable("batchType")String batchType) {
		return (List<EmployeeBatch>) employeeBatchService.getEmployeeBatchByEmployeeBatchType(batchType);
	}
	
	@PostMapping("/batch")
	public String createEmployeeBatch(@RequestBody EmployeeBatch batch) {
		employeeEmployeeBatchService.createEmployeeBatch(batch);
		return "EmployeeBatch successfully created";
	}
	
	@PutMapping("/batch")
	public String updateEmployeeBatch(@RequestBody EmployeeBatch batch) {
		employeeBatchService.updateEmployeeBatch(batch);
		return "EmployeeBatch successfully updated";
	}
	
	@DeleteMapping("/EmployeeBatch/{batchId}")
	public String deleteEmployeeBatch(@PathParam("batchId") int batchId) {
		EmployeeBatch batch = new EmployeeBatch();
		batch.setEmployeeBatchId(batchId);
		employeeBatchService.deleteEmployeeBatch(batch);
		return "EmployeeBatch successfully deleted";
	}


}
