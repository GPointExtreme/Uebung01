package org.gpoint.mitarbeiter;

public class PercentCommissionEmployee extends Employee {
	
	private double percentCommission;

	public PercentCommissionEmployee(String lastname, String firtname, String department, double baseSalary, double percentCommission) {
		super(lastname, firtname, department, baseSalary);
		this.percentCommission = percentCommission;
	}
	
	@Override
	public double getFullSalary() {
		return super.getFullSalary() + (baseSalary * (percentCommission / 100));
	}

}
