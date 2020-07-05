package com.revature.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("associate")
public class AssociateController {
	
	private AssociateService associateService;

	@Autowired
	public void setAssociateService(AssociateService associateService) {
		this.associateService = associateService;
	}
	
	@GetMapping("/")
	public List<Associate> getAllAssociates() {
		return associateService.getAllAssociates();
	}
	
	@GetMapping("/id/{associateId}")
	public Associate getAssociateByAssociateId(@PathVariable("associateId")int associateId) {
		return associateService.getAssociateByAssociateId(associateId);
	}
	
	@GetMapping("/batch-name/{batchName}")
	public List<Associate> getAssociatesByBatchName(@PathVariable("batchName")String batchName) {
		return associateService.getAllAssociatesByBatchName(batchName);
	}
	
	@GetMapping("/batch-name/{batchName}/active/{active}")
	public List<Associate> getActiveAssociatesByBatchName(@PathVariable("batchName")String batchName, @PathVariable("active") boolean active) {
		return associateService.getAllAssociatesByBatchNameAndActive(batchName, active);
	}
	
	@GetMapping("/batch-id/{batchId}")
	public List<Associate> getAssociatesByBatchId(@PathVariable("batchId")String batchId) {
		return associateService.getAllAssociatesByBatchId(batchId);
	}
	
	@GetMapping("/batch-id/{batchId}/active/{active}")
	public List<Associate> getActiveAssociatesByBatchId(@PathVariable("batchId")String batchId, @PathVariable("active") boolean active) {
		return associateService.getAllAssociatesByBatchIdAndActive(batchId, active);
	}
	
	@GetMapping("/name/{firstName+lastName}/")
	public List<Associate> getAssociateByFullName(@PathVariable("firstName")String firstName, @PathVariable("lastName")String lastName) {
		return associateService.getAllAssociatesByFullName(firstName, lastName);
	}
	
	@GetMapping("/active-emails")
	public List<String> getActiveAssociateEmails() {
		return associateService.getActiveAssociateEmails();
	}
	
	@PostMapping("/")
	public String createAssociate(@RequestBody Associate associate) {
		associateService.createAssociate(associate);
		return "Associate successfully created.";
	}
	
	@PutMapping("/")
	public String updateAssociate(@RequestBody Associate associate) {
		associateService.updateAssociate(associate);
		return "Associate successfully updated.";
	}
	
	@DeleteMapping("/{associateId}")
	public String deleteAssociate(@PathParam("associateId") int associateId) {
		Associate associate = new Associate();
		associate.setAssociateId(associateId);
		associateService.deleteAssociate(associate);
		return "Associate successfully deleted.";
	}


}
