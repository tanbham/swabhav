package com.techlabs.model;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.valueOf(o1.getSalary()).compareTo(Double.valueOf(o2.getSalary()));
	}

}
