package com.revature.service;

import java.util.List;

import com.revature.model.Associate;

public interface AssociateService {

	public List<Associate> getAllAssociates();

	public Associate getAssociateByAssociateId(int associateId);
	
	public Associate getAssociateBySalesforceId(int salesforceId);
	
	public Associate getAssociateByBatchName(String batchName);
	
	public Associate getActiveAssociateByBatchName(String batchName);
	
	public Associate getAssociateByFullName(String associateFirstName, String associateLastName);
	
	public void createAssociate(Associate associate);

	public void updateAssociate(Associate associate);

	public void deleteAssociate(Associate associate);
}
