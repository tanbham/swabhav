package com.techlabs.gettersetter;

public class EmployeeDetail {
	public static void main(String args[]) {
		EmployeeDetails tanmay = new EmployeeDetails();
		EmployeeDetails saloni = new EmployeeDetails();
		EmployeeDetails suchita = new EmployeeDetails();
		
		tanmay.setFirstName("Tanmay");
		tanmay.setSalary(10000);
		
		saloni.setFirstName("Saloni");
		saloni.setSalary(15000);
		
		suchita.setFirstName("Suchita");
		suchita.setSalary(20000);
		
		System.out.println(tanmay.getFirstName());
		System.out.println(tanmay.getSalary());
		System.out.println(saloni.getFirstName());
		System.out.println(saloni.getSalary());
		System.out.println(suchita.getFirstName());
		System.out.println(suchita.getSalary());
	}
}
