package com.techlabs.game;

import java.util.ArrayList;

public class Game {
	int countOfGuesses = 0;
	ArrayList<Integer> list = new ArrayList<Integer>();
	int randomNumber = 0;
	
	public int generateRandomNumber() {
		randomNumber = (int)(Math.random()*100);
		return randomNumber;
	}
	
	public ArrayList<Integer> displayAllGuesses(){
		return list;
	}
	
	public void incrementGuess() {
		countOfGuesses++;
	}
	
	public boolean analayseGuess(int number) {
		list.add(number);
		if(number == randomNumber) {
			return true;
		}else {
			return false;
		}
	}
	

	public void exitGame() {
		System.out.println("Game End");
	}

	public int getRandomNumber() {
		return randomNumber;
	}
}
