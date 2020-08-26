package com.revature.service;

import java.util.List;

import com.revature.model.Associate;

/**
 * Interface for methods linked with the {@link Associate} class.
 */
public interface AssociateService {

	/**
	 * Retrieves a List of all {@link Associate} objects
	 *
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllAssociates();

	/**
	 * Retrieves an {@link Associate} object with a given ID
	 * 
	 * @param associateId an int representing an ID
	 * @return an {@link Associate} object
	 */
	public Associate getAssociateByAssociateId(int associateId);

	/**
	 * Retrieves a List of all {@link Associate} objects from a given batch, based
	 * on the batch name
	 * 
	 * @param batchName a String representing a batch name
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllAssociatesByBatchName(String batchName);

	/**
	 * Retrieves a List of all {@link Associate} objects from a given batch, based
	 * on the batch name, with a given active status
	 * 
	 * @param batchName a String representing a batch name
	 * @param active    a boolean indicating whether a given {@link Associate} is
	 *                  active
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllAssociatesByBatchNameAndActive(String batchName, boolean active);

	/**
	 * Retrieves a List of all {@link Associate} objects from a given batch, based
	 * on the batch ID
	 * 
	 * @param batchId a String representing a batch ID
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllAssociatesByBatchId(String batchId);

	/**
	 * Retrieves a List of all {@link Associate} objects from a given batch, based
	 * on the batch ID, with a given active status
	 * 
	 * @param batchId a String representing a batch ID
	 * @param active  a boolean indicating whether a given {@link Associate} is
	 *                active
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllAssociatesByBatchIdAndActive(String batchId, boolean active);

	/**
	 * Retrieves a List of all {@link Associate} objects with a given first and last
	 * name
	 * 
	 * @param associateFirstName a String representing an {@link Associate}'s first
	 *                           name
	 * @param associateLastName  a String representing an {@link Associate}'s last
	 *                           name
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllAssociatesByFullName(String associateFirstName, String associateLastName);

	/**
	 * Retrieves a List of all {@link Associate} objects with an active status set
	 * to true
	 * 
	 * @return a List of {@link Associate} objects
	 */
	public List<Associate> getAllActiveAssociates();

	/**
	 * Retrieves a List of all {@link Associate} email addresses
	 * 
	 * @return a List of {@link Associate} objects
	 */
	public List<String> getActiveAssociateEmails();

	/**
	 * Creates a new {@link Associate} in the database
	 * 
	 * @param associate an associate to be saved to the database
	 */
	public void createAssociate(Associate associate);

	/**
	 * Updates an existing {@link Associate} in the database
	 * 
	 * @param associate an associate to be updated in the database
	 */
	public void updateAssociate(Associate associate);

	/**
	 * Creates a new {@link Associate} if the {@link Associate} does not yet exist
	 * in the database, or to update the information for that {@link Associate} if
	 * they do exist
	 * 
	 * @param associate an associate to be saved or updated in the database
	 */
	public void createOrUpdateAssociate(Associate associate);

	/**
	 * Deletes an {@link Associate} from the database
	 * 
	 * @param associate an associate to be deleted from the database
	 */
	public void deleteAssociate(Associate associate);
}
