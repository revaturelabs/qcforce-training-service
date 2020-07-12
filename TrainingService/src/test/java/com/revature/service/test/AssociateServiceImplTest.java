package com.revature.service.test;

import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.revature.model.Associate;
import com.revature.repo.AssociateRepo;
import com.revature.service.AssociateServiceImpl;

@ExtendWith(SpringExtension.class)
class AssociateServiceImplTest {

	@Mock
	AssociateRepo associateRepo;

	@InjectMocks
	AssociateServiceImpl associateService;

	@Test
	void testGetAllAssociates() {
		when(associateRepo.findAll()).thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllAssociates());
	}

	@Test
	void testGetAssociateByAssociateId() {
		when(associateRepo.findById(1)).thenReturn(Optional.of(new Associate()));
		assertNotNull(associateService.getAssociateByAssociateId(1));
	}

	@Test
	void testGetAllAssociatesByBatchName() {
		when(associateRepo.findAllByBatchBatchName(anyString())).thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllAssociatesByBatchName(anyString()));
	}

	@Test
	void testGetAllAssociatesByBatchNameAndActive() {
		when(associateRepo.findAllByBatchBatchNameAndActive(anyString(), anyBoolean()))
				.thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllAssociatesByBatchNameAndActive(anyString(), anyBoolean()));
	}

	@Test
	void testGetAllAssociatesByBatchId() {
		when(associateRepo.findAllByBatchBatchId(anyString())).thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllAssociatesByBatchId(anyString()));
	}

	@Test
	void testGetAllAssociatesByBatchIdAndActive() {
		when(associateRepo.findAllByBatchBatchIdAndActive(anyString(), anyBoolean()))
				.thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllAssociatesByBatchIdAndActive(anyString(), anyBoolean()));
	}

	@Test
	void testGetAllAssociatesByFullName() {
		when(associateRepo.findAllByFirstNameAndLastName(anyString(), anyString()))
				.thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllAssociatesByFullName(anyString(), anyString()));
	}

	@Test
	void testGetAllActiveAssociates() {
		when(associateRepo.findAllByActive(true)).thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getAllActiveAssociates());
	}

	@Test
	void testGetActiveAssociateEmails() {
		when(associateRepo.findAllByActive(true)).thenReturn(new ArrayList<Associate>());
		assertNotNull(associateService.getActiveAssociateEmails());
	}

	@Test
	void testCreateAssociate() {
		associateService.createAssociate(new Associate());
		verify(associateRepo, times(1)).save(new Associate());
	}

	@Test
	void testUpdateAssociate() {
		when(associateRepo.findById(Mockito.anyInt())).thenReturn(Optional.of(new Associate()));
		assertNotNull(associateService.getAssociateByAssociateId(Mockito.anyInt()));
		associateService.updateAssociate(new Associate());
	}

	@Test
	void testDeleteAssociate() {
		associateService.deleteAssociate(new Associate());
		verify(associateRepo, times(1)).delete(new Associate());
	}

}
