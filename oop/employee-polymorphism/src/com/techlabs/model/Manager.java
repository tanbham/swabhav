package com.techlabs.model;

public class Manager extends Employee{
	
	private double hra = 0.5*basic;
	private double da = 0.4*basic;
	private double ta = 0.3*basic;
	
	public Manager(int empId, String name, String gender, double basic) {
		super(empId, name, gender, basic);
	}

	@Override
	public double calulateNetSalary() { 
		return  12*(hra + ta + da);  
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public void breakdownOfSalary() {
		System.out.println("HRA = "+hra+" DA = "+da+" TA = "+ta+"Basic = "+basic);
		
	}
}
