package com.spring.employeeOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity1.Employee;
@Component("employeeOperation")
public class EmployeeDaoImple implements EmployeeOperation {
     @Autowired 
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int insert(Employee employee) { 
		String query="insert into employee(empId,empName, empPosition, empSalary) value(?,?,?,?)";
		int r=this.jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpPosition(), employee.getEmpSalary());
		return r;
	}
	
	//selecting multiple employee to show from database
	
	public List<Employee> getallEmployees(){
		String query="select * from employee";
		List<Employee> employees=this.jdbcTemplate.query(query, new RowMapperImplementation());
		return employees;
	}

}
