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
@JsonPropertyOrder({ "email", "salesforceId", "firstName", "lastName", "flag" })
public class NewAssociate {
	/**
	 * variable of type {@link NewEmployee} that represents the employee in that will
	 * be assigned.
	 */
	@JsonProperty("email")
	private String email;
	/**
	 *	
	 */
	@JsonProperty("salesforceId")
	private String salesforceId;
	/**
	 *	
	 */
	@JsonProperty("firstName")
	private String firstName;
	/**
	 *	
	 */
	@JsonProperty("lastName")
	private String lastName;
	/**
	 *	
	 */
	@JsonProperty("flag")
	private String flag;
	/**
	 *	
	 */
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonProperty("salesforceId")
	public String getSalesforceId() {
		return salesforceId;
	}
	@JsonProperty("salesforceId")
	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}
	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}
	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}
	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonProperty("flag")
	public String getFlag() {
		return flag;
	}
	@JsonProperty("flag")
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "NewAssociate [email=" + email + ", salesforceId=" + salesforceId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", flag=" + flag + "]";
	}
	
}
