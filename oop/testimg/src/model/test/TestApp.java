package model.test;

import java.util.Scanner;

import model.EmployeeDetails;
import model.FileDataReader;
import model.UrlDataReader;

//file = dataFile_emp.txt
//url = https://swabhav-tech.firebaseapp.com/emp.txt
public class TestApp {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		while(option != 3){
			System.out.println("Press 1 to read data from file");
			System.out.println("Press 2 to read data from URL");
			System.out.println("Press 3 to exit");
			System.out.println("Enter your choice");
			option = sc.nextInt();
			
			switch(option){
			case 1:
				EmployeeDetails employee = new EmployeeDetails();
				FileDataReader read = new FileDataReader("dataFile_emp.txt");
				read.readData();
				System.out.println("Employee details are");
				System.out.println(employee.getEmployees());
				System.out.println("Total no. of Employees = "+employee.getTotalNumberOfEmployees());
				System.out.println("Maximum Salaried Employee is");
				System.out.println(employee.getMaxSalariedEmployee());
				break;
				
			case 2:
				EmployeeDetails employee1 = new EmployeeDetails();
				UrlDataReader read1 = new UrlDataReader("https://swabhav-tech.firebaseapp.com/emp.txt");
				read1.readData();
				System.out.println("Employee details are");
				System.out.println(employee1.getEmployees());
				System.out.println("Total no. of Employees = "+employee1.getTotalNumberOfEmployees());
				System.out.println("Maximum Salaried Employee is");
				System.out.println(employee1.getMaxSalariedEmployee());
				break;
				
			case 3:
				System.out.println("Exiting");
			}
			
		}
	}
}
