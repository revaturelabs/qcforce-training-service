package com.revature.service;

import java.sql.Date;
import java.util.List;
import com.revature.model.Batch;

public interface BatchService {

	public List<Batch> getAllBatches();

	public Batch getBatchByBatchId(String batchId);

	public Batch getBatchByBatchName(String batchName);

	public List<Batch> getBatchesByStartDate(Date startDate);

	public List<Batch> getBatchesByStartDateLessThan(Date date);

	public List<Batch> getBatchesByStartDateGreaterThan(Date date);

	public List<Batch> getBatchesByStartDateBetween(Date dateOne, Date dateTwo);

	public List<Batch> getBatchesByEndDate(Date date);

	public List<Batch> getBatchesByEndDateLessThan(Date date);

	public List<Batch> getBatchesByEndDateGreaterThan(Date date);

	public List<Batch> getBatchesByEndDateBetween(Date dateOne, Date dateTwo);

	public List<Batch> getBatchesByStartDateGreaterThanAndEndDateLessThan(Date dateOne, Date dateTwo);

	public List<Batch> getBatchesBySkill(String skill);

	public List<Batch> getBatchesByBatchLocation(String batchLocation);
	
	public List<Batch> getBatchesByBatchType(String batchType);

	public List<Batch> getBatchesByCurrentWeek(String currentWeek);
	
	public List<Batch> getBatchesByEmployeeId(int employeeId);
	
	public List<Batch> getBatchesByEmployeeFullName(String firstName, String lastName);
	
	public List<Batch> getBatchesByLeadTrainerEmployeeId(int employeeId);
	
	public List<Batch> getBatchesByLeadTrainerName(String firstName, String lastName);

	public void createBatch(Batch batch);

	public void updateBatch(Batch batch);
	
	public void createOrUpdateBatch(Batch batch);

	public void deleteBatch(Batch batch);

}
