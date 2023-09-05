package com.spring.JdbcDEmo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.employeeOperation.EmployeeDaoImple;
import com.spring.employeeOperation.EmployeeOperation;
import com.spring.jdbc.entity1.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
       EmployeeOperation employeeOperation=context.getBean("employeeOperation",EmployeeOperation.class);
       
//       Employee employee=new Employee();
//       employee.setEmpId(4);
//       employee.setEmpName(" Marasini dinesh");
//       employee.setEmpPosition("Junior developer");
//       employee.setEmpSalary(10000);
//       
//       int result=employeeOperation.insert(employee);
//       System.out.println("successfully inserted: "+result);
       
       
       List<Employee> employees= employeeOperation.getallEmployees();
       
       for(Employee element: employees) {
    	   System.out.println(element);
       }
       
       
       
    }
}
