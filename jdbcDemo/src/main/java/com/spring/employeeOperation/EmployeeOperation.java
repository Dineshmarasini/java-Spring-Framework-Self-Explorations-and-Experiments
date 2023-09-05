package com.spring.employeeOperation;

import java.util.List;

import com.spring.jdbc.entity1.Employee;

public interface EmployeeOperation {
	
	public int insert(Employee employee);
	public List<Employee> getallEmployees();

}
