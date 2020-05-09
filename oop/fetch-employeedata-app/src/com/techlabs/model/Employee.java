package com.techlabs.model;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String name;
	private String role;
	private int managerId;
	private String dateOfJoining;
	private double salary;
	private String comm;
	private int deptNumber;
	
	public Employee(String empid , String name , String role, String managerId, String dateOfJoining ,String salary, String comm,String deptNumber) {
		this.empid = Integer.valueOf(empid);
		this.name = name;
		this.role = role;
		this.managerId = Integer.valueOf(managerId);
		this.dateOfJoining = dateOfJoining;
		this.salary = Double.parseDouble(salary);
		this.comm = comm;
		this.deptNumber = Integer.valueOf(deptNumber);
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.valueOf(this.empid).compareTo(Integer.valueOf(o.empid));
	}
	
	public String toString() {
		return("ID:"+this.empid+" , "+"Salary:"+this.salary+" , "+"Name:"+this.name+" , "+"Role:"+this.role+" , "+"ManagerId:"+this.managerId+" , "+"JoiningDate:"+this.dateOfJoining+" , "+"Comm:"+this.comm+" , "+"DepartmentNumber:"+this.deptNumber+"\n");
	}
}
