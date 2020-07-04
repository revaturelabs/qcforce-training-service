package com.revature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Associate;

@Repository
public interface AssociateRepo extends JpaRepository<Associate, Integer> {

	public Associate findBySalesforceId(String salesforceId);

	public List<Associate> findAllByBatchBatchName(String batchName);

	public List<Associate> findAllByBatchBatchNameAndActive(String batchName, boolean active);

	public List<Associate> findAllByFirstNameAndLastName(String firstName, String lastName);

	public List<Associate> findAllByBatchBatchId(String batchId);

	public List<Associate> findAllByBatchBatchIdAndActive(String batchId, boolean active);

}

