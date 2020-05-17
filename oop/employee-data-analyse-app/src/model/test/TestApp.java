package model.test;

import model.DataAnalyzer;
import model.FileLoader;
import model.UrlLoader;

//file = dataFile_emp.txt
//url = https://swabhav-tech.firebaseapp.com/emp.txt
public class TestApp {
	public static void main(String args[]) throws Exception{
		DataAnalyzer analyz = new DataAnalyzer(new FileLoader("dataFile_emp.txt"));
		System.out.println("Maximum Salaried Employee is");
	    System.out.println(analyz.getMaxSalariedEmp());
		System.out.println("Designation wise total number of employees");
		System.out.println(analyz.getDesignationWiseEmps()+"\n");
		
		DataAnalyzer analyze = new DataAnalyzer(new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		System.out.println("Maximum Salaried Employee is");
	    System.out.println(analyze.getMaxSalariedEmp());
		System.out.println("Designation wise total number of employees");
		System.out.println(analyze.getDesignationWiseEmps());
		
	}
}
