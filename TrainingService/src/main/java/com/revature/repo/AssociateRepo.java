package com.revature.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Associate;

/**
 * Repository class used for persisting {@link Associate} data.
 */
@Repository
public interface AssociateRepo extends JpaRepository<Associate, Integer> {

	/**
	 * Find an {@link Associate} by salesforce ID.
	 * 
	 * @param salesforceId a String representing the salesforceID of an
	 *                     {@link Associate}
	 * @return a single {@link Associate} with the provided salesforceID
	 */
	public Associate findBySalesforceId(String salesforceId);

	/**
	 * Find all {@link Associate}s by batch name.
	 * 
	 * @param batchName a String representing a batch name
	 * @return a List of {@link Associate}s from the given batch
	 */
	public List<Associate> findAllByBatchBatchName(String batchName);

	/**
	 * Find all {@link Associate}s by batch name and active status.
	 * 
	 * @param batchName a String representing a batch name
	 * @param active    a boolean indicating whether a given {@link Associate} is
	 *                  active
	 * @return a list of {@link Associate}s from the given batch, with a
	 *         corresponding active status
	 */
	public List<Associate> findAllByBatchBatchNameAndActive(String batchName, boolean active);

	/**
	 * Find all {@link Associate}s with the first name and last name provided.
	 * 
	 * @param firstName a String representing an {@link Associate}'s first name
	 * @param lastName  a String representing an {@link Associate}'s last name
	 * @return a list of {@link Associate}s with the provided first and last names
	 */
	public List<Associate> findAllByFirstNameAndLastName(String firstName, String lastName);

	/**
	 * Find all {@link Associate}s by batch ID.
	 * 
	 * @param batchId a String representing a batch ID
	 * @return a List of {@link Associate}s from the given batch
	 */
	public List<Associate> findAllByBatchBatchId(String batchId);

	/**
	 * Find all {@link Associate}s by batch ID and active status.
	 * 
	 * @param batchId a String representing a batch Id
	 * @param active  a boolean indicating whether a given {@link Associate} is
	 *                active
	 * @return a list of {@link Associate}s from the given batch, with a
	 *         corresponding active status
	 */
	public List<Associate> findAllByBatchBatchIdAndActive(String batchId, boolean active);

	/**
	 * Find all {@link Associate}s by active status.
	 * 
	 * @param active a boolean indicating whether a given {@link Associate} is
	 *               active
	 * @return a list of {@link Associate}s with a corresponding active status
	 */
	public List<Associate> findAllByActive(boolean active);

}
