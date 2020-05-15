package model;

import java.util.HashSet;

public interface IDataReader {
	HashSet<Employee> setOfEmployees = new HashSet<Employee>();
	void readData() throws Exception;
}
