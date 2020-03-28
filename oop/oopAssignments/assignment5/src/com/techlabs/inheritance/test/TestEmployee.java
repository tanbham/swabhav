package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Employee;

public class TestEmployee {
	public static void main(String args[]) {
		Employee emp1 = new Employee("Tanmay",29000,2002,"1TB234");
		
		System.out.println("Name of the Employee is = "+emp1.getName());
		System.out.println("Salary is = "+emp1.getSalary());
		System.out.println("Year of joining is = "+emp1.getYear());
		System.out.println("National insurance number is = "+emp1.getNationalNumber());

	}
}
