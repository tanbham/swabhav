package com.techlabs.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeSpecification implements IEmployeeDataFetcher{
	private HashSet<Employee> setOfEmployees = new HashSet<Employee>();

	public void storeNewEmployees(String[] employeeData) {
		Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
		setOfEmployees.add(employee); 
	}
	
	public HashSet<Employee> getEmployeeDetails(){
		return setOfEmployees;
	}
	
	public Employee getMaximumSalariedEmployee(){
		Employee richEmployee = null;
		double maxSalary = 0;
		for(Employee employee : setOfEmployees){
			if(employee.getSalary() > maxSalary){
				maxSalary = employee.getSalary();
				richEmployee = employee;
			}
		}
		return richEmployee;
	}
	
	public int getTotalNumberOfEmployees(){
		return setOfEmployees.size();
	}

}
