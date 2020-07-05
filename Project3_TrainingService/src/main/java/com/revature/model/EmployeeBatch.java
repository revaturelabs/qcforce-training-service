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

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="employee_batch", schema="qcforce_training")
public class EmployeeBatch implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8272281938968388581L;

	@EmbeddedId
	private EmployeeBatchId employeeBatchId;
	
	@Column(name="employee_role")
	private String employeeRole;	
	
	@Column(name="deleted_at")
	private String deletedAt;
	
	@ManyToOne
	@MapsId("employeeId")
	private Employee employee; 
	
	@ManyToOne
	@MapsId("batchId")
	private Batch batch;

	public EmployeeBatch() {
		this.employeeBatchId = new EmployeeBatchId();
	}

	public EmployeeBatch(EmployeeBatchId employeeBatchId, String employeeRole, String deletedAt, Employee employee, Batch batch) {
		super();
		this.employeeBatchId = employeeBatchId;
		this.employeeRole = employeeRole;
		this.deletedAt = deletedAt;
		this.employee = employee;
		this.batch = batch;
	}

	public EmployeeBatchId getEmployeeBatchId() {
		return employeeBatchId;
	}

	public void setEmployeeBatchId(int employeeId, String batchId) {
		this.employeeBatchId = new EmployeeBatchId(employeeId, batchId);
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

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

	@Override
	public String toString() {
		return "EmployeeBatch [employeeBatchId=" + employeeBatchId + ", employeeRole=" + employeeRole + ", deletedAt="
				+ deletedAt + ", employee=" + employee + ", batch=" + batch + "]";
	}
	
}
