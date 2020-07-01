package com.revature.controller;

import java.sql.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.revature.model.Associate;
import com.revature.service.AssociateService;

@RestController
public class AssociateController {
	
	private AssociateService associateService;

	@Autowired
	public void setAssociateService(AssociateService associateService) {
		this.associateService = associateService;
	}
	
	@GetMapping("/associate")
	public List<Associate> getAllForms() {
		return associateService.getAllAssociates();
	}
	
	@GetMapping("/associate/{associateId}")
	public List<Associate> getAssociateByassociateName(@PathVariable("associateId")int associateId) {
		return (List<Associate>) associateService.getAssociateByAssociateId(associateId);
	}
	
	@GetMapping("/batch/{salesforceId}")
	public List<Associate> getassociateBySalesforceId(@PathVariable("salesforceId")int salesforceId) {
		return (List<Associate>) associateService.getAssociateBySalesforceId(salesforceId);
	}
	
	@GetMapping("/batch/{batchName}")
	public List<Associate> getAssociateByBatchName(@PathVariable("batchName")String batchName) {
		return (List<Associate>) associateService.getAssociateByBatchName(batchName);
	}
	
	@GetMapping("/associate/{active/batchName}")
	public List<Associate> getActiveAssociateByBatchName(@PathVariable("batchName")String batchName) {
		return (List<Associate>) associateService.getActiveAssociateByBatchName(batchName);
	}
	
	@GetMapping("/associate/{associateFirstName+associateLastName}/")
	public List<Associate> getAssociateByFullName(@PathVariable("associateFirstName")String associateFirstName, @PathVariable("associateLastName")String associateLastName) {
		return (List<Associate>) associateService.getAssociateByFullName(associateFirstName,associateLastName);
	}
	
	@PostMapping("/associate")
	public String createassociate(@RequestBody Associate associate) {
		associateService.createAssociate(associate);
		return "associate successfully created";
	}
	
	@PutMapping("/associate")
	public String updateassociate(@RequestBody Associate associate) {
		associateService.updateAssociate(associate);
		return "associate successfully updated";
	}
	
	@DeleteMapping("/associate/{associateId}")
	public String deleteassociate(@PathParam("associateId") int associateId) {
		Associate associate = new Associate();
		associate.setAssociateId(associateId);
		associateService.deleteAssociate(associate);
		return "Associate successfully deleted";
	}


}
