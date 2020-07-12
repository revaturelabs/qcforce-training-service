package com.revature.consumers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This is a model class used to hold batch information when first pulled from
 * the RabbitMQ message queue.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "batchId", "name", "startDate", "endDate", "skill", "location", "type", "goodGrade",
		"passingGrade", "employeeAssignments", "associateAssignments" })
public class NewBatch {

	/**
	 * Integer holding the ID variable used to identify the batch in the program
	 * these data are coming from (not used locally).
	 */
	@JsonProperty("id")
	private Integer id;

	/**
	 * String holding a batch's ID.
	 */
	@JsonProperty("batchId")
	private String batchId;

	/**
	 * String holding a batch's name.
	 */
	@JsonProperty("name")
	private String name;

	/**
	 * String holding a batch's start date.
	 */
	@JsonProperty("startDate")
	private String startDate;

	/**
	 * String holding a batch's end date.
	 */
	@JsonProperty("endDate")
	private String endDate;

	/**
	 * String holding the skill for a given batch.
	 */
	@JsonProperty("skill")
	private String skill;

	/**
	 * String holding the location for a given batch.
	 */
	@JsonProperty("location")
	private String location;

	/**
	 * String holding the type for a given batch.
	 */
	@JsonProperty("type")
	private String type;

	/**
	 * String holding the "good grade" variable for a given batch.
	 */
	@JsonProperty("goodGrade")
	private Integer goodGrade;

	/**
	 * String holding the "passing grade" variable for a given batch.
	 */
	@JsonProperty("passingGrade")
	private Integer passingGrade;

	/**
	 * List of {@code NewEmployeeAssignment} variables associated with a given
	 * batch.
	 */
	@JsonProperty("employeeAssignments")
	private List<NewEmployeeAssignment> newEmployeeAssignments = null;

	/**
	 * List of {@code NewAssociateAssignment} variables associated with a given
	 * batch.
	 */
	@JsonProperty("associateAssignments")
	private List<NewAssociateAssignment> newAssociateAssignments = null;

	/**
	 * Additional properties the class may have, stored in a {@code HashMap}.
	 */
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Getter method for retrieving a batch's "ID" property.
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * Setter method for setting a batch's "ID" property.
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter method for retrieving a batch's ID.
	 */
	@JsonProperty("batchId")
	public String getBatchId() {
		return batchId;
	}

	/**
	 * Setter method for setting a batch's ID.
	 */
	@JsonProperty("batchId")
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	/**
	 * Getter method for retrieving a batch's name.
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * Setter method for setting a batch's name.
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for retrieving a batch's start date.
	 */
	@JsonProperty("startDate")
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Setter method for setting a batch's start date.
	 */
	@JsonProperty("startDate")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Getter method for retrieving a batch's end date.
	 */
	@JsonProperty("endDate")
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Setter method for setting a batch's end date.
	 */
	@JsonProperty("endDate")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * Getter method for retrieving a batch's skill.
	 */
	@JsonProperty("skill")
	public String getSkill() {
		return skill;
	}

	/**
	 * Setter method for setting a batch's skill.
	 */
	@JsonProperty("skill")
	public void setSkill(String skill) {
		this.skill = skill;
	}

	/**
	 * Getter method for retrieving a batch's location.
	 */
	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	/**
	 * Setter method for setting a batch's location.
	 */
	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Getter method for retrieving a batch's type.
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 * Setter method for setting a batch's type.
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter method for retrieving a batch's "good grade".
	 */
	@JsonProperty("goodGrade")
	public Integer getGoodGrade() {
		return goodGrade;
	}

	/**
	 * Setter method for setting a batch's "good grade".
	 */
	@JsonProperty("goodGrade")
	public void setGoodGrade(Integer goodGrade) {
		this.goodGrade = goodGrade;
	}

	/**
	 * Getter method for retrieving a batch's "passing grade".
	 */
	@JsonProperty("passingGrade")
	public Integer getPassingGrade() {
		return passingGrade;
	}

	/**
	 * Setter method for setting a batch's "passing grade".
	 */
	@JsonProperty("passingGrade")
	public void setPassingGrade(Integer passingGrade) {
		this.passingGrade = passingGrade;
	}

	/**
	 * Getter method for retrieving a batch's list of related
	 * {@code NewEmployeeAssignment} entities.
	 */
	@JsonProperty("newEmployeeAssignments")
	public List<NewEmployeeAssignment> getNewEmployeeAssignments() {
		return newEmployeeAssignments;
	}

	/**
	 * Setter method for setting a batch's list of related
	 * {@code NewEmployeeAssignment} entities.
	 */
	@JsonProperty("newAssociateAssignments")
	public void setNewAssociateAssignments(List<NewAssociateAssignment> newAssociateAssignments) {
		this.newAssociateAssignments = newAssociateAssignments;
	}

	/**
	 * Getter method for retrieving a batch's list of related
	 * {@code NewAssociateAssignment} entities.
	 */
	@JsonProperty("newAssociateAssignments")
	public List<NewAssociateAssignment> getNewAssociateAssignments() {
		return newAssociateAssignments;
	}

	/**
	 * Setter method for setting a batch's list of related
	 * {@code NewAssociateAssignment} entities.
	 */
	@JsonProperty("newEmployeeAssignments")
	public void setNewEmployeeAssignments(List<NewEmployeeAssignment> newEmployeeAssignments) {
		this.newEmployeeAssignments = newEmployeeAssignments;
	}

	/**
	 * Getter method for retrieving a batch's additional properties.
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Setter method for setting a batch's additional properties, as key/value
	 * pairs.
	 */
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	/**
	 * Method for representing an instance of the {@code NewBatch} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "NewBatch [id=" + id + ", batchId=" + batchId + ", name=" + name + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", skill=" + skill + ", location=" + location + ", type=" + type
				+ ", goodGrade=" + goodGrade + ", passingGrade=" + passingGrade + ", newEmployeeAssignments="
				+ newEmployeeAssignments + ", newAssociateAssignments=" + newAssociateAssignments
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}