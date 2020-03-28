package com.techlabs.inheritance;

public class Employee extends Person {
	private double salary;
	private int year;
	private String nationalNumber;
	
	
	public Employee(String name , double salary, int year , String nationalNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.nationalNumber = nationalNumber;		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getNationalNumber() {
		return nationalNumber;
	}
}
