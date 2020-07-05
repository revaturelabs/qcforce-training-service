package com.revature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByFirstNameAndLastName(String firstName, String lastName);

	public Employee findByEmail(String email);

}
