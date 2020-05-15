package com.techlabs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;

public class ConnectionToData {
	private HashSet<Employee> setOfEmployees = new HashSet<Employee>();
	private String fileName;
	private URL oracle;
	
	public ConnectionToData(String fileName) {
		this.fileName = fileName;
	}
	
	public ConnectionToData(String url , int num) throws Exception {
		oracle = new URL(url);
	}
	
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
	
	public void readDataFromFile() throws Exception{
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		String inputLine;
		while(sc.hasNextLine()){
			inputLine = sc.nextLine();
			inputLine = inputLine.replaceAll(" ","");
        	inputLine = inputLine.replaceAll("'","");
        	String employeeData[] = inputLine.split(",");
        	storeNewEmployees(employeeData);
		}
	}
	
	public void readDataFromURL() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	inputLine = inputLine.replaceAll(" ","");
        	inputLine = inputLine.replaceAll("'","");
        	String employeeData[] = inputLine.split(",");
        	storeNewEmployees(employeeData);
        } 
        in.close();
	}

	private void storeNewEmployees(String[] employeeData) {
		Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
		setOfEmployees.add(employee); 
	}
}
