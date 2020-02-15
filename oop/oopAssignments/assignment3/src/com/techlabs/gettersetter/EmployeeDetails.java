package com.techlabs.gettersetter;
//private methods and private instance variables do not have access outside the class
//they can get access outside the class by get set methods
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

