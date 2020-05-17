package com.techlabs.model;

import java.util.ArrayList;
import java.util.UUID;

public class Customer {
	private UUID id;
	private String name;
	private String address;
	ArrayList<Order> orders = new ArrayList<Order>();
	
	public Customer(UUID uuid, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}
	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public ArrayList<Order> getOrderDetails() {
		return orders;
	}
}
