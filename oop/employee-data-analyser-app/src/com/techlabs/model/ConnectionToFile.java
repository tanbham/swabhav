package com.techlabs.model;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class ConnectionToFile {
	private IEmployeeDataFetcher fetcher;
	private String fileName;
	
	public ConnectionToFile(String fileName ,IEmployeeDataFetcher fetcher) {
		this.fileName = fileName;
		this.fetcher = fetcher;
	}
	
	public HashSet<Employee> getEmployees(){
		return fetcher.getEmployeeDetails();
	}
	
	public int getTotalNumberOfEmployees(){
		return fetcher.getTotalNumberOfEmployees();
	}
	
	public Employee getMaxSalariedEmployee(){
		return fetcher.getMaximumSalariedEmployee();
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
        	storeInEmployeeObject(employeeData);
		}
	}
	
	private void storeInEmployeeObject(String[] employeeData) {
		fetcher.storeNewEmployees(employeeData);	
	}
}
