package com.techlabs.customer;

public class Customer {
	private String name;
	private int order;
	private String id = "c";
	private static int nextId;
	
	static {
		nextId = 1001;
	}
	
	public Customer(String name , int order) {
		this.name = name;
		this.order = order;
		id = id + nextId;
		nextId++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getOrder() {
		return order;
	}
	
	public String getId() {
		return id;
	}
}
