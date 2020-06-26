package com.revature.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="qcforce_training.batch")
public class Batch implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="batch_name")
	private String batchName; //primary key
	
	@Column(name="trainer")
	private String batchTrainer;
	
	@Column(name="batch_location")
	private String batchLocation;

	@Column(name="start_date")
	private Date batchStartDate;
	
	@Column(name="end_date")
	private Date batchEndDate;

	@Column(name="training_track")
	private String trainingTrack;

	@Column(name="extended_batch")
	private boolean extendedBatch;

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(String batchName, String batchTrainer, String batchLocation, Date batchStartDate, Date batchEndDate,
			String trainingTrack, boolean extendedBatch) {
		super();
		this.batchName = batchName;
		this.batchTrainer = batchTrainer;
		this.batchLocation = batchLocation;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
		this.trainingTrack = trainingTrack;
		this.extendedBatch = extendedBatch;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchTrainer() {
		return batchTrainer;
	}

	public void setBatchTrainer(String batchTrainer) {
		this.batchTrainer = batchTrainer;
	}

	public String getBatchLocation() {
		return batchLocation;
	}

	public void setLocation(String batchLocation) {
		this.batchLocation = batchLocation;
	}

	public Date getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(Date batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public Date getBatchEndDate() {
		return batchEndDate;
	}

	public void setBatchEndDate(Date batchEndDate) {
		this.batchEndDate = batchEndDate;
	}

	public String getTrainingTrack() {
		return trainingTrack;
	}

	public void setTrainingTrack(String trainingTrack) {
		this.trainingTrack = trainingTrack;
	}

	public boolean isExtendedBatch() {
		return extendedBatch;
	}

	public void setExtendedBatch(boolean extendedBatch) {
		this.extendedBatch = extendedBatch;
	}

}
