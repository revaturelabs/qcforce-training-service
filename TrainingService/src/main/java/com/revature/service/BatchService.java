package com.revature.service;

import java.util.Date;
import java.util.List;
import com.revature.model.Batch;

/**
 * Interface for methods linked with the {@link Batch} class.
 */
public interface BatchService {

	/**
	 * Retrieves a list of all {@link Batch}.
	 * 
	 * @return list of {@link Batch}
	 */
	public List<Batch> getAllBatches();

	/**
	 * Retrieves a batch by batch id
	 * 
	 * @param batchId is batch id
	 * @return batch with a particular batchId
	 */
	public Batch getBatchByBatchId(String batchId);

	/**
	 * Retrieves a batch by batch name
	 * 
	 * @param batchName is batch name
	 * @return batch
	 */
	public Batch getBatchByBatchName(String batchName);

	/**
	 * Retrieves {@link Batch} by start date of a batch
	 * 
	 * @param startDate is start date of a batch
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByStartDate(Date startDate);

	/**
	 * Retrieves {@link Batch} by date provided less than the start date
	 * 
	 * @param date is date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByStartDateLessThan(Date date);

	/**
	 * Retrieves {@link Batch} by date greater than the provided date.
	 * 
	 * @param date is date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByStartDateGreaterThan(Date date);

	/**
	 * Retrieves {@link Batch} within a range of date one and date two.
	 * 
	 * @param dateOne is a date
	 * @param dateTwo is a date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByStartDateBetween(Date dateOne, Date dateTwo);

	/**
	 * Retrieves {@link Batch} by an end date.
	 * 
	 * @param date is a date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByEndDate(Date date);

	/**
	 * Retrieves {@link Batch} by a date less than the provided date.
	 * 
	 * @param date is a date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByEndDateLessThan(Date date);

	/**
	 * Retrieves {@link Batch} by a date greater than the provided end date.
	 * 
	 * @param date is a date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByEndDateGreaterThan(Date date);

	/**
	 * Retrieves {@link Batch} by a date between two end dates.
	 * 
	 * @param dateOne is a date
	 * @param dateTwo is a date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByEndDateBetween(Date dateOne, Date dateTwo);

	/**
	 * Retrieves {@link Batch} by a date greater than date one and less than date
	 * two.
	 * 
	 * @param dateOne is a date
	 * @param dateTwo is a date
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByStartDateGreaterThanAndEndDateLessThan(Date dateOne, Date dateTwo);

	/**
	 * Retrieves a list of all the active batches
	 * 
	 * @return list of {@link String}
	 */
	public List<String> getActiveBatches();

	/**
	 * Retrieves {@link Batch} by skill
	 * 
	 * @param skill is technology
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesBySkill(String skill);

	/**
	 * Retrieves {@link Batch} by location of a batch
	 * 
	 * @param batchLocation is location of a batch
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByBatchLocation(String batchLocation);

	/**
	 * Retrieves {@link Batch} by batch type
	 * 
	 * @param batchType is type of the batch
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByBatchType(String batchType);

	/**
	 * Retrieves {@link Batch} by current week of the batch.
	 * 
	 * @param currentWeek is current week of batch
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByCurrentWeek(String currentWeek);

	/**
	 * Retrieves {@link Batch} by Employee id.
	 * 
	 * @param employeeId is id of employee
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByEmployeeId(int employeeId);

	/**
	 * Retrieves {@link Batch} by full name of the employee.
	 * 
	 * @param firstName the first name of the employee
	 * @param lastName  the last name of the employee
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByEmployeeFullName(String firstName, String lastName);

	/**
	 * Retrieves {@link Batch} by employee id of the lead trainer.
	 * 
	 * @param employeeId is id of the trainer
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByLeadTrainerEmployeeId(int employeeId);

	/**
	 * Retrieves {@link Batch} by full name of the lead trainer.
	 * 
	 * @param firstName the first name of the trainer
	 * @param lastName  the last name of the trainer
	 * @return list of {@link Batch}
	 */
	public List<Batch> getBatchesByLeadTrainerName(String firstName, String lastName);

	/**
	 * Creates a new batch
	 * 
	 * @param batch is the batch name
	 */
	public void createBatch(Batch batch);

	/**
	 * Updates an existing batch
	 * 
	 * @param batch is the batch name
	 */
	public void updateBatch(Batch batch);

	/**
	 * Creates or updates a batch
	 * 
	 * @param batch is batch name
	 */
	public void createOrUpdateBatch(Batch batch);

	/**
	 * Deletes a batch
	 * 
	 * @param batch is batch name
	 */
	public void deleteBatch(Batch batch);

}
