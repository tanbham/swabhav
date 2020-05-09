package com.techlabs.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.TreeSet;

public class ConnectionToURL {
	SalaryComparator salaryCompare = new SalaryComparator();
	private URL oracle;
	private ArrayList<String> listOfEmpDetails = new ArrayList<String>();
	private TreeSet<Employee> setOfEmployees = new TreeSet<>(salaryCompare);
	
	public ConnectionToURL() throws Exception {
		oracle = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
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
	
	public TreeSet<Employee> getEmployeeDetails(){
		return setOfEmployees;
	}

	private void storeInEmployeeObject(String[] employeeData) {
		Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
		setOfEmployees.add(employee);
	}
}
