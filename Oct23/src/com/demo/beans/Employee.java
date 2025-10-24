package com.demo.beans;

public class Employee {
	private String empName;
	private String empRole;
	private int empID;
	public Employee() {
		super();
	}
	public Employee(String empName, String empRole, int empID) {
		super();
		this.empName = empName;
		this.empRole = empRole;
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empRole=" + empRole + ", empID=" + empID + "]";
	}
	
	

}
