package com.techlabs.game;

import java.util.ArrayList;

public class Game {
	private int countOfGuesses;
	private int randomNumber;
	ArrayList<Integer> listOfGuesses = new ArrayList<Integer>();
	
	public Game() {
		countOfGuesses = 0;
		randomNumber = (int)(Math.random()*100);
		System.out.println(randomNumber);
	}
	
	public int getTotalGuessCount() {
		return countOfGuesses;
	}
	
	public ArrayList<Integer> getAllGuesses(){
		return listOfGuesses;
	}
	
	public String analayseGuess(int number) {
		countOfGuesses++;
		listOfGuesses.add(number);
		
		if(number == randomNumber) {
			return "Correct Guess";
		}
		else if(number > randomNumber){
			return "Too Large";
		}
		else {
			return "Too Small";
		}
	}
	
	public void exitGame() {
		System.out.println("Game End");
	}
	
	public int getScore() {
		if(countOfGuesses == 1) {
			return 100;
		}
		else if(countOfGuesses >= 2 && countOfGuesses <= 10){
			return 100 - (countOfGuesses-1)*10;
		}
		else {
			return 5;
		}
	}
	
	public int getRandomNumber() {
		return randomNumber;
	}
}
