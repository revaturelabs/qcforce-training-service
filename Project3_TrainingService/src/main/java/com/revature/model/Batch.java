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

/**
 * This is a model class to hold batch information.
 */
@Component
@Entity
@Table(name = "batch", schema = "qcforce_training")
public class Batch implements Serializable {

	/**
	 * Auto-generated serialVersionUID.
	 */
	private static final long serialVersionUID = -2748183932280317936L;

	/**
	 * String holding a batch's ID.
	 */
	@Id
	@Column(name = "id")
	private String batchId;

	/**
	 * String holding a batch's name.
	 */
	@Column(name = "batch_name")
	private String batchName;

	/**
	 * String holding a batch's start date.
	 */
	@Column(name = "start_date")
	private Date startDate;

	/**
	 * String holding a batch's end date.
	 */
	@Column(name = "end_date")
	private Date endDate;

	/**
	 * String holding the skill for a given batch.
	 */
	@Column(name = "skill")
	private String skill;

	/**
	 * String holding the location for a given batch.
	 */
	@Column(name = "batch_location")
	private String batchLocation;

	/**
	 * String holding the type for a given batch.
	 */
	@Column(name = "batch_type")
	private String batchType;

	/**
	 * String holding the "good grade" variable for a given batch.
	 */
	@Column(name = "good_grade")
	private int goodGrade;

	/**
	 * String holding the "passing grade" variable for a given batch.
	 */
	@Column(name = "passing_grade")
	private int passingGrade;

	/**
	 * String holding the "current week" variable for a given batch.
	 */
	@Column(name = "current_week")
	private String currentWeek;

	/**
	 * ArrayList containing the {@link Associate} objects for a given batch.
	 */
	@OneToMany(mappedBy = "batch")
	private List<Associate> associates = new ArrayList<Associate>();

	/**
	 * ArrayList containing the {@link EmployeeBatch} objects for a given batch.
	 */
	@OneToMany(mappedBy = "batch")
	private List<EmployeeBatch> employeeBatches = new ArrayList<EmployeeBatch>();

	/**
	 * Default constructor method for a {@code Batch}.
	 */
	public Batch() {
		super();
	}

	/**
	 * Getter method for retrieving a batch's ID.
	 */
	public String getBatchId() {
		return batchId;
	}

	/**
	 * Setter method for setting a batch's ID.
	 * 
	 * @param batchId is id of a batch
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	/**
	 * Getter method for retrieving a batch's name.
	 */
	public String getBatchName() {
		return batchName;
	}

	/**
	 * Setter method for setting a batch's name.
	 * 
	 * @param batchName name of the batch
	 */
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	/**
	 * Getter method for retrieving a batch's start date.
	 * 
	 * @return an object of type {@link Date}
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Setter method for setting a batch's start date.
	 * 
	 * @param startDate an object of type {@link Date}
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Getter method for retrieving a batch's end date.
	 * 
	 * @return an object of type {@link Date}
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Setter method for setting a batch's end date.
	 * 
	 * @param endDate an object of type {@link Date}
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Getter method for retrieving a batch's skill.
	 * 
	 * @return a String representing a skill
	 */
	public String getSkill() {
		return skill;
	}

	/**
	 * Setter method for setting a batch's skill.
	 * 
	 * @param skill a String representing a skill
	 */
	public void setSkill(String skill) {
		this.skill = skill;
	}

	/**
	 * Getter method for retrieving a batch's location.
	 * 
	 * @return a String representing the location of a {@code Batch}
	 */
	public String getBatchLocation() {
		return batchLocation;
	}

	/**
	 * Setter method for setting a batch's location.
	 * 
	 * @param batchLocation a String representing the location of a {@code Batch}
	 */
	public void setBatchLocation(String batchLocation) {
		this.batchLocation = batchLocation;
	}

	/**
	 * Getter method for retrieving a batch's type.
	 * 
	 * @return a String representing a type of {@code Batch}
	 */
	public String getBatchType() {
		return batchType;
	}

	/**
	 * Setter method for setting a batch's type.
	 * 
	 * @param batchType a String representing a type of {@code Batch}
	 */
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	/**
	 * Getter method for retrieving a batch's "good grade".
	 * 
	 * @return an int value representing a good grade
	 */
	public int getGoodGrade() {
		return goodGrade;
	}

	/**
	 * Setter method for setting a batch's "good grade".
	 * 
	 * @param goodGrade an int representing the good grade for a {@code Batch}
	 */
	public void setGoodGrade(int goodGrade) {
		this.goodGrade = goodGrade;
	}

	/**
	 * Getter method for retrieving a batch's "passing grade".
	 * 
	 * @return an int representing the passing grade for a {@code Batch}
	 */
	public int getPassingGrade() {
		return passingGrade;
	}

	/**
	 * Setter method for setting a batch's "passing grade".
	 * 
	 * @param passingGrade the passing grade for a {@code Batch}
	 */
	public void setPassingGrade(int passingGrade) {
		this.passingGrade = passingGrade;
	}

	/**
	 * Getter method for retrieving a batch's "current week".
	 * 
	 * @return String representing the current week
	 */
	public String getCurrentWeek() {
		return currentWeek;
	}

	/**
	 * Setter method for setting a batch's "current week".
	 * 
	 * @param currentWeek the current week of a {@code Batch}
	 */
	public void setCurrentWeek(String currentWeek) {
		this.currentWeek = currentWeek;
	}

	/**
	 * Getter method for retrieving a batch's list of related {@code Associate}
	 * entities.
	 */
	public List<Associate> getAssociates() {
		return associates;
	}

	/**
	 * Setter method for setting a batch's list of related {@code Associate}
	 * entities.
	 * 
	 * @param associates a list of {@link Associate} objects
	 */
	public void setAssociates(List<Associate> associates) {
		this.associates = associates;
	}

	/**
	 * Method for adding an {@link Associate} to a batch's list of related
	 * {@code Associate} entities.
	 * 
	 * @param associate an {@link Associate}
	 */
	public void addAssociate(Associate associate) {
		this.associates.add(associate);
	}

	/**
	 * Getter method for retrieving a batch's list of related {@code EmployeeBatch}
	 * entities.
	 * 
	 * @return a list of {@link EmployeeBatch} objects
	 */
	@JsonIgnore
	public List<EmployeeBatch> getEmployeeBatches() {
		return employeeBatches;
	}

	/**
	 * Setter method for setting a batch's list of related {@code EmployeeBatch}
	 * entities.
	 * 
	 * @param employeeBatches a list of {@link EmployeeBatch} objects associated
	 *                        with a given {@code Batch}
	 */
	@JsonIgnore
	public void setEmployeeBatches(List<EmployeeBatch> employeeBatches) {
		this.employeeBatches = employeeBatches;
	}

	/**
	 * Method for adding an {@link EmployeeBatch} to a batch's list of related
	 * 
	 * @param employeeBatch a list of {@link EmployeeBatch} objects associated with
	 *                      a given {@code Batch}
	 */
	public void addEmployeeBatch(EmployeeBatch employeeBatch) {
		this.employeeBatches.add(employeeBatch);
	}

	/**
	 * Method for creating a hash for a batch.
	 */
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

	/**
	 * Method for comparing two batches.
	 */
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

	/**
	 * Method for representing an instance of the {@code Batch} class as a String.
	 */
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", skill=" + skill + ", batchLocation=" + batchLocation + ", batchType=" + batchType
				+ ", goodGrade=" + goodGrade + ", passingGrade=" + passingGrade + ", currentWeek=" + currentWeek
				+ ", associates=" + associates + ", employeeBatches=" + employeeBatches + "]";
	}

}
