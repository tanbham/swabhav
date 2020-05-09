package com.techlabs.model.test;

import com.techlabs.model.Bark;
import com.techlabs.model.BarkRecognizer;
import com.techlabs.model.DogDoor;
import com.techlabs.model.Remote;

public class DogDoorSimulator {
	public static void main(String args[]) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowfl"));
		door.addAllowedBark(new Bark("rooowfl"));
		door.addAllowedBark(new Bark("rawfl"));
		door.addAllowedBark(new Bark("woof"));
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks at door...");
		recognizer.recognize(new Bark("rowfl"));
		
		System.out.println("\nFiddo has gone outside....");
		
		try {
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e) {}
		
		System.out.println("\nFiddo is all done.....");
		System.out.println("...but he's stuck outside!");
		
		//simulate the hardware hearing a bark(random dog)
		Bark smallDogBark = new Bark("Yip");
		System.out.println("A small dog starts barking");
		recognizer.recognize(smallDogBark);
		
		try {
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e) {}
		
		System.out.println("Fiddo starts barking");
		recognizer.recognize(new Bark("rooowfl"));
		
		System.out.println("\nFiddo is back inside....");
	}
}
