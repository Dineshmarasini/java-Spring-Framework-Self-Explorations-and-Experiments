package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("configOrm.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
//        Student student=new Student(123,"Hero Marasini","kathmandu");
//       int r= studentDao.insert(student);
//       System.out.println("successfully inserted: "+r);
        
        
        BufferedReader bReader =new BufferedReader(new InputStreamReader(System.in));
        boolean go =true;
        while (go) {
        	System.out.println("********************************************************");
        System.out.println("press 1 for add new student: ");
        System.out.println("press 2 for display all student:");
        System.out.println("press 3 for get details of single student:");
        System.out.println("press 4 for delete all student: ");
        System.out.println("press 5 for update student: ");
        System.out.println("press 6 for exit") ;
        
        try {
        	int input=Integer.parseInt(bReader.readLine());
        	
        	
        switch(input) {
        case 1:
        	//add a new student
        	
        	System.out.println("Enter user id:");
        	int uId=Integer.parseInt(bReader.readLine());
        	
        	System.out.println("Enter the Name: ");
        	String uName=bReader.readLine();
        	
        	System.out.println("Enter the City: ");
        	String uCity=bReader.readLine();
        	
        	Student s=new Student();
        	s.setStudentId(uId);
        	s.setStudentName(uName);
        	s.setStudentCity(uCity);
        	
        	int r=studentDao.insert(s);
        	System.out.println("successfully Inserted data: "+r);
        	System.out.println("********************************************************");
        	System.out.println();
        	 break;
        	 
        case 2:
        	//display all students
        	System.out.println("********************************************************");
        	List<Student> allStudents=studentDao.getallStudents();
        	for(Student element:allStudents) {
        		System.out.println("Name: "+element.getStudentName());
        		System.out.println("Id: "+element.getStudentId());
        		System.out.println("City: "+element.getStudentCity());
        		System.out.println("______________________________________________________");
        	}
        	break;
        	
        case 3:
        	//get single object
        	 
        	System.out.println("Enter user id:");
        	int userId=Integer.parseInt(bReader.readLine());
        	Student student= studentDao.getStudent(userId);
        	System.out.println("Name: "+student.getStudentName());
    		System.out.println("Id: "+student.getStudentId());
    		System.out.println("City: "+student.getStudentCity());
        	
        	break;
        	
        	
        case 4:
        	//delete all student
        	System.out.println("Enter user id:");
        	int id=Integer.parseInt(bReader.readLine());
        	studentDao.deleteStudent(id);
        	System.out.println("successfully deleted...!");
        	 
        	 
        	 
        	
        case 5:
        	//update student
        	break;
        	
        case 6:
        	//exit
        	 go=false;
        	break;
        }
			
		} catch (Exception e) {
			System.out.println("Invalid input....!Choose the right option,");
			System.out.println(e.getMessage());
		}
        
        }
    }
}
