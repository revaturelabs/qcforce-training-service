package com.revature.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Batch;
import com.revature.repo.BatchRepo;

/**
 * Class which implements the {@link BatchService} interface for methods linked
 * with the {@link Batch} class.
 */
@Service
@Transactional
public class BatchServiceImpl implements BatchService {

	private BatchRepo batchRepo;

	@Autowired
	public void setBatchRepo(BatchRepo batchRepo) {
		this.batchRepo = batchRepo;
	}

	@Override
	public List<Batch> getAllBatches() {
		return batchRepo.findAll();
	}

	@Override
	public Batch getBatchByBatchId(String batchId) {
		return batchRepo.findById(batchId).get();
	}

	@Override
	public Batch getBatchByBatchName(String batchName) {
		return batchRepo.findByBatchName(batchName);
	}

	@Override
	public List<Batch> getBatchesByStartDate(Date startDate) {
		return batchRepo.findAllByStartDate(startDate);
	}

	@Override
	public List<Batch> getBatchesByStartDateLessThan(Date date) {
		return batchRepo.findAllByStartDateLessThan(date);
	}

	@Override
	public List<Batch> getBatchesByStartDateGreaterThan(Date date) {
		return batchRepo.findAllByStartDateGreaterThan(date);
	}

	@Override
	public List<Batch> getBatchesByStartDateBetween(Date dateOne, Date dateTwo) {
		return batchRepo.findAllByStartDateBetween(dateOne, dateTwo);
	}

	@Override
	public List<Batch> getBatchesByEndDate(Date date) {
		return batchRepo.findAllByEndDate(date);
	}

	@Override
	public List<Batch> getBatchesByEndDateLessThan(Date date) {
		return batchRepo.findAllByEndDateLessThan(date);
	}

	@Override
	public List<Batch> getBatchesByEndDateGreaterThan(Date date) {
		return batchRepo.findAllByEndDateGreaterThan(date);
	}

	@Override
	public List<Batch> getBatchesByEndDateBetween(Date dateOne, Date dateTwo) {
		return batchRepo.findAllByEndDateBetween(dateOne, dateTwo);
	}

	@Override
	public List<Batch> getBatchesByStartDateGreaterThanAndEndDateLessThan(Date dateOne, Date dateTwo) {
		return batchRepo.findAllByStartDateLessThanAndEndDateGreaterThan(dateOne, dateTwo);
	}

	@Override
	public List<String> getActiveBatches() {
		Date today = new Date();
		System.out.println(today);
		List<Batch> activeBatches = batchRepo.findAllByStartDateLessThanAndEndDateGreaterThan(today, today);
		List<String> activeBatchNames = new ArrayList<String>();
		for (Batch activeBatch : activeBatches) {
			activeBatchNames.add(activeBatch.getBatchName());
		}
		return activeBatchNames;
	}

	@Override
	public List<Batch> getBatchesBySkill(String skill) {
		return batchRepo.findAllBatchesBySkill(skill);
	}

	@Override
	public List<Batch> getBatchesByBatchLocation(String batchLocation) {
		return batchRepo.findAllByBatchLocation(batchLocation);
	}

	@Override
	public List<Batch> getBatchesByBatchType(String batchType) {
		return batchRepo.findAllByBatchType(batchType);
	}

	@Override
	public List<Batch> getBatchesByCurrentWeek(String currentWeek) {
		return batchRepo.findAllByCurrentWeek(currentWeek);
	}

	@Override
	public List<Batch> getBatchesByEmployeeId(int employeeId) {
		return batchRepo.findAllByEmployeeBatchesEmployeeEmployeeId(employeeId);
	}

	@Override
	public List<Batch> getBatchesByEmployeeFullName(String firstName, String lastName) {
		return batchRepo.findAllByEmployeeBatchesEmployeeFirstNameAndEmployeeBatchesEmployeeLastName(firstName,
				lastName);
	}

	@Override
	public List<Batch> getBatchesByLeadTrainerEmployeeId(int employeeId) {
		return batchRepo.findAllByEmployeeBatchesEmployeeEmployeeIdAndEmployeeBatchesEmployeeRole(employeeId,
				"ROLE_LEAD_TRAINER");
	}

	@Override
	public List<Batch> getBatchesByLeadTrainerName(String firstName, String lastName) {
		return batchRepo
				.findAllByEmployeeBatchesEmployeeFirstNameAndEmployeeBatchesEmployeeLastNameAndEmployeeBatchesEmployeeRole(
						firstName, lastName, "ROLE_LEAD_TRAINER");
	}

	@Override
	public void createBatch(Batch batch) {
		batchRepo.save(batch);
	}

	@Override
	public void updateBatch(Batch batch) {
		batchRepo.findById(batch.getBatchId()).ifPresent((existingBatch) -> batchRepo.save(batch));
	}

	@Override
	public void createOrUpdateBatch(Batch batch) {
		if (batchRepo.existsById(batch.getBatchId())) {
			updateBatch(batch);
		} else {
			createBatch(batch);
		}
	}

	@Override
	public void deleteBatch(Batch batch) {
		batchRepo.delete(batch);
	}

}
