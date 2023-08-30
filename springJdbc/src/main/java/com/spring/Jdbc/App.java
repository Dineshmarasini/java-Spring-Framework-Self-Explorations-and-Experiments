package com.spring.Jdbc;

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
    	
    	Student student=new Student();
    	student.setId(666);
    	student.setName("Rohit poudel");
    	student.setCity("Kathmandu"); 
    	
    	int result=studentDao.insert(student);
    	System.out.println("result added:  " +result);
    	
//    	JdbcTemplate temp=context.getBean("jdbcTemplate", JdbcTemplate.class);
    	
//                   //    	insert query//
//    	String query="insert into student(id, name, city) values(?,?,?)";
//    	
//    	
////                 fire query 	
//    	int result=temp.update(query,333, "Kushal Bhurtel","butwal");
//    	System.out.println("result updated: "+result);
    	
    	
    	 
    }
}
