package com.techlabs.game;

import java.util.ArrayList;
import java.util.Scanner;

public class GameTerminal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String result = "";
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
				do {
					System.out.println("Enter your guess");
					guess = sc.nextInt();
					result = newgame.analayseGuess(guess);
					System.out.println(result);
				}
				while(!result.equalsIgnoreCase("Correct guess"));
				System.out.println("Score is = "+newgame.getScore());
				break;
	
			case 3:
				System.out.println("All guesses are");
				ArrayList<Integer> list = newgame.getAllGuesses();
				for(int i : list) {
					System.out.println(i);
				}
				System.out.println("Total number of guesses are = "+newgame.getTotalGuessCount());
				break;
				
			case 4 :
				System.out.println("Game ended");
				break;
			}	
		}	
	}
}
