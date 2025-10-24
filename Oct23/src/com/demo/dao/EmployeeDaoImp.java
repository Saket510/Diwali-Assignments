package com.demo.dao;
import java.util.*;
import com.demo.*;
import com.demo.beans.Employee;

public class EmployeeDaoImp implements EmployeeDao {
	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(empName:"Rahul",empRole:"TeamLead",empID:101));
		
				
	}
	

}
