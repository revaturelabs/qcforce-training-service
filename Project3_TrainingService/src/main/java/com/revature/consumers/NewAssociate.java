package com.revature.consumers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This is a model class used to hold associate information when first pulled
 * from the RabbitMQ message queue.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "email", "salesforceId", "firstName", "lastName", "flag" })
public class NewAssociate {

	/**
	 * String holding an associate's email address.
	 */
	@JsonProperty("email")
	private String email;

	/**
	 * String holding an associate's salesforce ID.
	 */
	@JsonProperty("salesforceId")
	private String salesforceId;

	/**
	 * String holding an associate's first name.
	 */
	@JsonProperty("firstName")
	private String firstName;

	/**
	 * String holding an associate's last name.
	 */
	@JsonProperty("lastName")
	private String lastName;

	/**
	 * String holding an associate's flag attribute.
	 */
	@JsonProperty("flag")
	private String flag;

	/**
	 * Getter method for retrieving an associate's email address.
	 */
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for setting an associate's email address.
	 */
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method for retrieving an associate's salesforce ID.
	 */
	@JsonProperty("salesforceId")
	public String getSalesforceId() {
		return salesforceId;
	}

	/**
	 * Setter method for setting an associate's salesforce ID.
	 */
	@JsonProperty("salesforceId")
	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

	/**
	 * Getter method for retrieving an associate's first name.
	 */
	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method for setting an associate's first name.
	 */
	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method for retrieving an associate's last name.
	 */
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter method for setting an associate's last name.
	 */
	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter method for retrieving an associate's flag attribute.
	 */
	@JsonProperty("flag")
	public String getFlag() {
		return flag;
	}

	/**
	 * Setter method for setting an associate's flag attribute.
	 */
	@JsonProperty("flag")
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * Method for representing an instance of the {@code NewAssociate} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "NewAssociate [email=" + email + ", salesforceId=" + salesforceId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", flag=" + flag + "]";
	}

}
