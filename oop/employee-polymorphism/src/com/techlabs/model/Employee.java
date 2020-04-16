package com.techlabs.model;

public abstract class Employee {
	private String name;
	private int empId;
	protected  double basic;
	private String gender;
	
	public Employee(int empId , String name , String gender , double basic) {
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.basic = basic;
	}
	
	public abstract double calulateNetSalary();
	
	public abstract void breakdownOfSalary();
	
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
	public double getBasic() {
		return basic;
	}
	public String getGender() {
		return gender;
	}
}
