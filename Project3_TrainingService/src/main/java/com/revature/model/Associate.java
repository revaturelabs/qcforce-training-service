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

@Component
@Entity
@Table(name="associate", schema="qcforce_training")
public class Associate implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2631606611425902697L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int associateId;
	
	@Column(name="training_status")
	private String trainingStatus;
	
	@Column(name="email")
	private String email;

	@Column(name="salesforce_id")
	private String salesforceId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="flag")
	private String flag;

	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;

	@Column(name="active")
	private boolean active;

	@ManyToOne
	private Batch batch;
	
	public Associate() {
		super();
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalesforceId() {
		return salesforceId;
	}

	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@JsonIgnore
	public Batch getBatch() {
		return batch;
	}

	@JsonIgnore
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

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

	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", trainingStatus=" + trainingStatus + ", email=" + email
				+ ", salesforceId=" + salesforceId + ", firstName=" + firstName + ", lastName=" + lastName + ", flag="
				+ flag + ", startDate=" + startDate + ", endDate=" + endDate + ", active=" + active + ", batch="
				+ batch + "]";
	}
	
}
