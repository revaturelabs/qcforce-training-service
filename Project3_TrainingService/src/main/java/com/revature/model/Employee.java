package com.revature.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * This is a model class to hold employee information.
 */
@Component
@Entity
@Table(name = "employee", schema = "qcforce_training")
public class Employee implements Serializable {

	/**
	 * Auto-generated serialVersionUID.
	 */
	private static final long serialVersionUID = 8708124273607132273L;

	/**
	 * int holding an employee's ID.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int employeeId;

	/**
	 * String holding an employee's email address.
	 */
	@Column(name = "email")
	private String email;

	/**
	 * String holding an employee's first name.
	 */
	@Column(name = "first_name")
	private String firstName;

	/**
	 * String holding an employee's last name.
	 */
	@Column(name = "last_name")
	private String lastName;

	/**
	 * ArrayList containing the {@link EmployeeBatch} objects for a given employee.
	 */
	@OneToMany(mappedBy = "employee")
	private List<EmployeeBatch> employeeBatches = new ArrayList<EmployeeBatch>();

	/**
	 * Default constructor method for {@code Employee} objects.
	 */
	public Employee() {
		super();
	}

	/**
	 * Getter method for retrieving an employee's ID.
	 * 
	 * @return an int representing an employee's ID
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * Setter method for setting an employee's ID.
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Getter method for retrieving an employee's email address.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for setting an employee's email address.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method for retrieving an employee's first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method for setting an employee's first name.
	 */
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	/**
	 * Getter method for retrieving an employee's last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for setting an employee's last name.
	 */
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	/**
	 * Getter method for retrieving an employee's list of related
	 * {@code EmployeeBatch} entities.
	 */
	@JsonIgnore
	public List<EmployeeBatch> getEmployeeBatches() {
		return employeeBatches;
	}

	/**
	 * Setter method for setting an employee's list of related {@code EmployeeBatch}
	 * entities.
	 * 
	 * @param employeeBatches a list of {@link EmployeeBatch} objects
	 */
	@JsonIgnore
	public void setEmployeeBatches(List<EmployeeBatch> employeeBatches) {
		this.employeeBatches = employeeBatches;
	}

	/**
	 * Method for creating a hash for an employee.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((employeeBatches == null) ? 0 : employeeBatches.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/**
	 * Method for comparing two employees.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeBatches == null) {
			if (other.employeeBatches != null)
				return false;
		} else if (!employeeBatches.equals(other.employeeBatches))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	/**
	 * Method for representing an instance of the {@code Employee} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", employeeBatches=" + employeeBatches + "]";
	}

}
