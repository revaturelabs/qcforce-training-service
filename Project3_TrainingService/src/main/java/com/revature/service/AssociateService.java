package com.revature.service;

import java.util.List;

import com.revature.model.Associate;

public interface AssociateService {

	public List<Associate> getAllAssociates();

	public Associate getAssociateByAssociateId(int associateId);
	
	public List<Associate> getAllAssociatesByBatchName(String batchName);
	
	public List<Associate> getAllAssociatesByBatchNameAndActive(String batchName, boolean active);
	
	public List<Associate> getAllAssociatesByBatchId(String batchId);
	
	public List<Associate> getAllAssociatesByBatchIdAndActive(String batchId, boolean active);
	
	public List<Associate> getAllAssociatesByFullName(String associateFirstName, String associateLastName);
	
	public void createAssociate(Associate associate);

	public void updateAssociate(Associate associate);
	
	public void createOrUpdateAssociate(Associate associate);

	public void deleteAssociate(Associate associate);
}
