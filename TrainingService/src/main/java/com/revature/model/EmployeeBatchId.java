package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * This is a model class for creating the composite key for the
 * {@link EmployeeBatch} class.
 */
@Embeddable
public class EmployeeBatchId implements Serializable {

	/**
	 * Auto-generated serialVersionUID.
	 */
	private static final long serialVersionUID = 8516230717933664145L;

	/**
	 * int containing the ID of an {@link Employee}.
	 */
	@Column(name = "employee_id")
	private int employeeId;

	/**
	 * int containing the ID of a {@link Batch}.
	 */
	@Column(name = "batch_id")
	private String batchId;

	/**
	 * Default constructor for an {@code EmployeeBatchId}.
	 */
	public EmployeeBatchId() {
		super();
	}

	/**
	 * Multiple parameter constructor for an EmployeeBatchId
	 * 
	 * @param employeeId int containing the ID of an {@link Employee}
	 * @param batchId    int containing the ID of a {@link Batch}
	 */
	public EmployeeBatchId(int employeeId, String batchId) {
		this.employeeId = employeeId;
		this.batchId = batchId;
	}

	/**
	 * Method for creating a hash for an {@code EmployeeBatchId}.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + employeeId;
		return result;
	}

	/**
	 * Method for comparing two {@code EmployeeBatchId} objects.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBatchId other = (EmployeeBatchId) obj;
		if (batchId == null) {
			if (other.batchId != null)
				return false;
		} else if (!batchId.equals(other.batchId))
			return false;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

	/**
	 * Method for representing an instance of the {@code EmployeeBatchId} class as a
	 * String.
	 */
	@Override
	public String toString() {
		return "EmployeeBatchId [employeeId=" + employeeId + ", batchId=" + batchId + "]";
	}

}
