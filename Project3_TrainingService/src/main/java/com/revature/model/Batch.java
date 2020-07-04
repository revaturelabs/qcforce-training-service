package com.revature.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="qcforce_training.batch")
public class Batch implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String batchId;
	
	@Column(name="batch_name") 
	private String batchName;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="skill")
	private String skill;
	
	@Column(name="batch_location")
	private String batchLocation;

	@Column(name="batch_type")
	private String batchType;

	@Column(name="good_grade")
	private boolean goodGrade;
	
	@Column(name="passing_grade")
	private boolean passingGrade;
	
	@Column(name="current_week")
	private String currentWeek;

	@OneToMany(mappedBy="batch")
	private List<Associate> associates = new ArrayList<Associate>();
	
	@OneToMany(mappedBy="batch")
	private List<EmployeeBatch> employeeBatches = new ArrayList<EmployeeBatch>();
	
	public Batch() {
		super();
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getBatchLocation() {
		return batchLocation;
	}

	public void setBatchLocation(String batchLocation) {
		this.batchLocation = batchLocation;
	}

	public String getBatchType() {
		return batchType;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
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

	public String getCurrentWeek() {
		return currentWeek;
	}

	public void setCurrentWeek(String currentWeek) {
		this.currentWeek = currentWeek;
	}

	public List<Associate> getAssociates() {
		return associates;
	}

	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}
	
	public void addAssociate(Associate associate) {
		this.associates.add(associate);
	}
	
	public List<EmployeeBatch> getEmployeeBatches() {
		return employeeBatches;
	}

	public void setEmployeeBatches(List<EmployeeBatch> employeeBatches) {
		this.employeeBatches = employeeBatches;
	}

	public void addEmployeeBatch(EmployeeBatch employeeBatch) {
		this.employeeBatches.add(employeeBatch);
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", skill=" + skill + ", batchLocation=" + batchLocation + ", batchType=" + batchType
				+ ", goodGrade=" + goodGrade + ", passingGrade=" + passingGrade + ", currentWeek=" + currentWeek
				+ ", associates=" + associates + ", employeeBatches=" + employeeBatches + "]";
	}
	
}
