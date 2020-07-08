package com.revature.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * This is a model class to hold employee information specific to a particular
 * batch.
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "employee_batch", schema = "qcforce_training")
public class EmployeeBatch implements Serializable {

	/**
	 * Auto-generated serialVersionUID.
	 */
	private static final long serialVersionUID = 8272281938968388581L;

	/**
	 * Composite key for an {@code EmployeeBatch} object, derived from an
	 * {@link Employee} instance's ID and a {@link Batch} instance's ID.
	 */
	@EmbeddedId
	private EmployeeBatchId employeeBatchId;

	/**
	 * String holding a designated employee's role in a designated batch.
	 */
	@Column(name = "employee_role")
	private String employeeRole;

	/**
	 * String holding the "deleted at" value of a designated employee in a
	 * designated batch.
	 */
	@Column(name = "deleted_at")
	private String deletedAt;

	/**
	 * An instance of the {@link Employee} class.
	 */
	@ManyToOne
	@MapsId("employeeId")
	private Employee employee;

	/**
	 * An instance of the {@link Batch} class.
	 */
	@ManyToOne
	@MapsId("batchId")
	private Batch batch;

	/**
	 * Default constructor for an {@code EmployeeBatch}.
	 */
	public EmployeeBatch() {
		this.employeeBatchId = new EmployeeBatchId();
	}

	/**
	 * Multiple parameter constructor for an {@code EmployeeBatch}.
	 * 
	 * @param employeeBatchId an ID generated when a new {@code EmployeeBatch} is
	 *                        added to the database
	 * @param employeeRole    String holding a designated employee's role in a
	 *                        designated batch
	 * @param deletedAt       String holding the "deleted at" value of a designated
	 *                        employee in a designated batch
	 * @param employee        An instance of the {@link Employee} class
	 * @param batch           An instance of the {@link Batch} class
	 */
	public EmployeeBatch(EmployeeBatchId employeeBatchId, String employeeRole, String deletedAt, Employee employee,
			Batch batch) {
		super();
		this.employeeBatchId = employeeBatchId;
		this.employeeRole = employeeRole;
		this.deletedAt = deletedAt;
		this.employee = employee;
		this.batch = batch;
	}

	/**
	 * Getter method for retrieving an {@code EmployeeBatch} ID.
	 * 
	 * @return an {@link EmployeeBatchId}, a composite class and unique identifier
	 *         for {@code EmployeeBatch} instances
	 */
	public EmployeeBatchId getEmployeeBatchId() {
		return employeeBatchId;
	}

	/**
	 * Setter method for setting an {@code EmployeeBatch} ID.
	 * 
	 * @param employeeId an int representing the ID of an {@link Employee}
	 * @param batchId    a String representing the ID of a {@link Batch}
	 */
	public void setEmployeeBatchId(int employeeId, String batchId) {
		this.employeeBatchId = new EmployeeBatchId(employeeId, batchId);
	}

	/**
	 * Getter method for retrieving an employee's role.
	 * 
	 * @return a String representing an employee's role for a given {@link Batch}
	 */
	public String getEmployeeRole() {
		return employeeRole;
	}

	/**
	 * Setter method for setting an employee's role.
	 * 
	 * @param employeeRole a String representing an employee's role for a given
	 *                     {@link Batch}
	 */
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	/**
	 * Getter method for retrieving an employee's "deleted at" property.
	 */
	public String getDeletedAt() {
		return deletedAt;
	}

	/**
	 * Setter method for setting an employee's "deleted at" property.
	 */
	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

	/**
	 * Getter method for retrieving an {@link Employee} object with the employee's
	 * information.
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * Setter method for assigning an {@link Employee} object to an instance of
	 * {@link EmployeeBatch}.
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * Getter method for retrieving a {@link Batch} object with the batch's
	 * information.
	 * 
	 * @return an object of type {@code Batch}
	 */
	public Batch getBatch() {
		return batch;
	}

	/**
	 * Setter method for assigning a {@link Batch} object to an instance of
	 * {@link EmployeeBatch}.
	 * 
	 * @param batch an object of type {@code Batch}
	 */
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	/**
	 * Method for creating a hash for an {@code EmployeeBatch}.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batch == null) ? 0 : batch.hashCode());
		result = prime * result + ((deletedAt == null) ? 0 : deletedAt.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((employeeBatchId == null) ? 0 : employeeBatchId.hashCode());
		result = prime * result + ((employeeRole == null) ? 0 : employeeRole.hashCode());
		return result;
	}

	/**
	 * Method for comparing two {@code EmployeeBatch} objects.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBatch other = (EmployeeBatch) obj;
		if (batch == null) {
			if (other.batch != null)
				return false;
		} else if (!batch.equals(other.batch))
			return false;
		if (deletedAt == null) {
			if (other.deletedAt != null)
				return false;
		} else if (!deletedAt.equals(other.deletedAt))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (employeeBatchId == null) {
			if (other.employeeBatchId != null)
				return false;
		} else if (!employeeBatchId.equals(other.employeeBatchId))
			return false;
		if (employeeRole == null) {
			if (other.employeeRole != null)
				return false;
		} else if (!employeeRole.equals(other.employeeRole))
			return false;
		return true;
	}

	/**
	 * Method for representing an instance of the {@code EmployeeBatch} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "EmployeeBatch [employeeBatchId=" + employeeBatchId + ", employeeRole=" + employeeRole + ", deletedAt="
				+ deletedAt + ", employee=" + employee + ", batch=" + batch + "]";
	}

}
