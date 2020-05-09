package com.techlabs.model;

public class Developer extends Employee {
	
	private double pa = 0.4*basic;
	private double bonus = 0.3*basic;

	public Developer(int empId, String name, String gender, double basic) {
		super(empId, name, gender, basic);
	}

	@Override
	public double calulateNetSalary() {
		return 12*(pa + bonus);
	}

	public double getPa() {
		return pa;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public void breakdownOfSalary() {
		System.out.println("PA = "+pa+" BONUS = "+bonus+" Basic = "+basic);
		
	}
	
	@Override
	public String toString() {
		return "Role is Developer";
	}

}
