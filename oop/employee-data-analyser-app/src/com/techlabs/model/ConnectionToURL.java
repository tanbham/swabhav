package com.techlabs.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ConnectionToURL {
	private URL oracle;
	private IEmployeeDataFetcher fetcher;
	
	public ConnectionToURL(String url, IEmployeeDataFetcher fetcher) throws Exception {
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

	private void storeInEmployeeObject(String[] employeeData) {
		fetcher.storeNewEmployees(employeeData);
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

}
