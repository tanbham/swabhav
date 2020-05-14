package com.techlabs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;

public class ConnectionToData {
	private IEmployeeDataFetcher fetcher;
	private String fileName;
	private URL oracle;
	
	public ConnectionToData(String fileName ,IEmployeeDataFetcher fetcher) {
		this.fileName = fileName;
		this.fetcher = fetcher;
	}
	
	public ConnectionToData(IEmployeeDataFetcher fetcher,String url) throws Exception {
		oracle = new URL(url);
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
	
	public void readDataFromURL() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	inputLine = inputLine.replaceAll(" ","");
        	inputLine = inputLine.replaceAll("'","");
        	String employeeData[] = inputLine.split(",");
        	storeInEmployeeObject(employeeData);
        } 
        in.close();
	}
	
	private void storeInEmployeeObject(String[] employeeData) {
		fetcher.storeNewEmployees(employeeData);	
	}
}
