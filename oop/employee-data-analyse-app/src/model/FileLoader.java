package model;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileLoader implements IDataAnalyzer{
	private String fileName;
	private Set<Employee> setOfEmployees = new HashSet<Employee>();
	
	public FileLoader(String fileName) throws Exception{
		this.fileName = fileName;	
	}
	
	public Set loadData() throws Exception {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		String inputLine;
		while(sc.hasNextLine()){
			inputLine = sc.nextLine();
			inputLine = inputLine.replaceAll(" ","");
        	inputLine = inputLine.replaceAll("'","");
        	String employeeData[] = inputLine.split(",");
        	Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
    		setOfEmployees.add(employee);
		}
		sc.close();
		return setOfEmployees;
	}

}
