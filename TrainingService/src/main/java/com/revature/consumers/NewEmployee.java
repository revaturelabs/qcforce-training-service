package com.revature.consumers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This is a model class used to hold employee information when first pulled
 * from the RabbitMQ message queue.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "email", "firstName", "lastName" })
public class NewEmployee {

	/**
	 * String holding an employee's email address.
	 */
	@JsonProperty("email")
	private String email;

	/**
	 * String holding an employee's first name.
	 */
	@JsonProperty("firstName")
	private String firstName;

	/**
	 * String holding an employee's last name.
	 */
	@JsonProperty("lastName")
	private String lastName;

	/**
	 * Getter method for retrieving an employee's email address.
	 */
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for setting an employee's email address.
	 */
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method for retrieving an employee's first name.
	 */
	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method for setting an employee's first name.
	 */
	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method for retrieving an employee's last name.
	 */
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for setting an employee's last name.
	 */
	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Method for representing an instance of the {@code NewEmployee} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "Employee [getEmail()=" + getEmail() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}

}