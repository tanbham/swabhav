package com.techlabs.customer;

public class Customer {
	private String name;
	private int order;
	private String id = "1001";
	private static int count;
	
	static {
		count = 0;
	}
	
	public Customer(String name , int order) {
		this.name = name;
		this.order = order;
		id = String.valueOf(Integer.valueOf(id)+count);
		count++;
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
