package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class UrlLoader implements IDataAnalyzer{
	private URL oracle;
	private Set<Employee> setOfEmployees = new HashSet<Employee>();
	
	public UrlLoader(String url) throws Exception{
		oracle = new URL(url);
	}
	
	@Override
	public Set loadData() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	inputLine = inputLine.replaceAll(" ","");
        	inputLine = inputLine.replaceAll("'","");
        	String employeeData[] = inputLine.split(",");
        	Employee employee = new Employee(employeeData[0],employeeData[1],employeeData[2],employeeData[3],employeeData[4],employeeData[5],employeeData[6],employeeData[7]);
    		setOfEmployees.add(employee);
        } 
        in.close();
		return setOfEmployees;
	}
}
