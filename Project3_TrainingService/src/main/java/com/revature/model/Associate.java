package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	@Column(name="associate_name")
	private String associateName;
	
	@Column(name="associate_email")
	private String associateEmail;

	//private String batchName;
	
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Associate(int associateId, String associateName, String associateEmail) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.associateEmail = associateEmail;
		
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getAssociateEmail() {
		return associateEmail;
	}

	public void setAssociateEmail(String associateEmail) {
		this.associateEmail = associateEmail;
	}
	
	
	
	
	
	
}
