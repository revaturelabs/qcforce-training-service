package com.revature.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="qcforce_training.batch")
public class Batch implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="batch_name")
	private String batchName; //PK
	
	@Column(name="batch_id") 
	private int batchId;
	
	@Column(name="batch_start_date")
	private Date batchStartDate;
	
	@Column(name="batch_end_date")
	private Date batchEndDate;
	
	@Column(name="batch_skill")
	private String batchSkill;
	
	@Column(name="batch_location")
	private String batchLocation;

	@Column(name="batch_type")
	private String type;

	@Column(name="batch_good_grade")
	private boolean goodGrade;
	
	@Column(name="batch_passing_grade")
	private boolean passingGrade;
	
	@Column(name="batch_current_week")
	private String currentWeek;

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
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

	public String getBatchSkill() {
		return batchSkill;
	}

	public void setSkill(String skill) {
		this.batchSkill = skill;
	}

	public String getBatchLocation() {
		return batchLocation;
	}

	public void setBatchLocation(String batchLocation) {
		this.batchLocation = batchLocation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isGoodGrade() {
		return goodGrade;
	}

	public void setGoodGrade(boolean goodGrade) {
		this.goodGrade = goodGrade;
	}

	public boolean isPassingGrade() {
		return passingGrade;
	}

	public void setPassingGrade(boolean passingGrade) {
		this.passingGrade = passingGrade;
	}

	public String isCurrent_week() {
		return currentWeek;
	}

	public void setCurrent_week(String current_week) {
		this.currentWeek = current_week;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", batchStartDate="
				+ batchStartDate + ", batchEndDate=" + batchEndDate + ", skill=" + batchSkill + ", batchLocation="
				+ batchLocation + ", type=" + type + ", goodGrade=" + goodGrade + ", passingGrade=" + passingGrade
				+ ", current_week=" + currentWeek + "]";
	}

}
