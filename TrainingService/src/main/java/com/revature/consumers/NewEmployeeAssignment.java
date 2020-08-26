package com.revature.consumers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This is a model class used to hold employee information, with reference to a
 * batch, when first pulled from the RabbitMQ message queue.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "role", "employee", "deletedAt" })
public class NewEmployeeAssignment {

	/**
	 * String holding an employee's role.
	 */
	@JsonProperty("role")
	private String role;

	/**
	 * {@code NewEmployee} object that store's an employee's information that is
	 * unrelated to any specific batch.
	 */
	@JsonProperty("employee")
	private NewEmployee newEmployee;

	/**
	 * Object holding an employee's "deleted at" property.
	 */
	@JsonProperty("deletedAt")
	private Object deletedAt;

	/**
	 * Getter method for retrieving an employee's role.
	 */
	@JsonProperty("role")
	public String getRole() {
		return role;
	}

	/**
	 * Setter method for setting an employee's role.
	 */
	@JsonProperty("role")
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Getter method for retrieving a {@link NewEmployee} object with the employee's
	 * information.
	 */
	@JsonProperty("newEmployee")
	public NewEmployee getNewEmployee() {
		return newEmployee;
	}

	/**
	 * Setter method for assigning a {@link NewEmployee} object to an instance of
	 * {@link NewEmployeeAssignment}.
	 */
	@JsonProperty("newEmployee")
	public void setNewEmployee(NewEmployee newEmployee) {
		this.newEmployee = newEmployee;
	}

	/**
	 * Getter method for retrieving an employee's "deleted at" property.
	 */
	@JsonProperty("deletedAt")
	public Object getDeletedAt() {
		return deletedAt;
	}

	/**
	 * Setter method for setting an employee's "deleted at" property.
	 */
	@JsonProperty("deletedAt")
	public void setDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
	}

	/**
	 * Method for representing an instance of the {@code NewEmployeeAssignment}
	 * class as a String.
	 */
	@Override
	public String toString() {
		return "EmployeeAssignment [getRole()=" + getRole() + ", getNewEmployee()=" + getNewEmployee()
				+ ", getDeletedAt()=" + getDeletedAt() + "]";
	}

}