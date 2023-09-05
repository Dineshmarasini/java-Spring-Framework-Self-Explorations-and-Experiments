package com.spring.employeeOperation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity1.Employee;

public class RowMapperImplementation implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Employee employee=new Employee();
		 employee.setEmpId(rs.getInt(1));
		 employee.setEmpName(rs.getString(2));
		 employee.setEmpPosition(rs.getString(3));
		 employee.setEmpSalary(rs.getInt(4));
		 return employee;
	}
	

}
