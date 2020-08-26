package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;

/**
 *	Repository class used for persisting data linking an employee and a batch.
 */
@Repository
public interface EmployeeBatchRepo extends JpaRepository<EmployeeBatch, EmployeeBatchId> {

}
