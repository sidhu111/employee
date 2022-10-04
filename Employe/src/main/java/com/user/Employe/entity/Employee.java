package com.user.Employe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name ="Employeemang")
public class Employee {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long Id;
	@Column(name="employee_name")
	String employeeName;
	@Column(name="employee_type")
	String employeeType;
	@Column(name="employee_department")
	String employeeDepartment;
	@Column(name="email")
	String email;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Long id, String employeeName, String employeeType, String employeeDepartment,String email) {
		super();
		Id = id;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.employeeDepartment = employeeDepartment;
		this.email=email;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeType() {
		return employeeType;
	}


	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}


	public String getEmployeeDepartment() {
		return employeeDepartment;
	}


	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", employeeName=" + employeeName + ", employeeType=" + employeeType
				+ ", employeeDepartment=" + employeeDepartment + ", email=" + email + "]";
	}


		
	
	
	

}
