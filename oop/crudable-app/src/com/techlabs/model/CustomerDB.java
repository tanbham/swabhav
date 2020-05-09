package com.techlabs.model;

public class CustomerDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("Customer created");
		
	}

	@Override
	public void read() {
		System.out.println("Customer read");
		
	}

	@Override
	public void update() {
		System.out.println("Customer update");
		
	}

	@Override
	public void delete() {
		System.out.println("Customer delete");
		
	}

}
