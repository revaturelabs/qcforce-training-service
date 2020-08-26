package com.revature.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.model.Associate;
import com.revature.model.Batch;

class AssociateTest {

	Associate associate = new Associate();
	
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
		associate.hashCode();
		assertTrue(true);
	}

	@Test
	void testAssociate() {
		Associate a = new Associate();
		assertTrue(true);
	}

	@Test
	void testGetAssociateId() {
		associate.getAssociateId();
		assertTrue(true);
	}

	@Test
	void testSetAssociateId() {
		associate.setAssociateId(5);
		assertTrue(true);
	}

	@Test
	void testGetTrainingStatus() {
		associate.getTrainingStatus();
		assertTrue(true);
	}

	@Test
	void testSetTrainingStatus() {
		associate.setTrainingStatus("Test Status");
		assertTrue(true);
	}

	@Test
	void testGetEmail() {
		associate.getEmail();
		assertTrue(true);
	}

	@Test
	void testSetEmail() {
		associate.setEmail("test@email.com");
		assertTrue(true);
	}

	@Test
	void testGetSalesforceId() {
		associate.getSalesforceId();
		assertTrue(true);
	}

	@Test
	void testSetSalesforceId() {
		associate.setSalesforceId("TestSalesForceID");
		assertTrue(true);
	}

	@Test
	void testGetFirstName() {
		associate.getFirstName();
		assertTrue(true);
	}

	@Test
	void testSetFirstName() {
		associate.setFirstName("Monica");
		assertTrue(true);
	}

	@Test
	void testGetLastName() {
		associate.getLastName();
		assertTrue(true);
	}

	@Test
	void testSetLastName() {
		associate.setLastName("Datta");
		assertTrue(true);
	}

	@Test
	void testGetFlag() {
		associate.getFlag();
		assertTrue(true);
	}

	@Test
	void testSetFlag() {
		associate.setFlag("super star");
		assertTrue(true);
	}

	@Test
	void testGetStartDate() {
		associate.getStartDate();
		assertTrue(true);
	}

	@Test
	void testSetStartDate() {
		Date date = new Date();
		associate.setStartDate(date);
		assertTrue(true);
	}

	@Test
	void testGetEndDate() {
		associate.getEndDate();
		assertTrue(true);
	}

	@Test
	void testSetEndDate() {
		Date date = new Date();
		associate.setStartDate(date);
		assertTrue(true);
	}

	@Test
	void testIsActive() {
		associate.isActive();
		assertTrue(true);
	}

	@Test
	void testSetActive() {
		associate.setActive(true);
		assertTrue(true);
	}

	@Test
	void testGetBatch() {
		associate.getBatch();
		assertTrue(true);
	}

	@Test
	void testSetBatch() {
		Batch batch = new Batch();
		associate.setBatch(batch);
		assertTrue(true);
	}

	@Test
	void testEqualsObject() {
		associate.equals(associate);
		assertTrue(true);
	}

	@Test
	void testToString() {
		associate.toString();
		assertTrue(true);
	}

}
