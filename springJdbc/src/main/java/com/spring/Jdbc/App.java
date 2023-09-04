package com.spring.Jdbc;

import java.security.Signature;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.Jdbc.dataOperation.StudentDao;
import com.spring.jdb.entity.Student;



public class App 
{
    

	public static void main( String[] args )
    { 
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcConfig.xml");
    	
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//    	
    	
    	//for Insert operation
//    	Student student=new Student();
//    	student.setId(777);
//    	student.setName("Dipendra Sing Aireee");
//    	student.setCity("Mahendranagar"); 
//    	
//    	int result=studentDao.insert(student);
//    	System.out.println("result added:  " +result);
//    	
    	
    	
    	//for update operation
//    	Student student=new Student();
//    	student.setId(666);
//    	student.setName("Sandeep lamichhane");
//    	student.setCity("Syanja");
//    	
//    	int result=studentDao.change(student);
//    	System.out.println("Successfully updated: "+result);
//    	
    	
    	//for Delete data
//       int result=studentDao.delete(666);
//       System.out.println("Successfully deleted: "+result);
       
    	
    	
//    	JdbcTemplate temp=context.getBean("jdbcTemplate", JdbcTemplate.class);
    	
//                   //    	insert query//
//    	String query="insert into student(id, name, city) values(?,?,?)";
//    	
//    	
////                 fire query 	
//    	int result=temp.update(query,333, "Kushal Bhurtel","butwal");
//    	System.out.println("result updated: "+result);
    	
    	
    	//for rowMapper to fetch the data
//    	Student student1=studentDao.getStudent(222);
//    	System.out.println("here is the data: "+student1); 
    	
    	//for rowmapper for fetch all student data
    	
    	List<Student> students=studentDao.getAllStudents();
    	
    	for(Student element: students) {
    		System.out.println(element);
    		
    	}
    	
    	
    	 
    }
}
