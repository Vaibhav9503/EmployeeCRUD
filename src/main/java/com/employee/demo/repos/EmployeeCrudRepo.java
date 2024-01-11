package com.employee.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
	
	

}
