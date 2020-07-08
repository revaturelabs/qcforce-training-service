package com.revature.controller.test;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

import com.revature.controller.AssociateController;
import com.revature.controller.BatchController;
import com.revature.controller.EmployeeController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ControllerCreationTest {

	@Autowired
	private AssociateController associateController;

	@Autowired
	private BatchController batchController;

	@Autowired
	private EmployeeController employeeController;

	@LocalServerPort
	private int port;

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
	public void AssociateControllerContexLoads() throws Exception {
		assertThat(associateController).isNotNull();
	}

	@Test
	public void BatchControllerContexLoads() throws Exception {
		assertThat(batchController).isNotNull();
	}

	@Test
	public void EmployeeControllerContexLoads() throws Exception {
		assertThat(employeeController).isNotNull();
	}

}
