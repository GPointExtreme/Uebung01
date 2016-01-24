package org.gpoint.mitarbeiter;

public class Employee {
	
	protected String lastname;
	protected String firtname;
	protected String department;
	protected double baseSalary;
	
	public Employee(String lastname, String firtname, String department, double baseSalary) {
		super();
		this.lastname = lastname;
		this.firtname = firtname;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	public double getFullSalary() {
		return baseSalary;
	}
	
}
