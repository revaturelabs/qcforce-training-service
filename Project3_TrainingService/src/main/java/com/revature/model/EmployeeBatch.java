package com.revature.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="qcforce_training.employee_batch")
public class EmployeeBatch{
	
	@EmbeddedId
	private EmployeeBatchId id; //COMPOSITE KEY FOR EMPLOYEE ID AND BATCH NAME
	
	@Column(name="employee_role")
	private String employeeRole;	
	
	@Column(name="deleted_at")
	private Date deletedAt;
	
	@JsonBackReference
	@ManyToOne
	@MapsId("employeeId")
	private Employee employee; 
	
	@ManyToOne
	@MapsId("batchName")
	private Batch batch;

	public EmployeeBatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBatch(EmployeeBatchId id, String employeeRole, Date deletedAt, Employee employee, Batch batch) {
		super();
		this.id = id;
		this.employeeRole = employeeRole;
		this.deletedAt = deletedAt;
		this.employee = employee;
		this.batch = batch;
	}

	public EmployeeBatchId getId() {
		return id;
	}

	public void setId(EmployeeBatchId id) {
		this.id = id;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	
	

	
}
