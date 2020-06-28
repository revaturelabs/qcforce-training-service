package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeBatchId {

	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "batch_id")
	private Batch batchId;
}
