package com.user.Employe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.user.Employe.entity.Employee;


public interface EmployeeService {
	
	List<Employee> getAllemployees();
	
	Employee saveEmployee(Employee employee);
	
	Optional<Employee> UpdateEmployee(Long employeeid);

}
