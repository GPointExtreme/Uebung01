package org.gpoint.mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
	
	private ArrayList<Employee> emplyeeList = new ArrayList<>();
	
	public EmployeeManager(ArrayList<Employee> emplyeeList) {
		super();
		this.emplyeeList = emplyeeList;
	}

	public void addEmployee(Employee e) {
		emplyeeList.add(e);
	}
	
	public double calcTotalSaralry() {
		double total = 0.0;
		for (Employee employee : emplyeeList) {
			total += employee.getFullSalary();
		}
		return total;
	}
	
	public HashMap<String, Double> getSalaryByDepartment() {
		HashMap<String, Double> Map = new HashMap<>();
		double temp = 0.0;
		
		for (Employee employee : emplyeeList) {
			if(Map.containsKey(employee.department)) {
				temp = Map.get(employee.department); //schreibt den aktuellen Wert in die temp Variable
				Map.put(employee.department, employee.getFullSalary() + temp);
			}
			else {
				Map.put(employee.department, employee.getFullSalary());
			}
		}
		return Map;
	}
}
