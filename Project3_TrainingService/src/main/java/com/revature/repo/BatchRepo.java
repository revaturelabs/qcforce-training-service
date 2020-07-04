package com.revature.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Batch;

@Repository
public interface BatchRepo extends JpaRepository<Batch,String> {

	Batch findByBatchName(String batchName);

	List<Batch> findAllByStartDate(Date startDate);

	List<Batch> findAllByStartDateLessThan(Date date);

	List<Batch> findAllByStartDateGreaterThan(Date date);

	List<Batch> findAllByStartDateBetween(Date dateOne, Date dateTwo);

	List<Batch> findAllByEndDate(Date endDate);
	
	List<Batch> findAllByEndDateLessThan(Date date);
	
	List<Batch> findAllByEndDateGreaterThan(Date date);

	List<Batch> findAllByEndDateBetween(Date dateOne, Date dateTwo);

	List<Batch> findAllByStartDateGreaterThanAndEndDateLessThan(Date dateOne, Date dateTwo);

	List<Batch> findAllBatchesBySkill(String skill);

	List<Batch> findAllByBatchLocation(String batchLocation);

	List<Batch> findAllByBatchType(String batchType);

	List<Batch> findAllByCurrentWeek(String currentWeek);

	List<Batch> findAllByEmployeeBatchesEmployeeEmployeeId(int employeeId);

	List<Batch> findAllByEmployeeBatchesEmployeeFirstNameAndEmployeeBatchesEmployeeLastName(String firstName,
			String lastName);

	List<Batch> findAllByEmployeeBatchesEmployeeEmployeeIdAndEmployeeBatchesEmployeeRole(int employeeId, String employeeRole);

	List<Batch> findAllByEmployeeBatchesEmployeeFirstNameAndEmployeeBatchesEmployeeLastNameAndEmployeeBatchesEmployeeRole(
			String firstName, String lastName, String string);

}
