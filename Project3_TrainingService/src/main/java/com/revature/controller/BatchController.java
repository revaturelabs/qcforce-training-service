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
import com.revature.model.Batch;
import com.revature.service.BatchService;

@RestController
public class BatchController {

	private BatchService batchService;

	@Autowired
	public void setBatchService(BatchService batchService) {
		this.batchService = batchService;
	}
	
	@GetMapping("/batch")
	public List<Batch> getAllForms() {
		return batchService.getAllBatches();
	}
	
	@GetMapping("/batch/{batchName}")
	public List<Batch> getBatchByBatchName(@PathVariable("batchName")String batchName) {
		return (List<Batch>) batchService.getBatchByBatchName(batchName);
	}
	
	@GetMapping("/batch/{batchSkill}")
	public List<Batch> getBatchByBatchSkill(@PathVariable("batchSkill")String batchSkill) {
		return (List<Batch>) batchService.getBatchByBatchSkill(batchSkill);
	}
	
	@GetMapping("/batch/{batchLocation}")
	public List<Batch> getBatchByBatchLocation(@PathVariable("batchLocation")String batchLocation) {
		return (List<Batch>) batchService.getBatchByBatchLocation(batchLocation);
	}
	
	@GetMapping("/Batch/{batchStartDate}")
	public List<Batch> getBatchByBatchStartDate(@PathVariable("batchStartDate")Date batchStartDate) {
		return (List<Batch>) batchService.getBatchByBatchStartDate(batchStartDate);
	}
	
	@GetMapping("/Batch/{currentWeek}")
	public List<Batch> getBatchByCurrentWeek(@PathVariable("currentWeek")String currentWeek) {
		return (List<Batch>) batchService.getBatchByCurrentWeek(currentWeek);
	}
	
	@GetMapping("/batch/{batchType}")
	public List<Batch> getBatchByBatchType(@PathVariable("batchType")String batchType) {
		return (List<Batch>) batchService.getBatchByBatchType(batchType);
	}
	
	@PostMapping("/batch")
	public String createBatch(@RequestBody Batch batch) {
		batchService.createBatch(batch);
		return "Batch successfully created";
	}
	
	@PutMapping("/batch")
	public String updateBatch(@RequestBody Batch batch) {
		batchService.updateBatch(batch);
		return "Batch successfully updated";
	}
	
	@DeleteMapping("/Batch/{batchId}")
	public String deleteBatch(@PathParam("batchId") String batchId) {
		Batch batch = new Batch();
		batch.setBatchId(batchId);
		batchService.deleteBatch(batch);
		return "Batch successfully deleted";
	}


}
