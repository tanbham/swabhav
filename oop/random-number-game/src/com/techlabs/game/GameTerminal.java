package com.techlabs.game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameTerminal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Game newgame = null;
		int guess = 0;
		int choice = 0;
		System.out.println("1 : Start Game");
		
		
		while(choice != 4) {
			System.out.println("2 : Restart game");
			System.out.println("3 : See your guesses");
			System.out.println("4 : End Game");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 2 :
				
			case 1 :
				newgame = new Game();
				newgame.generateRandomNumber();
				do {
					System.out.println("Enter your guess");
					guess = sc.nextInt();
					if(!newgame.analayseGuess(guess)){
						String s = (guess < newgame.getRandomNumber()) ? "Too small" : "Too Big";
						System.out.println(s);
					}
				}while(guess != newgame.getRandomNumber());
				System.out.println("Win WIn , Correct Choice");
				break;
	
			case 3:
				System.out.println("All guesses are");
				ArrayList<Integer> list = newgame.displayAllGuesses();
				for(int i : list) {
					System.out.println(i);
				}
				break;
				
			case 4 :
				System.out.println("Game ended");
				break;
			}	
		}	
	}
}
