package com.revature.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.consumers.NewAssociateAssignment;
import com.revature.consumers.NewBatch;
import com.revature.consumers.NewEmployeeAssignment;
import com.revature.model.Associate;
import com.revature.model.Batch;
import com.revature.model.Employee;
import com.revature.model.EmployeeBatch;
import com.revature.service.AssociateService;
import com.revature.service.BatchService;
import com.revature.service.EmployeeBatchService;
import com.revature.service.EmployeeService;

/**
 * Receives batch data from a RabbitMQ message queue.
 */
@Service
@Transactional
public class MsgReceiver {

	/**
	 * Declaration of an AssociateService
	 */
	private AssociateService associateService;

	/**
	 * Declaration of a BatchService
	 */
	private BatchService batchService;

	/**
	 * Declaration of an EmployeeService
	 */
	private EmployeeService employeeService;

	/**
	 * Declaration of an EmployeeBatchService
	 */
	private EmployeeBatchService employeeBatchService;

	/**
	 * Instantiation of associateService
	 * 
	 * @param associateService an object of type {@code AssociateService}
	 */
	@Autowired
	public void setAssociateService(AssociateService associateService) {
		this.associateService = associateService;
	}

	/**
	 * Instantiation of batchService
	 * 
	 * @param batchService an object of type {@code BatchService}
	 */
	@Autowired
	public void setBatchService(BatchService batchService) {
		this.batchService = batchService;
	}

	/**
	 * Instantiation of employeeService
	 */
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * Instantiation of employeeBatchService
	 */
	@Autowired
	public void setEmployeeBatchService(EmployeeBatchService employeeBatchService) {
		this.employeeBatchService = employeeBatchService;
	}

	/**
	 * Receives data from RabbitMQ messaging queue, and stores the data in an
	 * instance of {@link NewBatch}. This data is extracted and stored into
	 * {@link Associate}, {@link Batch}, {@link Employee}, and {@link EmployeeBatch}
	 * instances, which are then persisted into the database.
	 * 
	 * @param newBatch
	 */
	@RabbitListener(queues = "BatchData-Queue")
	public void recievedMessage(NewBatch newBatch) {
		// System.out.println("Recieved Message: "+ newBatch.toString());
		Batch batch = new Batch();
		batch.setBatchId(newBatch.getBatchId());
		batch.setBatchName(newBatch.getName());
		Date batchStartDate = new Date();
		try {
			batchStartDate = new SimpleDateFormat("yyyy-MM-dd").parse(newBatch.getStartDate());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		batch.setStartDate(batchStartDate);
		Date batchEndDate = new Date();
		try {
			batchEndDate = new SimpleDateFormat("yyyy-MM-dd").parse(newBatch.getEndDate());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		batch.setEndDate(batchEndDate);
		batch.setSkill(newBatch.getSkill());
		batch.setBatchLocation(newBatch.getLocation());
		batch.setBatchType(newBatch.getType());
		batch.setGoodGrade(newBatch.getGoodGrade());
		batch.setPassingGrade(newBatch.getPassingGrade());
		batch.setCurrentWeek(newBatch.getAdditionalProperties().get("currentWeek").toString());
		batchService.createOrUpdateBatch(batch);
		ArrayList<NewEmployeeAssignment> newEmployeeAssignments = (ArrayList<NewEmployeeAssignment>) newBatch
				.getNewEmployeeAssignments();
		for (NewEmployeeAssignment newEmployeeAssignment : newEmployeeAssignments) {
			Employee employee = new Employee();
			employee.setEmail(newEmployeeAssignment.getNewEmployee().getEmail());
			employee.setFirstName(newEmployeeAssignment.getNewEmployee().getFirstName());
			employee.setLastName(newEmployeeAssignment.getNewEmployee().getLastName());
			employeeService.createOrUpdateEmployee(employee);
			EmployeeBatch employeeBatch = new EmployeeBatch();
			employeeBatch.setEmployee(employee);
			employeeBatch.setBatch(batch);
			employeeBatch.setEmployeeRole(newEmployeeAssignment.getRole());
			employeeBatch.setDeletedAt((String) newEmployeeAssignment.getDeletedAt());
			employeeBatchService.createOrUpdateEmployeeBatch(employeeBatch);
		}
		ArrayList<NewAssociateAssignment> newAssociateAssignments = (ArrayList<NewAssociateAssignment>) newBatch
				.getNewAssociateAssignments();
		for (NewAssociateAssignment newAssociateAssignment : newAssociateAssignments) {
			Associate associate = new Associate();
			associate.setTrainingStatus(newAssociateAssignment.getTrainingStatus());
			associate.setEmail(newAssociateAssignment.getNewAssociate().getEmail());
			associate.setSalesforceId(newAssociateAssignment.getNewAssociate().getSalesforceId());
			associate.setFirstName(newAssociateAssignment.getNewAssociate().getFirstName());
			associate.setLastName(newAssociateAssignment.getNewAssociate().getLastName());
			associate.setFlag(newAssociateAssignment.getNewAssociate().getFlag());
			Date associateStartDate = new Date();
			try {
				associateStartDate = new SimpleDateFormat("yyyy-MM-dd").parse(newAssociateAssignment.getStartDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			associate.setStartDate(associateStartDate);
			Date associateEndDate = new Date();
			try {
				associateEndDate = new SimpleDateFormat("yyyy-MM-dd").parse(newAssociateAssignment.getEndDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			associate.setEndDate(associateEndDate);
			associate.setActive(newAssociateAssignment.isActive());
			associate.setBatch(batch);
			associateService.createOrUpdateAssociate(associate);
		}
	}

}
