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
@Table(name="qcforce_training.associate")
public class Associate implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="associate_id")
	private int associateId; //primary key
	
	@Column(name="training_status")
	private String trainingStatus;
	
	@Column(name="flag")
	private int flag; //????
	
	@Column(name="salesforce_id")
	private String salesforceId;
	
	@Column(name="associate_first_name")
	private String associateFirstName;
	
	@Column(name="associate_last_name")
	private String associateLastName;
	
	@Column(name="active")
	private boolean active;

	@Column(name="associate_start_date")
	private Date associateStartDate;
	
	@Column(name="associate_end_date")
	private Date associateEndDate;

	@OneToOne
	private String batchName; //FK (figure out which batch id from batch table will be the foreign key)
	
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getSalesforceId() {
		return salesforceId;
	}

	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

	public String getAssociateFirstName() {
		return associateFirstName;
	}

	public void setAssociateFirstName(String associateFirstName) {
		this.associateFirstName = associateFirstName;
	}

	public String getAssociateLastName() {
		return associateLastName;
	}

	public void setAssociateLastName(String associateLastName) {
		this.associateLastName = associateLastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getAssociateStartDate() {
		return associateStartDate;
	}

	public void setAssociateStartDate(Date associateStartDate) {
		this.associateStartDate = associateStartDate;
	}

	public Date getAssociateEndDate() {
		return associateEndDate;
	}

	public void setAssociateEndDate(Date associateEndDate) {
		this.associateEndDate = associateEndDate;
	}

	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", trainingStatus=" + trainingStatus + ", flag=" + flag
				+ ", salesforceId=" + salesforceId + ", associateFirstName=" + associateFirstName
				+ ", associateLastName=" + associateLastName + ", active=" + active + ", associateStartDate="
				+ associateStartDate + ", associateEndDate=" + associateEndDate + ", batchName=" + batchName + "]";
	}
	
}
