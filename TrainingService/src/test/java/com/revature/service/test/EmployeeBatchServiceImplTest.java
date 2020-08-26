package com.revature.service.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.revature.model.EmployeeBatch;
import com.revature.model.EmployeeBatchId;
import com.revature.repo.EmployeeBatchRepo;
import com.revature.service.EmployeeBatchServiceImpl;

@ExtendWith(SpringExtension.class)
class EmployeeBatchServiceImplTest {

	@Mock
	EmployeeBatchRepo employeeBatchRepo;

	@InjectMocks
	EmployeeBatchServiceImpl employeeBatchService;

	@Test
	void testGetAllEmployeeBatches() {
		when(employeeBatchRepo.findAll()).thenReturn(new ArrayList<EmployeeBatch>());
		assertNotNull(employeeBatchService.getAllEmployeeBatches());
	}

	@Test
	void testGetEmployeeBatchByEmployeeBatchId() {
		when(employeeBatchRepo.findById(any(EmployeeBatchId.class))).thenReturn(Optional.of(new EmployeeBatch()));
		assertNotNull(employeeBatchService.getEmployeeBatchByEmployeeBatchId(new EmployeeBatchId()));
	}

	@Test
	void testCreateEmployeeBatch() {
		employeeBatchService.createEmployeeBatch(new EmployeeBatch());
		verify(employeeBatchRepo, times(1)).save(new EmployeeBatch());
	}

	@Test
	void testUpdateEmployeeBatch() {
		when(employeeBatchRepo.findById(any(EmployeeBatchId.class))).thenReturn(Optional.of(new EmployeeBatch()));
		assertNotNull(employeeBatchService.getEmployeeBatchByEmployeeBatchId(new EmployeeBatchId()));
		employeeBatchService.updateEmployeeBatch(new EmployeeBatch());
	}

	@Test
	void testDeleteEmployeeBatch() {
		employeeBatchService.deleteEmployeeBatch(new EmployeeBatch());
		verify(employeeBatchRepo, times(1)).delete(new EmployeeBatch());
	}

}
