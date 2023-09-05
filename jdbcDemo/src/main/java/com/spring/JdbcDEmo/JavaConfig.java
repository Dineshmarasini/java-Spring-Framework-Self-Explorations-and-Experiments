package com.spring.JdbcDEmo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.employeeOperation.EmployeeDaoImple;
import com.spring.employeeOperation.EmployeeOperation;
@Configuration
@ComponentScan(basePackages = {"com.spring.employeeOperation"})
public class JavaConfig {
	@Bean("dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dSource=new DriverManagerDataSource();
		dSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dSource.setUrl("jdbc:mysql://localhost:3306/employeejdbc");
		dSource.setUsername("root");
		dSource.setPassword("dinesh");
		return dSource;
		
	}
	@Bean("jdbctemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
//	@Bean("employeeOperation")
//   public EmployeeOperation getEmployeeOperation() {
//	   EmployeeDaoImple employeeDaoImple=new EmployeeDaoImple();
//	   employeeDaoImple.setJdbcTemplate(getJdbcTemplate());
//	   return employeeDaoImple;
//   }

}
