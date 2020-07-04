package com.revature.model;

import java.io.Serializable;
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
@Table(name="employee", schema="qcforce_training")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8708124273607132273L;

	@Id
	@Column(name="id")
	private int employeeId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@OneToMany(mappedBy="employee")
	private List<EmployeeBatch> employeeBatches = new ArrayList<EmployeeBatch>();
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	@JsonIgnore
	public List<EmployeeBatch> getEmployeeBatches() {
		return employeeBatches;
	}

	@JsonIgnore
	public void setEmployeeBatches(List<EmployeeBatch> employeeBatches) {
		this.employeeBatches = employeeBatches;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", employeeBatches=" + employeeBatches + "]";
	}

}
