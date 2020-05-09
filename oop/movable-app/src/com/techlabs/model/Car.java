package com.techlabs.model;

public class Car implements IMoveable{

	@Override
	public void move() {
		System.out.println("Car is moving");
	}
}
