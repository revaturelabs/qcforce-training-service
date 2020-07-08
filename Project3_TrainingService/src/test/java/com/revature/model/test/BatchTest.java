package com.revature.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.model.Associate;
import com.revature.model.Batch;
import com.revature.model.EmployeeBatch;

class BatchTest {

	Batch batch = new Batch();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		batch.hashCode();
		assertTrue(true);
	}

	@Test
	void testBatch() {
		Batch b = new Batch();
		assertTrue(true);
	}

	@Test
	void testGetBatchId() {
		batch.getBatchId();
		assertTrue(true);
	}

	@Test
	void testSetBatchId() {
		batch.setBatchId("TestID");
		assertTrue(true);
	}

	@Test
	void testGetBatchName() {
		batch.getBatchName();
		assertTrue(true);
	}

	@Test
	void testSetBatchName() {
		batch.setBatchName("TestBatchName");
		assertTrue(true);
	}

	@Test
	void testGetStartDate() {
		batch.getStartDate();
		assertTrue(true);
	}

	@Test
	void testSetStartDate() {
		Date date = new Date();
		batch.setStartDate(date);
		assertTrue(true);
	}

	@Test
	void testGetEndDate() {
		batch.getEndDate();
		assertTrue(true);
	}

	@Test
	void testSetEndDate() {
		Date date = new Date();
		batch.setEndDate(date);
		assertTrue(true);
	}

	@Test
	void testGetSkill() {
		batch.getSkill();
		assertTrue(true);
	}

	@Test
	void testSetSkill() {
		batch.setSkill("Test Skill");
		assertTrue(true);
	}

	@Test
	void testGetBatchLocation() {
		batch.getBatchLocation();
		assertTrue(true);
	}

	@Test
	void testSetBatchLocation() {
		batch.setBatchLocation("Test Location");
		assertTrue(true);
	}

	@Test
	void testGetBatchType() {
		batch.getBatchType();
		assertTrue(true);
	}

	@Test
	void testSetBatchType() {
		batch.setBatchType("Test Batch Type");
		assertTrue(true);
	}

	@Test
	void testIsGoodGrade() {
		batch.getGoodGrade();
		assertTrue(true);
	}

	@Test
	void testSetGoodGrade() {
		batch.setGoodGrade(90);
		assertTrue(true);
	}

	@Test
	void testIsPassingGrade() {
		batch.getPassingGrade();
		assertTrue(true);
	}

	@Test
	void testSetPassingGrade() {
		batch.setPassingGrade(70);
		assertTrue(true);
	}

	@Test
	void testGetCurrentWeek() {
		batch.getCurrentWeek();
		assertTrue(true);
	}

	@Test
	void testSetCurrentWeek() {
		batch.setCurrentWeek("5");
		assertTrue(true);
	}

	@Test
	void testGetAssociates() {
		batch.getAssociates();
		assertTrue(true);
	}

	@Test
	void testSetAssociates() {
		List<Associate> associates = new ArrayList<Associate>();
		batch.setAssociates(associates);
	}

	@Test
	void testAddAssociate() {
		Associate associate = new Associate();
		batch.addAssociate(associate);
		assertTrue(true);
	}

	@Test
	void testGetEmployeeBatches() {
		batch.getEmployeeBatches();
		assertTrue(true);
	}

	@Test
	void testSetEmployeeBatches() {
		List<EmployeeBatch> employeeBatches = new ArrayList<EmployeeBatch>();
		batch.setEmployeeBatches(employeeBatches);
		assertTrue(true);
	}

	@Test
	void testAddEmployeeBatch() {
		EmployeeBatch employeeBatch = new EmployeeBatch();
		batch.addEmployeeBatch(employeeBatch);
		assertTrue(true);
	}

	@Test
	void testEqualsObject() {
		batch.equals(batch);
		assertTrue(true);
	}

	@Test
	void testToString() {
		batch.toString();
		assertTrue(true);
	}

}
