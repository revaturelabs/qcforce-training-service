package com.revature.service;

import java.sql.Date;
import java.util.List;
import com.revature.model.Batch;

public interface BatchService {

	public List<Batch> getAllBatches();

	public Batch getBatchByBatchName(String batchName);
	
	public Batch getBatchByBatchSkill(String batchSkill);
	
	public Batch getBatchByBatchLocation(String batchLocation);
	
	public Batch getBatchByBatchStartDate(Date batch_start_date);
	
	public Batch getBatchByCurrentWeek(String current_week);
	
	public Batch getBatchByBatchType(String type);
	
	public void createBatch(Batch batch);

	public void updateBatch(Batch batch);

	public void deleteBatch(Batch batch);
	
}
