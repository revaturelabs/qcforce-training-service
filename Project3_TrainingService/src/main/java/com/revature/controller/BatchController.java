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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.model.Batch;
import com.revature.service.BatchService;

@RestController
@RequestMapping("batch")
public class BatchController {

	private BatchService batchService;

	@Autowired
	public void setBatchService(BatchService batchService) {
		this.batchService = batchService;
	}
	
	@GetMapping("/")
	public List<Batch> getAllBatches() {
		return batchService.getAllBatches();
	}
	
	@GetMapping("/id/{batchId}")
	public Batch getBatchByBatchId(@PathVariable("batchId") String batchId) {
		return batchService.getBatchByBatchId(batchId);
	}
	
	@GetMapping("/name/{batchName}")
	public Batch getBatchByBatchName(@PathVariable("batchName") String batchName) {
		return batchService.getBatchByBatchName(batchName);
	}
	
	@GetMapping("/start-date/{date}")
	public List<Batch> getBatchesByBatchStartDate(@PathVariable("date") Date date) {
		return batchService.getBatchesByStartDate(date);
	}
	
	@GetMapping("/start-date-max/{date}")
	public List<Batch> getBatchesByStartDateLessThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByStartDateLessThan(date);
	}

	@GetMapping("/start-date-min/{date}")
	public List<Batch> getBatchesByStartDateGreaterThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByStartDateGreaterThan(date);
	}

	@GetMapping("/start-date-range/{dateOne}/{dateTwo}")
	public List<Batch> getBatchesByStartDateBetween(@PathVariable("dateOne") Date dateOne, @PathVariable("dateTwo") Date dateTwo) {
		return batchService.getBatchesByStartDateBetween(dateOne, dateTwo);
	}
	
	@GetMapping("/end-date/{date}")
	public List<Batch> getBatchesByEndDate(@PathVariable("date") Date date) {
		return batchService.getBatchesByEndDate(date);
	}
	
	@GetMapping("/end-date-max/{date}")
	public List<Batch> getBatchesByEndDateLessThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByEndDateLessThan(date);
	}

	@GetMapping("/end-date-min/{date}")
	public List<Batch> getBatchesByEndDateGreaterThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByEndDateGreaterThan(date);
	}

	@GetMapping("/end-date-range/{dateOne}/{dateTwo}")
	public List<Batch> getBatchesByEndDateBetween(@PathVariable("dateOne") Date dateOne, @PathVariable("dateTwo") Date dateTwo) {
		return batchService.getBatchesByEndDateBetween(dateOne, dateTwo);
	}

	@GetMapping("/date-range/{dateOne}/{dateTwo}")
	public List<Batch> getBatchesByStartDateGreaterThanAndEndDateLessThan(@PathVariable("dateOne") Date dateOne, @PathVariable("dateTwo") Date dateTwo) {
		return batchService.getBatchesByStartDateGreaterThanAndEndDateLessThan(dateOne, dateTwo);
	}
	
	@GetMapping("/skill/{skill}")
	public List<Batch> getBatchesBySkill(@PathVariable("skill") String skill) {
		return batchService.getBatchesBySkill(skill);
	}
	
	@GetMapping("/location/{batchLocation}")
	public List<Batch> getBatchByBatchLocation(@PathVariable("batchLocation") String batchLocation) {
		return batchService.getBatchesByBatchLocation(batchLocation);
	}

	@GetMapping("/type/{batchType}")
	public List<Batch> getBatchByBatchType(@PathVariable("batchType") String batchType) {
		return batchService.getBatchesByBatchType(batchType);
	}
	
	@GetMapping("/week/{currentWeek}")
	public List<Batch> getBatchByCurrentWeek(@PathVariable("currentWeek") String currentWeek) {
		return batchService.getBatchesByCurrentWeek(currentWeek);
	}
	
	@GetMapping("/employee-id/{employeeId}")
	public List<Batch> getBatchesByEmployeeId(@PathVariable("employeeId") int employeeId) {
		return batchService.getBatchesByEmployeeId(employeeId);
	}
	
	@GetMapping("/employee-name/{firstName}/{lastName}")
	public List<Batch> getBatchesByEmployeeFullName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return batchService.getBatchesByEmployeeFullName(firstName, lastName);
	}

	@GetMapping("/trainer-id/{employeeId}")
	public List<Batch> getBatchesByLeadTrainerEmployeeId(@PathVariable("employeeId") int employeeId) {
		return batchService.getBatchesByLeadTrainerEmployeeId(employeeId);
	}

	@GetMapping("/trainer-name/{firstName}/{lastName}")
	public List<Batch> getBatchesByLeadTrainerName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return batchService.getBatchesByLeadTrainerName(firstName, lastName);
	}
	
	@PostMapping("/")
	public String createBatch(@RequestBody Batch batch) {
		batchService.createBatch(batch);
		return "Batch successfully created";
	}
	
	@PutMapping("/")
	public String updateBatch(@RequestBody Batch batch) {
		batchService.updateBatch(batch);
		return "Batch successfully updated";
	}
	
	@DeleteMapping("/{batchId}")
	public String deleteBatch(@PathParam("batchId") String batchId) {
		Batch batch = new Batch();
		batch.setBatchId(batchId);
		batchService.deleteBatch(batch);
		return "Batch successfully deleted";
	}


}
