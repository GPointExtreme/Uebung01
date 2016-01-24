package org.gpoint.mitarbeiter;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("geiger", "dominik", "IT", 2000);
		Employee emp2 = new Employee("erlacher", "david", "IT", 2000);
		Employee emp3 = new FixCommissionEmployee("philip", "kropik", "IT", 2000, 500);
		Employee emp4 = new PercentCommissionEmployee("vollassi", "toni", "MA", 800, 10);
		
		ArrayList<Employee> Map = new ArrayList<>();
		
		EmployeeManager Manager = new EmployeeManager(Map);
		
		Manager.addEmployee(emp1);
		Manager.addEmployee(emp2);
		Manager.addEmployee(emp3);
		Manager.addEmployee(emp4);
		
		System.out.println("TotalSaralry: " + Manager.calcTotalSaralry());
		
		System.out.println("TotalSaralry: " + Manager.getSalaryByDepartment());
		
	}

}
