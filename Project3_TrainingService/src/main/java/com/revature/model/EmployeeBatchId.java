package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeBatchId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8516230717933664145L;

	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "batch_id")
	private Batch batchId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchId == null) ? 0 : batchId.hashCode());
		result = prime * result + employeeId;
		return result;
	}

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

	@Override
	public String toString() {
		return "EmployeeBatchId [employeeId=" + employeeId + ", batchId=" + batchId + "]";
	}
	
	
}
