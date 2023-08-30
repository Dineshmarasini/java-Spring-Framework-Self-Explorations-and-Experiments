package com.spring.Jdbc.dataOperation;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdb.entity.Student;

public class StudentDaoImpl implements StudentDao{
	 private JdbcTemplate jdbcTemplate;
	private int update;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String query="insert into student(id, name, city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		 
		return r;
	}

}
