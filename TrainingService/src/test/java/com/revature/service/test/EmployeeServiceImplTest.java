package com.revature.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Optional;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.revature.model.Employee;
import com.revature.repo.EmployeeRepo;
import com.revature.service.EmployeeServiceImpl;

@ExtendWith(SpringExtension.class)
class EmployeeServiceImplTest {

	@Mock
	EmployeeRepo employeeRepo;

	@InjectMocks
	EmployeeServiceImpl employeeService;

	@Test
	void testGetAllEmployees() {
		when(employeeRepo.findAll()).thenReturn(new ArrayList<Employee>());
		assertNotNull(employeeService.getAllEmployees());
	}

	@Test
	void testGetEmployeeByEmployeeId() {
		when(employeeRepo.findById(anyInt())).thenReturn(Optional.of(new Employee()));
		assertNotNull(employeeService.getEmployeeByEmployeeId(anyInt()));
	}

	@Test
	void testGetEmployeesByFullName() {
		when(employeeRepo.findAllByFirstNameAndLastName(anyString(), anyString()))
				.thenReturn(new ArrayList<Employee>());
		assertNotNull(employeeService.getEmployeesByFullName(anyString(), anyString()));
	}

	@Test
	void testCreateEmployee() {
		employeeService.createEmployee(new Employee());
		verify(employeeRepo, times(1)).save(new Employee());
	}

	@Test
	void testUpdateEmployee() {
		when(employeeRepo.findById(Mockito.anyInt())).thenReturn(Optional.of(new Employee()));
		assertNotNull(employeeService.getEmployeeByEmployeeId(Mockito.anyInt()));
		employeeService.updateEmployee(new Employee());
	}

	@Test
	void testDeleteEmployee() {
		employeeService.deleteEmployee(new Employee());
		verify(employeeRepo, times(1)).delete(new Employee());
	}

}
