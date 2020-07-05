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
@JsonPropertyOrder({ "trainingStatus", "associate", "startDate", "endDate", "active" })
public class NewAssociateAssignment {
	/**
	 * variable of type {@link String} that represents the employee's role.
	 */
	@JsonProperty("trainingStatus")
	private String trainingStatus;
	/**
	 * variable of type {@link NewEmployee} that represents the employee in that will
	 * be assigned.
	 */
	@JsonProperty("associate")
	private NewAssociate newAssociate;
	/**
	 *	
	 */
	@JsonProperty("startDate")
	private String startDate;
	/**
	 *	
	 */
	@JsonProperty("endDate")
	private String endDate;
	/**
	 *	
	 */
	@JsonProperty("active")
	private boolean active;
	/**
	 * additional properties for the class.
	 */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@JsonProperty("trainingStatus")
	public String getTrainingStatus() {
		return trainingStatus;
	}
	@JsonProperty("trainingStatus")
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	@JsonProperty("associate")
	public NewAssociate getNewAssociate() {
		return newAssociate;
	}
	@JsonProperty("associate")
	public void setNewAssociate(NewAssociate newAssociate) {
		this.newAssociate = newAssociate;
	}
	@JsonProperty("startDate")
	public String getStartDate() {
		return startDate;
	}
	@JsonProperty("startDate")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@JsonProperty("endDate")
	public String getEndDate() {
		return endDate;
	}
	@JsonProperty("endDate")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@JsonProperty("active")
	public boolean isActive() {
		return active;
	}
	@JsonProperty("active")
	public void setActive(boolean active) {
		this.active = active;
	}
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	@JsonAnySetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	@Override
	public String toString() {
		return "NewAssociateAssignment [trainingStatus=" + trainingStatus + ", newAssociate=" + newAssociate
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", active=" + active + ", additionalProperties="
				+ additionalProperties + "]";
	}


}