package com.revature.service.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.revature.model.Batch;
import com.revature.repo.BatchRepo;
import com.revature.service.BatchServiceImpl;

@ExtendWith(SpringExtension.class)
class BatchServiceImplTest {

	@Mock
	BatchRepo batchRepo;

	@InjectMocks
	BatchServiceImpl batchService;

	@Test
	void testGetAllBatches() {
		when(batchRepo.findAll()).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getAllBatches());
	}

	@Test
	void testGetBatchByBatchId() {
		when(batchRepo.findById(anyString())).thenReturn(Optional.of(new Batch()));
		assertNotNull(batchService.getBatchByBatchId(anyString()));
	}

	@Test
	void testGetBatchByBatchName() {
		when(batchRepo.findByBatchName(anyString())).thenReturn(new Batch());
		assertNotNull(batchService.getBatchByBatchName(anyString()));
	}

	@Test
	void testGetBatchesByStartDate() {
		when(batchRepo.findAllByStartDate(any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByStartDate(any(Date.class)));
	}

	@Test
	void testGetBatchesByStartDateLessThan() {
		when(batchRepo.findAllByStartDateLessThan(any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByStartDateLessThan(any(Date.class)));
	}

	@Test
	void testGetBatchesByStartDateGreaterThan() {
		when(batchRepo.findAllByStartDateGreaterThan(any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByStartDateGreaterThan(any(Date.class)));
	}

	@Test
	void testGetBatchesByStartDateBetween() {
		when(batchRepo.findAllByStartDateBetween(any(Date.class), any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByStartDateBetween(any(Date.class), any(Date.class)));
	}

	@Test
	void testGetBatchesByEndDate() {
		when(batchRepo.findAllByEndDate(any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByEndDate(any(Date.class)));
	}

	@Test
	void testGetBatchesByEndDateLessThan() {
		when(batchRepo.findAllByEndDateLessThan(any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByEndDateLessThan(any(Date.class)));
	}

	@Test
	void testGetBatchesByEndDateGreaterThan() {
		when(batchRepo.findAllByEndDateGreaterThan(any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByEndDateGreaterThan(any(Date.class)));
	}

	@Test
	void testGetBatchesByEndDateBetween() {
		when(batchRepo.findAllByEndDateBetween(any(Date.class), any(Date.class))).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByEndDateBetween(any(Date.class), any(Date.class)));
	}

	@Test
	void testGetBatchesByStartDateGreaterThanAndEndDateLessThan() {
		when(batchRepo.findAllByStartDateGreaterThanAndEndDateLessThan(any(LocalDate.class), any(LocalDate.class)))
				.thenReturn(new ArrayList<Batch>());
		assertNotNull(
				batchService.getBatchesByStartDateGreaterThanAndEndDateLessThan(any(Date.class), any(Date.class)));
	}

	@Test
	void testGetActiveBatches() {
		when(batchRepo.findAllByStartDateLessThanAndEndDateGreaterThan(any(Date.class), any(Date.class)))
				.thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getActiveBatches());
	}

	@Test
	void testGetBatchesBySkill() {
		when(batchRepo.findAllBatchesBySkill(anyString())).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesBySkill(anyString()));
	}

	@Test
	void testGetBatchesByBatchLocation() {
		when(batchRepo.findAllByBatchLocation(anyString())).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByBatchLocation(anyString()));
	}

	@Test
	void testGetBatchesByBatchType() {
		when(batchRepo.findAllByBatchType(anyString())).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByBatchType(anyString()));
	}

	@Test
	void testGetBatchesByCurrentWeek() {
		when(batchRepo.findAllByCurrentWeek(anyString())).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByCurrentWeek(anyString()));
	}

	@Test
	void testGetBatchesByEmployeeId() {
		when(batchRepo.findAllByEmployeeBatchesEmployeeEmployeeId(anyInt())).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByEmployeeId(anyInt()));
	}

	@Test
	void testGetBatchesByEmployeeFullName() {
		when(batchRepo.findAllByEmployeeBatchesEmployeeFirstNameAndEmployeeBatchesEmployeeLastName(anyString(),
				anyString())).thenReturn(new ArrayList<Batch>());
		assertNotNull(batchService.getBatchesByEmployeeFullName(anyString(), anyString()));
	}

	@Test
	void testCreateBatch() {
		batchService.createBatch(new Batch());
		verify(batchRepo, times(1)).save(new Batch());
	}

	@Test
	void testUpdateBatch() {
		when(batchRepo.findById(anyString())).thenReturn(Optional.of(new Batch()));
		assertNotNull(batchService.getBatchByBatchId(anyString()));
		batchService.updateBatch(new Batch());
	}

	@Test
	void testDeleteBatch() {
		batchService.deleteBatch(new Batch());
		verify(batchRepo, times(1)).delete(new Batch());
	}

}
