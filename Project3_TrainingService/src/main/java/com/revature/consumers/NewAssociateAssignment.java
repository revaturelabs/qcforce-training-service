package com.revature.consumers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This is a model class used to hold associate information, with reference to a
 * batch, when first pulled from the RabbitMQ message queue.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "trainingStatus", "associate", "startDate", "endDate", "active" })
public class NewAssociateAssignment {

	/**
	 * String holding an associate's training status.
	 */
	@JsonProperty("trainingStatus")
	private String trainingStatus;

	/**
	 * {@code NewAssociate} object that store's an associate's information that is
	 * unrelated to any specific batch.
	 */
	@JsonProperty("associate")
	private NewAssociate newAssociate;

	/**
	 * String holding an associate's start date.
	 */
	@JsonProperty("startDate")
	private String startDate;

	/**
	 * String holding an associate's end date.
	 */
	@JsonProperty("endDate")
	private String endDate;

	/**
	 * Boolean holding an associate's "active" status.
	 */
	@JsonProperty("active")
	private boolean active;

	/**
	 * Getter method for retrieving an associate's training status.
	 */
	@JsonProperty("trainingStatus")
	public String getTrainingStatus() {
		return trainingStatus;
	}

	/**
	 * Setter method for setting an associate's training status.
	 */
	@JsonProperty("trainingStatus")
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	/**
	 * Getter method for retrieving a {@code NewAssociate} object with the
	 * associate's information.
	 */
	@JsonProperty("associate")
	public NewAssociate getNewAssociate() {
		return newAssociate;
	}

	/**
	 * Setter method for assigning a {@code NewAssociate} object to an instance of
	 * {@code NewAssociateAssignment}.
	 */
	@JsonProperty("associate")
	public void setNewAssociate(NewAssociate newAssociate) {
		this.newAssociate = newAssociate;
	}

	/**
	 * Getter method for retrieving an associate's start date.
	 */
	@JsonProperty("startDate")
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Setter method for setting an associate's start date.
	 */
	@JsonProperty("startDate")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Getter method for retrieving an associate's end date.
	 */
	@JsonProperty("endDate")
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Setter method for setting an associate's end date.
	 */
	@JsonProperty("endDate")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * Getter method for retrieving an associate's "active" status.
	 */
	@JsonProperty("active")
	public boolean isActive() {
		return active;
	}

	/**
	 * Setter method for setting an associate's "active" status.
	 */
	@JsonProperty("active")
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * Method for representing an instance of the {@code NewAssociateAssignment}
	 * class as a String.
	 */
	@Override
	public String toString() {
		return "NewAssociateAssignment [trainingStatus=" + trainingStatus + ", newAssociate=" + newAssociate
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", active=" + active + "]";
	}

}