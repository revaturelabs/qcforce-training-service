package com.revature.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * This is a model class to hold associate information.
 */
@Component
@Entity
@Table(name = "associate", schema = "qcforce_training")
public class Associate implements Serializable {

	/**
	 * Auto-generated serialVersionUID.
	 */
	private static final long serialVersionUID = -2631606611425902697L;

	/**
	 * int holding an associate's ID.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int associateId;

	/**
	 * String holding an associate's training status.
	 */
	@Column(name = "training_status")
	private String trainingStatus;

	/**
	 * String holding an associate's email address.
	 */
	@Column(name = "email")
	private String email;

	/**
	 * String holding an associate's salesforce ID.
	 */
	@Column(name = "salesforce_id")
	private String salesforceId;

	/**
	 * String holding an associate's first name.
	 */
	@Column(name = "first_name")
	private String firstName;

	/**
	 * String holding an associate's last name.
	 */
	@Column(name = "last_name")
	private String lastName;

	/**
	 * String holding an associate's flag.
	 */
	@Column(name = "flag")
	private String flag;

	/**
	 * {@code Date} object holding an associate's start date.
	 */
	@Column(name = "start_date")
	private Date startDate;

	/**
	 * {@code Date} object holding an associate's end date.
	 */
	@Column(name = "end_date")
	private Date endDate;

	/**
	 * boolean holding an associate's "active" status.
	 */
	@Column(name = "active")
	private boolean active;

	/**
	 * {@link Batch} that a given {@code Associate} object is in.
	 */
	@ManyToOne
	private Batch batch;

	/**
	 * Default constructor method for {@code Associate} objects.
	 */
	public Associate() {
		super();
	}

	/**
	 * Getter method for retrieving an associate's ID.
	 * 
	 * @return associate id
	 */
	public int getAssociateId() {
		return associateId;
	}

	/**
	 * Setter method for setting an associate's ID.
	 */
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	/**
	 * Getter method for retrieving an associate's training status.
	 * 
	 * @return training status of associate
	 */
	public String getTrainingStatus() {
		return trainingStatus;
	}

	/**
	 * Setter method for setting an associate's training status.
	 * 
	 * @param trainingStatus is status of the training
	 */
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	/**
	 * Getter method for retrieving an associate's email address.
	 * 
	 * @return an email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets an email
	 * 
	 * @param email is email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method for retrieving an associate's salesforce ID.
	 */
	public String getSalesforceId() {
		return salesforceId;
	}

	/**
	 * Setter method for setting an associate's salesforce ID.
	 * 
	 * @param salesforceId is salesforce id of associate
	 */
	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

	/**
	 * Getter method for retrieving an associate's first name.
	 * 
	 * @return first name of the associate
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method for setting an associate's first name.
	 * 
	 * @param firstName is first name of the associate
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method for retrieving an associate's last name.
	 * 
	 * @return last name of the associate
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for setting an associate's last name.
	 * 
	 * @param lastName is last name of associate
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter method for retrieving an associate's flag attribute.
	 * 
	 * @return a flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * Setter method for setting an associate's flag attribute.
	 * 
	 * @param flag is a flag
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * Getter method for retrieving an associate's start date.
	 * 
	 * @return a start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Setter method for setting an associate's start date
	 * 
	 * @param startDate is the start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Getter method for retrieving an associate's end date.
	 * 
	 * @return an end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Setter method for setting an associate's end date.
	 * 
	 * @param endDate is end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Getter method for retrieving an associate's "active" status
	 * 
	 * @return active for an active batch
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Setter method for setting an associate's "active" status.
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * Getter method for retrieving an associate's {@link Batch}.
	 * 
	 * @return batch
	 */
	@JsonIgnore
	public Batch getBatch() {
		return batch;
	}

	/**
	 * Setter method for setting an associate's {@link Batch}.
	 * 
	 * @param batch is batch
	 */
	@JsonIgnore
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	/**
	 * Method for creating a hash for an associate.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + associateId;
		result = prime * result + ((batch == null) ? 0 : batch.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((salesforceId == null) ? 0 : salesforceId.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((trainingStatus == null) ? 0 : trainingStatus.hashCode());
		return result;
	}

	/**
	 * Method for comparing two associates.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associate other = (Associate) obj;
		if (active != other.active)
			return false;
		if (associateId != other.associateId)
			return false;
		if (batch == null) {
			if (other.batch != null)
				return false;
		} else if (!batch.equals(other.batch))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (salesforceId == null) {
			if (other.salesforceId != null)
				return false;
		} else if (!salesforceId.equals(other.salesforceId))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (trainingStatus == null) {
			if (other.trainingStatus != null)
				return false;
		} else if (!trainingStatus.equals(other.trainingStatus))
			return false;
		return true;
	}

	/**
	 * Method for representing an instance of the {@code Associate} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", trainingStatus=" + trainingStatus + ", email=" + email
				+ ", salesforceId=" + salesforceId + ", firstName=" + firstName + ", lastName=" + lastName + ", flag="
				+ flag + ", startDate=" + startDate + ", endDate=" + endDate + ", active=" + active + ", batch=" + batch
				+ "]";
	}

}
