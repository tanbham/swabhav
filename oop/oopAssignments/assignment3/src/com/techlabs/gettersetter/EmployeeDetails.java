package com.techlabs.gettersetter;

public class EmployeeDetails {
	private String name;
	private int salary;
	
	public void setFirstName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}		
}

