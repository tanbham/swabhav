package com.techlabs.model.test;

import java.util.Scanner;

import com.techlabs.model.ConnectionToFile;
import com.techlabs.model.ConnectionToURL;
import com.techlabs.model.EmployeeSpecification;
import com.techlabs.model.IEmployeeDataFetcher;

public class EmployeeDataAnalserTest {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int option = 0;
		while(option != 3){
			System.out.println("Press 1 to load data from URL");
			System.out.println("Press 2 to load data from file");
			System.out.println("Press 3 to exit this app");
			System.out.println("Enter your choice");
			option = sc.nextInt();
			
		
		switch(option){
			case 1 : 
				System.out.println("Enter the URl");
				String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
				ConnectionToURL fetch = new ConnectionToURL("https://swabhav-tech.firebaseapp.com/emp.txt", new EmployeeSpecification());
				fetch.readDataFromURL();
				System.out.println("Employees Information");
				System.out.println(fetch.getEmployees());
				System.out.println("Rich Employee is");
				System.out.println(fetch.getMaxSalariedEmployee());
				System.out.println("Total Number of Employees= "+fetch.getTotalNumberOfEmployees()+"\n");
				break;
					
			case 2 : 
				System.out.println("Enter the file Name");
				ConnectionToFile fetcher = new ConnectionToFile("dataFile_emp.txt",new EmployeeSpecification());
				fetcher.readDataFromFile();
				System.out.println("Employees Information");
				System.out.println(fetcher.getEmployees());
				System.out.println("Rich employee is");
				System.out.println(fetcher.getMaxSalariedEmployee());
				System.out.println("Total Number of Employees= "+fetcher.getTotalNumberOfEmployees()+"\n");
				break;
				
			case 3:
				System.out.println("Exiting , Thankyou");
				break;	
						
		}
		}
	}
}
