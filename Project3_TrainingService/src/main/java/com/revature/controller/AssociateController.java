package com.revature.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.model.Associate;
import com.revature.service.AssociateService;

/**
 * The controller containing all of the end-points related to the
 * {@link Associate} class.
 */
@CrossOrigin
@RestController
@RequestMapping(value = "associate", produces = "application/json")
public class AssociateController {

	/**
	 * Creates an instance of {@link AssociateService} for retrieving data from the
	 * database.
	 */
	private AssociateService associateService;

	/**
	 * Initializes associateService.
	 */
	@Autowired
	public void setAssociateService(AssociateService associateService) {
		this.associateService = associateService;
	}

	/**
	 * Sets up an end-point for retrieving a list of all associates.
	 */
	@GetMapping("/")
	public List<Associate> getAllAssociates() {
		return associateService.getAllAssociates();
	}

	/**
	 * Sets up an end-point for retrieving an associate with the provided ID.
	 */
	@GetMapping("/id/{associateId}")
	public Associate getAssociateByAssociateId(@PathVariable("associateId") int associateId) {
		return associateService.getAssociateByAssociateId(associateId);
	}

	/**
	 * Sets up an end-point for retrieving an associate with the provided name.
	 */
	@GetMapping("/batch-name/{batchName}")
	public List<Associate> getAssociatesByBatchName(@PathVariable("batchName") String batchName) {
		return associateService.getAllAssociatesByBatchName(batchName);
	}

	/**
	 * Sets up an end-point for retrieving a list of all associates with an active
	 * status sent to true and the provided name.
	 */
	@GetMapping("/batch-name/{batchName}/active/{active}")
	public List<Associate> getActiveAssociatesByBatchName(@PathVariable("batchName") String batchName,
			@PathVariable("active") boolean active) {
		return associateService.getAllAssociatesByBatchNameAndActive(batchName, active);
	}

	/**
	 * Sets up an end-point for retrieving a list of all associates in the batch
	 * with the provided batch ID.
	 */
	@GetMapping("/batch-id/{batchId}")
	public List<Associate> getAssociatesByBatchId(@PathVariable("batchId") String batchId) {
		return associateService.getAllAssociatesByBatchId(batchId);
	}

	/**
	 * Sets up an end-point for retrieving a list of all associates with an active
	 * status sent to true who are in batch with the provided batch ID.
	 */
	@GetMapping("/batch-id/{batchId}/active/{active}")
	public List<Associate> getActiveAssociatesByBatchId(@PathVariable("batchId") String batchId,
			@PathVariable("active") boolean active) {
		return associateService.getAllAssociatesByBatchIdAndActive(batchId, active);
	}

	/**
	 * Sets up an end-point for for retrieving a list of all associates with the
	 * given first name and last name.
	 */
	@GetMapping("/name/{firstName}/{lastName}/")
	public List<Associate> getAssociateByFullName(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return associateService.getAllAssociatesByFullName(firstName, lastName);
	}

	/**
	 * Sets up an end-point for retrieving a list of the email addresses of all
	 * active associates.
	 */
	@GetMapping("/active-emails")
	public List<String> getActiveAssociateEmails() {
		return associateService.getActiveAssociateEmails();
	}

	/**
	 * Sets up an end-point for creating a new associate.
	 */
	@PostMapping("/")
	public String createAssociate(@RequestBody Associate associate) {
		associateService.createAssociate(associate);
		return "Associate successfully created.";
	}

	/**
	 * Sets up an end-point for updating an existing associate.
	 */
	@PutMapping("/")
	public String updateAssociate(@RequestBody Associate associate) {
		associateService.updateAssociate(associate);
		return "Associate successfully updated.";
	}

	/**
	 * Sets up an end-point for deleting an associate with the provided ID.
	 */
	@DeleteMapping("/{associateId}")
	public String deleteAssociate(@PathParam("associateId") int associateId) {
		Associate associate = new Associate();
		associate.setAssociateId(associateId);
		associateService.deleteAssociate(associate);
		return "Associate successfully deleted.";
	}

}
