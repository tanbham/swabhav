package com.techlabs.model;

import java.util.HashSet;

public interface IEmployeeDataFetcher {
	Employee getMaximumSalariedEmployee();
	HashSet<Employee> getEmployeeDetails();
	int getTotalNumberOfEmployees();
	void storeNewEmployees(String[] employees);
}
