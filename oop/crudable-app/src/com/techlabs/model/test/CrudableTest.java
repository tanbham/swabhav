package com.techlabs.model.test;

import com.techlabs.model.AddressDB;
import com.techlabs.model.CustomerDB;
import com.techlabs.model.Database;
import com.techlabs.model.OrderDB;

public class CrudableTest {
	public static void main(String args[]) {
		Database db = new Database();
		db.doDBOperations(new AddressDB());
		db.doDBOperations(new CustomerDB());
		db.doDBOperations(new OrderDB());
		
	}
}
