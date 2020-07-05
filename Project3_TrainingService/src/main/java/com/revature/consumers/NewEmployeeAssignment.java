package com.revature.consumers;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This class represents the information for an Employee.
 * 
 * @author Wei Wu, Andres Mateo Toledo Albarracin, Jose Canela
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "role", "employee", "deletedAt" })
public class NewEmployeeAssignment {
	/**
	 * variable of type {@link String} that represents the employee's role.
	 */
	@JsonProperty("role")
	private String role;
	/**
	 * variable of type {@link NewEmployee} that represents the employee in that will
	 * be assigned.
	 */
	@JsonProperty("employee")
	private NewEmployee newEmployee;
	/**
	 *	
	 */
	@JsonProperty("deletedAt")
	private Object deletedAt;
	/**
	 * additional properties for the class.
	 */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Gets assignment role.
	 * 
	 * @return role.
	 */
	@JsonProperty("role")
	public String getRole() {
		return role;
	}

	/**
	 * Sets assignment role.
	 * 
	 * @param role new role.
	 */
	@JsonProperty("role")
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Gets assignment employee.
	 * 
	 * @return assignment employee.
	 */
	@JsonProperty("newEmployee")
	public NewEmployee getNewEmployee() {
		return newEmployee;
	}

	/**
	 * Sets assignment employee.
	 * 
	 * @param employee assignment employee.
	 */
	@JsonProperty("newEmployee")
	public void setNewEmployee(NewEmployee newEmployee) {
		this.newEmployee = newEmployee;
	}

	/**
	 * Unimplemented deleteAt variable
	 * 
	 * @return not implemented
	 */
	@JsonProperty("deletedAt")
	public Object getDeletedAt() {
		return deletedAt;
	}

	/**
	 * Unimplemented deleteAt variable
	 * 
	 * @param deletedAt not implemented
	 */
	@JsonProperty("deletedAt")
	public void setDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
	}

	/**
	 * Gets additional properties for an EmployeeAssignment.
	 * 
	 * @return a map of additional properties.
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Sets additional properties for an EmployeeAssignment.
	 * 
	 * @param name  property name.
	 * @param value property value.
	 */
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "EmployeeAssignment [getRole()=" + getRole() + ", getNewEmployee()=" + getNewEmployee() + ", getDeletedAt()="
				+ getDeletedAt() + ", getAdditionalProperties()=" + getAdditionalProperties() + "]";
	}

}