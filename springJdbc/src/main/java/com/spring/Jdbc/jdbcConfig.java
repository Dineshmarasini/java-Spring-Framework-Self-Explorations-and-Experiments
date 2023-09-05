package com.spring.Jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.Jdbc.dataOperation.StudentDao;
import com.spring.Jdbc.dataOperation.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages ={"com.spring.Jdbc.dataOperation"})

public class jdbcConfig {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/jdbcdemo");
		ds.setUsername("root");
		ds.setPassword("dinesh");
		return ds;
		
		
	}
	@Bean("JdbcTemplate")
	public JdbcTemplate geTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		 jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	
	
	
	//Autowired and ComponentScan Annotation is used on top instead of this
	
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {
//		StudentDaoImpl studentDao=new StudentDaoImpl();
//		studentDao.setJdbcTemplate(geTemplate());
//		return studentDao;
//		
//		 
//	}
	

}
