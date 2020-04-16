package com.techlabs.model;

public class Analyst extends Employee {
	private double perks = 0.3*basic;

	public Analyst(int empId, String name, String gender, double basic) {
		super(empId, name, gender, basic);
	}

	@Override
	public double calulateNetSalary() {
		return perks*12;
	}
	
	public double getPerks() {
		return perks;
	}

	@Override
	public void breakdownOfSalary() {
		System.out.println("perks = "+perks+"basic = "+basic);
		
	}

}
