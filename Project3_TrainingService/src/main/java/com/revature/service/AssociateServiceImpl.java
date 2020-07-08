package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Associate;
import com.revature.repo.AssociateRepo;

/**
 * Class which implements the {@link AssociateService} interface for methods
 * linked with the {@link Associate} class.
 */
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
	public List<Associate> getAllActiveAssociates() {
		return associateRepo.findAllByActive(true);
	}

	@Override
	public List<String> getActiveAssociateEmails() {
		List<Associate> activeAssociates = getAllActiveAssociates();
		List<String> emails = new ArrayList<String>();
		for (Associate activeAssociate : activeAssociates) {
			emails.add(activeAssociate.getEmail());
		}
		return emails;
	}

	@Override
	public void createAssociate(Associate associate) {
		associateRepo.save(associate);
	}

	@Override
	public void updateAssociate(Associate associate) {
		associateRepo.findById(associate.getAssociateId())
				.ifPresent((existingAssociate) -> associateRepo.save(associate));
	}

	/**
	 * Searches the database to determine if the {@code associate} is already
	 * included in the database, based on the {@code salesforceId}.
	 * 
	 * If found, the {@code updateAssociate(Associate associate)} method is called
	 * to update the entry. Otherwise, a new entry is made using the
	 * {@code createAssociate(Associate associate)} method.
	 * 
	 * @param associate An instance of {@code associate} without an
	 *                  {@code associateId} assigned to it.
	 * @see Associate
	 */
	@Override
	public void createOrUpdateAssociate(Associate associate) {
		if (!(associateRepo.findBySalesforceId(associate.getSalesforceId()) == null)) {
			associate.setAssociateId(associateRepo.findBySalesforceId(associate.getSalesforceId()).getAssociateId());
			updateAssociate(associate);
		} else {
			createAssociate(associate);
		}
	}

	@Override
	public void deleteAssociate(Associate associate) {
		associateRepo.delete(associate);
	}

}
