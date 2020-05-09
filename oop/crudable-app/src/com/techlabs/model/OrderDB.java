package com.techlabs.model;

public class OrderDB implements ICrudable{
	
	@Override
	public void create() {
		System.out.println("Order created");
		
	}

	@Override
	public void read() {
		System.out.println("Order read");
		
	}

	@Override
	public void update() {
		System.out.println("Order update");
		
	}

	@Override
	public void delete() {
		System.out.println("Order delete");
		
	}

}
