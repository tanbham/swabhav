package model;

import java.util.HashSet;

public class EmployeeDetails implements IDataReader{

	public void readData() throws Exception {}
	
	public HashSet<Employee> getEmployees(){
		return setOfEmployees;
	}
	
	public int getTotalNumberOfEmployees(){
		return setOfEmployees.size();
	}
	
	public Employee getMaxSalariedEmployee(){
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

}
