package com.demo.service;

import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDao edao;

	public EmployeeServiceImp() {
		edao = new EmployeeDaoImp();
		
	
	do {
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Show All Employees");
        System.out.println("4. Show Employees in Sorted Order (by ID)");
        System.out.println("5. Find Employee by Name");
        System.out.println("6. Save All Employees");
        System.out.println("7. Quit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> service.addEmployee();
        }
    } while (choice != 7);

    sc.close();
}
		
		
	}
	
	
	

}
