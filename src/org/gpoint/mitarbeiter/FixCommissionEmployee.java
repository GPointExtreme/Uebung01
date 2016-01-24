package org.gpoint.mitarbeiter;

public class FixCommissionEmployee extends Employee {
	
	private double additionalCommission;

	public FixCommissionEmployee(String lastname, String firtname, String department, double baseSalary, double additionalCommission) {
		super(lastname, firtname, department, baseSalary);
		this.additionalCommission = additionalCommission;
	}
	
	@Override
	public double getFullSalary() {
		return super.getFullSalary() + additionalCommission;
	}

}
