 package com.spring.orm.dao;

import java.util.List;
import java.util.zip.Inflater;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	 private HibernateTemplate hibernateTemplate;
	 
	 
	@Transactional
	public int insert(Student s1) {
		//insert
		Integer i=(Integer)this.hibernateTemplate.save(s1);
		
		return i;
	}
	
	
	//Read the single Data from Databases(single object)
	
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//similarly for multiple object
	
    public List<Student> getallStudents(){
    	 List<Student> students=this.hibernateTemplate.loadAll(Student.class);
    	 return students;
    }
    
    
    //FOR DELETE OPERATION
    @Transactional
    public void deleteStudent(int studentId) {
    	Student student=this.hibernateTemplate.get(Student.class, studentId);
    	this.hibernateTemplate.delete(student);
    }
    
    //UPDATE THE DATA
    @Transactional
    public void updateStudent(StudentDao student) {
    	this.hibernateTemplate.update(student);
    }
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
