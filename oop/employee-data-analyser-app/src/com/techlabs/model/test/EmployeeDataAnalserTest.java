package com.techlabs.model.test;
import java.util.Scanner;
import com.techlabs.model.ConnectionToData;
//file = dataFile_emp.txt
//url = https://swabhav-tech.firebaseapp.com/emp.txt

public class EmployeeDataAnalserTest {
	public static void main(String args[]) throws Exception{
		int option = 0;
		Scanner sc = new Scanner(System.in);
		while(option != 3){
			System.out.println("Press 1 to fetch data from file");
			System.out.println("Press 2 to fetch data from URL");
			System.out.println("Press 3 to Exit");
			option = sc.nextInt();
			
			
			switch(option){
			case 1:
				System.out.println("Enter the file name");
				String fileName = sc.next();
				ConnectionToData fetch = new ConnectionToData(fileName);
				fetch.readDataFromFile();
				System.out.println("Employees Information");
				System.out.println(fetch.getEmployees());
				System.out.println("Rich Employee is");
				System.out.println(fetch.getMaxSalariedEmployee());
				System.out.println("Total Number of Employees= "+fetch.getTotalNumberOfEmployees()+"\n");
				break;
				
			case 2:
				System.out.println("Enter the URL");
				String url = sc.next();
				ConnectionToData fetcher = new ConnectionToData(url,1);
				fetcher.readDataFromURL();
				System.out.println("Employees Information");
				System.out.println(fetcher.getEmployees());
				System.out.println("Rich Employee is");
				System.out.println(fetcher.getMaxSalariedEmployee());
				System.out.println("Total Number of Employees= "+fetcher.getTotalNumberOfEmployees()+"\n");
				break;
				
			case 3:
				System.out.println("ThankYou , Exiting");
				break;
			}
		}	
	}
}
