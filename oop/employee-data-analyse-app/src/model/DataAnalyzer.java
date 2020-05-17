package model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DataAnalyzer{
	private IDataAnalyzer loader;
	private HashMap<String , Integer> designationMap = new HashMap<String, Integer>();
	private HashMap<Integer , Integer> departmentMap = new HashMap<Integer, Integer>();
	
	public DataAnalyzer(IDataAnalyzer loader) {
		this.loader = loader;
	}
	
	public HashMap<String ,Integer> getDesignationWiseEmps() throws Exception{
		int count = 0;
		Set<Employee> setOfEmployees = loader.loadData();
		for(Employee employee : setOfEmployees) {
			if(!designationMap.containsKey(employee.getDesignation())) {
				designationMap.put(employee.getDesignation(), 1);
			}
			else {
				count = designationMap.get(employee.getDesignation());
				count = count+ 1;
				designationMap.put(employee.getDesignation(), count);
			}
		}
		return designationMap;
		
	}
	
	public Employee getMaxSalariedEmp() throws Exception {
		Employee richEmployee = null;
		double maxSalary = 0;
		Set<Employee> setOfEmployees = loader.loadData();
		for(Employee employee : setOfEmployees){
			if(employee.getSalary() > maxSalary){
				maxSalary = employee.getSalary();
				richEmployee = employee;
			}
		}
		return richEmployee;
	}
}
