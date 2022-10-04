package com.user.Employe.controller;

import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.Employe.entity.Employee;
import com.user.Employe.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	
	//getting all list 
	@GetMapping("/employee")
	public String getAllemployee(Model model) {
		
		//we are given employees as reference and from employeeservice we are getting values from  object(employee) or from employee form
		//employees  --> used to iterate in the employeeslistform page.
		model.addAttribute("employees", employeeservice.getAllemployees());
		
		return "employeeslistform";	
	}
	
	//creating the employee register form                   
	@GetMapping("/employee/new")        
	public String createEmployeeForm(Model model) {
		
		//we are creating employee object to hold employee form data
		Employee employee = new Employee();
		//employees  --> used to iterate in the form page 
		model.addAttribute("employees", employee);
		
		return "createemployeeform";
		
	}

	
	//Save the employee
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeservice.saveEmployee(employee);
		
		return "redirect:/employee";
		
	}
	
	
	//update student
		@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable(value ="id") Long employeeid) throws AttributeNotFoundException {
		
		Employee existing = this.employeeservice.UpdateEmployee(employeeid).orElseThrow(() -> new AttributeNotFoundException("employee not found with id :" + employeeid));
		
		existing.setEmployeeName(employee.getEmployeeName());
		existing.setEmployeeType(employee.getEmployeeType());
		existing.setEmployeeDepartment(employee.getEmployeeDepartment());
		existing.setEmail(employee.getEmail());
		
		
		return this.employeeservice.saveEmployee(existing);
		
	}
	
}
