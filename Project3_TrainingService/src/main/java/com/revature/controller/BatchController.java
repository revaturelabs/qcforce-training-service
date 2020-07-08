package com.revature.controller;

import java.sql.Date;
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
import com.revature.model.Batch;
import com.revature.service.BatchService;

/**
 * The controller containing all of the end-points related to the {@link Batch}
 * class.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "batch", produces = "application/json")
public class BatchController {

	/**
	 * Creates an instance of {@link BatchService} for retrieving data from the
	 * database.
	 */
	private BatchService batchService;

	/**
	 * Initializes batchService.
	 */
	@Autowired
	public void setBatchService(BatchService batchService) {
		this.batchService = batchService;
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches.
	 */
	@GetMapping("/")
	public List<Batch> getAllBatches() {
		return batchService.getAllBatches();
	}

	/**
	 * Sets up an end-point for retrieving a batch with the provided ID.
	 */
	@GetMapping("/id/{batchId}")
	public Batch getBatchByBatchId(@PathVariable("batchId") String batchId) {
		return batchService.getBatchByBatchId(batchId);
	}

	/**
	 * Sets up an end-point for retrieving a batch with the provided name.
	 */
	@GetMapping("/name/{batchName}")
	public Batch getBatchByBatchName(@PathVariable("batchName") String batchName) {
		return batchService.getBatchByBatchName(batchName);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with the provided start
	 * date.
	 */
	@GetMapping("/start-date/{date}")
	public List<Batch> getBatchesByBatchStartDate(@PathVariable("date") Date date) {
		return batchService.getBatchesByStartDate(date);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with a start date
	 * before the provided date.
	 */
	@GetMapping("/start-date-max/{date}")
	public List<Batch> getBatchesByStartDateLessThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByStartDateLessThan(date);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with a start date after
	 * the provided date.
	 */
	@GetMapping("/start-date-min/{date}")
	public List<Batch> getBatchesByStartDateGreaterThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByStartDateGreaterThan(date);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with a start date
	 * between the provided dates.
	 */
	@GetMapping("/start-date-range/{dateOne}/{dateTwo}")
	public List<Batch> getBatchesByStartDateBetween(@PathVariable("dateOne") Date dateOne,
			@PathVariable("dateTwo") Date dateTwo) {
		return batchService.getBatchesByStartDateBetween(dateOne, dateTwo);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with the provided end
	 * date.
	 */
	@GetMapping("/end-date/{date}")
	public List<Batch> getBatchesByEndDate(@PathVariable("date") Date date) {
		return batchService.getBatchesByEndDate(date);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with an end date before
	 * the provided date.
	 */
	@GetMapping("/end-date-max/{date}")
	public List<Batch> getBatchesByEndDateLessThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByEndDateLessThan(date);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with an end date after
	 * the provided date.
	 */
	@GetMapping("/end-date-min/{date}")
	public List<Batch> getBatchesByEndDateGreaterThan(@PathVariable("date") Date date) {
		return batchService.getBatchesByEndDateGreaterThan(date);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with an end date
	 * between the provided dates.
	 */
	@GetMapping("/end-date-range/{dateOne}/{dateTwo}")
	public List<Batch> getBatchesByEndDateBetween(@PathVariable("dateOne") Date dateOne,
			@PathVariable("dateTwo") Date dateTwo) {
		return batchService.getBatchesByEndDateBetween(dateOne, dateTwo);
	}

	/**
	 * Sets up an end-point for retrieving a list of batches with a start date after
	 * the first date provided and an end date before the second date provided.
	 */
	@GetMapping("/date-range/{dateOne}/{dateTwo}")
	public List<Batch> getBatchesByStartDateGreaterThanAndEndDateLessThan(@PathVariable("dateOne") Date dateOne,
			@PathVariable("dateTwo") Date dateTwo) {
		return batchService.getBatchesByStartDateGreaterThanAndEndDateLessThan(dateOne, dateTwo);
	}

	/**
	 * Sets up an end-point for retrieving a list of all active batches.
	 */
	@GetMapping("/active")
	public List<String> getActiveBatches() {
		return batchService.getActiveBatches();
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches with the provided
	 * skill.
	 */
	@GetMapping("/skill/{skill}")
	public List<Batch> getBatchesBySkill(@PathVariable("skill") String skill) {
		return batchService.getBatchesBySkill(skill);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches at the provided
	 * location.
	 */
	@GetMapping("/location/{batchLocation}")
	public List<Batch> getBatchByBatchLocation(@PathVariable("batchLocation") String batchLocation) {
		return batchService.getBatchesByBatchLocation(batchLocation);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches of the provided
	 * type.
	 */
	@GetMapping("/type/{batchType}")
	public List<Batch> getBatchByBatchType(@PathVariable("batchType") String batchType) {
		return batchService.getBatchesByBatchType(batchType);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches whose current week
	 * matches the provided week.
	 */
	@GetMapping("/week/{currentWeek}")
	public List<Batch> getBatchByCurrentWeek(@PathVariable("currentWeek") String currentWeek) {
		return batchService.getBatchesByCurrentWeek(currentWeek);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches associated with an
	 * employee with the provided ID.
	 */
	@GetMapping("/employee-id/{employeeId}")
	public List<Batch> getBatchesByEmployeeId(@PathVariable("employeeId") int employeeId) {
		return batchService.getBatchesByEmployeeId(employeeId);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches with an employee
	 * with the provided first and last name.
	 */
	@GetMapping("/employee-name/{firstName}/{lastName}")
	public List<Batch> getBatchesByEmployeeFullName(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return batchService.getBatchesByEmployeeFullName(firstName, lastName);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches where the employee
	 * with the provided ID has the role of "ROLE_LEAD_TRAINER".
	 */
	@GetMapping("/trainer-id/{employeeId}")
	public List<Batch> getBatchesByLeadTrainerEmployeeId(@PathVariable("employeeId") int employeeId) {
		return batchService.getBatchesByLeadTrainerEmployeeId(employeeId);
	}

	/**
	 * Sets up an end-point for retrieving a list of all batches where the employee
	 * with the provided first and last name has the role of "ROLE_LEAD_TRAINER".
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@GetMapping("/trainer-name/{firstName}/{lastName}")
	public List<Batch> getBatchesByLeadTrainerName(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return batchService.getBatchesByLeadTrainerName(firstName, lastName);
	}

	/**
	 * Sets up an end-point for creating a new batch.
	 * 
	 * @param batch
	 * @return
	 */
	@PostMapping("/")
	public String createBatch(@RequestBody Batch batch) {
		batchService.createBatch(batch);
		return "Batch successfully created";
	}

	/**
	 * Sets up an end-point for updating a batch.
	 */
	@PutMapping("/")
	public String updateBatch(@RequestBody Batch batch) {
		batchService.updateBatch(batch);
		return "Batch successfully updated";
	}

	/**
	 * Sets up an end-point for deleting a batch with the given ID.
	 */
	@DeleteMapping("/{batchId}")
	public String deleteBatch(@PathParam("batchId") String batchId) {
		Batch batch = new Batch();
		batch.setBatchId(batchId);
		batchService.deleteBatch(batch);
		return "Batch successfully deleted";
	}

}
