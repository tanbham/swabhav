package model;

import java.io.File;
import java.util.Scanner;

public class FileDataReader implements IDataReader{
	private String fileName;
	private File file;
	
	public FileDataReader(String fileName){
		this.fileName = fileName;
		
	}
	
	public void readData() throws Exception {
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

	private void storeNewEmployees(String[] employeeData) {
		Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
		setOfEmployees.add(employee);
	}

}
