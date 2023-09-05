package com.spring.jdbc.entity1;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private int empId;
	private String empName;
	private String empPosition;
	private int empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empPosition, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPosition = empPosition;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "EmployeeInformation [empId=" + empId + ", empName=" + empName + ", empPosition=" + empPosition + ", empSalary="
				+ empSalary + "]";
	}
	
	

}
