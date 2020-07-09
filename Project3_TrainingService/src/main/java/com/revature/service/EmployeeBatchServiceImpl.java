package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.logger.AppLogger;
import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;
import com.revature.repo.EmployeeBatchRepo;

/**
 * Class which implements the {@link EmployeeBatchService} interface for methods
 * linked with the {@link EmployeeBatch} class.
 */
@Service
@Transactional
public class EmployeeBatchServiceImpl implements EmployeeBatchService {

	private EmployeeBatchRepo employeeBatchRepo;

	@Autowired
	public void setEmployeeBatchRepo(EmployeeBatchRepo employeeBatchRepo) {
		this.employeeBatchRepo = employeeBatchRepo;
	}

	@Override
	public List<EmployeeBatch> getAllEmployeeBatches() {
		return employeeBatchRepo.findAll();
	}

	@Override
	public EmployeeBatch getEmployeeBatchByEmployeeBatchId(EmployeeBatchId employeeBatchId) {
		return employeeBatchRepo.findById(employeeBatchId).get();
	}

	@Override
	public void createEmployeeBatch(EmployeeBatch employeeBatch) {
		employeeBatchRepo.save(employeeBatch);
		AppLogger.log.info("New Employee batch record created");

	}

	@Override
	public void updateEmployeeBatch(EmployeeBatch employeeBatch) {
		employeeBatchRepo.findById(employeeBatch.getEmployeeBatchId())
				.ifPresent((existingEmployeeBatch) -> employeeBatchRepo.save(employeeBatch));
		AppLogger.log.info("Existing Employee batch record updated");

	}

	@Override
	public void createOrUpdateEmployeeBatch(EmployeeBatch employeeBatch) {
		employeeBatch.setEmployeeBatchId(employeeBatch.getEmployee().getEmployeeId(),
				employeeBatch.getBatch().getBatchId());
		if (employeeBatchRepo.existsById(employeeBatch.getEmployeeBatchId())) {
			updateEmployeeBatch(employeeBatch);
		} else {
			createEmployeeBatch(employeeBatch);
		}
	}

	@Override
	public void deleteEmployeeBatch(EmployeeBatch employeeBatch) {
		employeeBatchRepo.delete(employeeBatch);
		AppLogger.log.info("Existing Employee batch record deleted");

	}

}
