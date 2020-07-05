package com.revature.model;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="batch", schema="qcforce_training")
public class Batch implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2748183932280317936L;

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
	private int goodGrade;
	
	@Column(name="passing_grade")
	private int passingGrade;
	
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

	public int isGoodGrade() {
		return goodGrade;
	}

	public void setGoodGrade(int goodGrade) {
		this.goodGrade = goodGrade;
	}

	public int isPassingGrade() {
		return passingGrade;
	}

	public void setPassingGrade(int passingGrade) {
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
	
	@JsonIgnore
	public List<EmployeeBatch> getEmployeeBatches() {
		return employeeBatches;
	}

	@JsonIgnore
	public void setEmployeeBatches(List<EmployeeBatch> employeeBatches) {
		this.employeeBatches = employeeBatches;
	}
	
	public void addEmployeeBatch(EmployeeBatch employeeBatch) {
		this.employeeBatches.add(employeeBatch);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associates == null) ? 0 : associates.hashCode());
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + ((batchLocation == null) ? 0 : batchLocation.hashCode());
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((batchType == null) ? 0 : batchType.hashCode());
		result = prime * result + ((currentWeek == null) ? 0 : currentWeek.hashCode());
		result = prime * result + ((employeeBatches == null) ? 0 : employeeBatches.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + goodGrade;
		result = prime * result + passingGrade;
		result = prime * result + ((skill == null) ? 0 : skill.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		if (associates == null) {
			if (other.associates != null)
				return false;
		} else if (!associates.equals(other.associates))
			return false;
		if (batchId == null) {
			if (other.batchId != null)
				return false;
		} else if (!batchId.equals(other.batchId))
			return false;
		if (batchLocation == null) {
			if (other.batchLocation != null)
				return false;
		} else if (!batchLocation.equals(other.batchLocation))
			return false;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
			return false;
		if (batchType == null) {
			if (other.batchType != null)
				return false;
		} else if (!batchType.equals(other.batchType))
			return false;
		if (currentWeek == null) {
			if (other.currentWeek != null)
				return false;
		} else if (!currentWeek.equals(other.currentWeek))
			return false;
		if (employeeBatches == null) {
			if (other.employeeBatches != null)
				return false;
		} else if (!employeeBatches.equals(other.employeeBatches))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (goodGrade != other.goodGrade)
			return false;
		if (passingGrade != other.passingGrade)
			return false;
		if (skill == null) {
			if (other.skill != null)
				return false;
		} else if (!skill.equals(other.skill))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", skill=" + skill + ", batchLocation=" + batchLocation + ", batchType=" + batchType
				+ ", goodGrade=" + goodGrade + ", passingGrade=" + passingGrade + ", currentWeek=" + currentWeek
				+ ", associates=" + associates + ", employeeBatches=" + employeeBatches + "]";
	}
	
}
