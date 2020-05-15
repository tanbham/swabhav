package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDataReader implements IDataReader{
	private URL oracle;
	
	public UrlDataReader(String url) throws Exception{
		oracle = new URL(url);
	}
	
	public void readData() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	inputLine = inputLine.replaceAll(" ","");
        	inputLine = inputLine.replaceAll("'","");
        	String employeeData[] = inputLine.split(",");
        	storeNewEmployees(employeeData);
        } 
        in.close();
	}

	private void storeNewEmployees(String[] employeeData) {
		Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
		setOfEmployees.add(employee);
	}

}
