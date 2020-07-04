package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Associate;
import com.revature.repo.AssociateRepo;

@Service
@Transactional
public class AssociateServiceImpl implements AssociateService {

	private AssociateRepo associateRepo;
	
	@Autowired
	public void setAssociateRepo(AssociateRepo associateRepo) {
		this.associateRepo = associateRepo;
	}
	
	@Override
	public List<Associate> getAllAssociates() {
		return associateRepo.findAll();
	}

	@Override
	public Associate getAssociateByAssociateId(int associateId) {
		return associateRepo.findById(associateId).get();
	}

	@Override
	public List<Associate> getAllAssociatesByBatchName(String batchName) {
		return associateRepo.findAllByBatchBatchName(batchName);
	}

	@Override
	public List<Associate> getAllAssociatesByBatchNameAndActive(String batchName, boolean active) {
		return associateRepo.findAllByBatchBatchNameAndActive(batchName, active);
	}

	@Override
	public List<Associate> getAllAssociatesByBatchId(String batchId) {
		return associateRepo.findAllByBatchBatchId(batchId);
	}

	@Override
	public List<Associate> getAllAssociatesByBatchIdAndActive(String batchId, boolean active) {
		return associateRepo.findAllByBatchBatchIdAndActive(batchId, active);
	}
	
	@Override
	public List<Associate> getAllAssociatesByFullName(String firstName, String lastName) {
		return associateRepo.findAllByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public void createAssociate(Associate associate) {
		associateRepo.save(associate);
	}

	@Override
	public void updateAssociate(Associate associate) {
		associateRepo.findById(associate.getAssociateId()).ifPresent((existingAssociate) -> associateRepo.save(associate));
	}

	@Override
	public void deleteAssociate(Associate associate) {
		associateRepo.delete(associate);
	}

}
