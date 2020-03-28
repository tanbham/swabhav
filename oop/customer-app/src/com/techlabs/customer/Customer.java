package com.techlabs.customer;

public class Customer {
	private String name;
	private int order;
	private static String id;
	private static int count;
	
	static {
		id = "1000";
	}
	
	public Customer(String name , int order) {
		this.name = name;
		this.order = order;
		id = String.valueOf(Integer.valueOf(id)+1);
	}
	
	public String getName() {
		return name;
	}
	
	public int getOrder() {
		return order;
	}
	
	public String getId() {
		return "c"+id;
	}
}
