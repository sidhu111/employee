package com.user.Employe.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Employe.entity.Employee;
import com.user.Employe.repository.EmployeeRepository;
import com.user.Employe.service.EmployeeService;

@Service
public class EmployeeImplementation implements EmployeeService {

	
	//  @Autowired is not required if bean has only constructor
		private EmployeeRepository employeerepository;
	
	public EmployeeImplementation(EmployeeRepository employeerepository) {
			super();
			this.employeerepository = employeerepository;
		}



	@Override
	public List<Employee> getAllemployees() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}



	@Override
	public Optional<Employee> UpdateEmployee(Long employeeid) {
		// TODO Auto-generated method stub
		return employeerepository.findById(employeeid);
	}
	

}
