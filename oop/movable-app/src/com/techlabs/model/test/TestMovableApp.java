package com.techlabs.model.test;

import com.techlabs.model.Bike;
import com.techlabs.model.Car;
import com.techlabs.model.IMoveable;
import com.techlabs.model.Truck;

public class TestMovableApp {
	public static void main(String args[]) {
		IMoveable [] moves = new IMoveable[3];
		moves[0] = new Car();
		moves[1] = new Bike();
		moves[2] = new Truck();
		
		startRace(moves);
	}

	private static void startRace(IMoveable[] moveables) {
		for(IMoveable obj : moveables) {
			obj.move();
		}
		
	}
}
