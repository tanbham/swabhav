package com.techlabs.model.test;

import com.techlabs.model.Employee;
import com.techlabs.model.Manager;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee m1 = new Manager(101,"Tanmay","male", 10000);
		
		printSalarySlip(m1);
		printSalaryBreakDown(m1);
	}

	private static void printSalaryBreakDown(Employee e) {
		System.out.println("Break down of salary is ");
		e.breakdownOfSalary();
	}

	private static void printSalarySlip(Employee e) {
		System.out.println(e.getName()+" = Name");
		System.out.println(e.getGender()+" = Gender");
		System.out.println(e.getEmpId()+"= Employee ID");
		System.out.println(e.getBasic()+" = Basic");
		System.out.println(e.calulateNetSalary()+" = Net Annual Salary");
		System.out.println(e);
	}
}
