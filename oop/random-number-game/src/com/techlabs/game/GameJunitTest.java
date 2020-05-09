package com.techlabs.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameJunitTest {
	
	Game newGame = new Game();

	@Test
	public void test_return_TotalGuessCount_as_1_after_a_correctGuess_in_firstAttempt() {
		newGame.analayseGuess(newGame.getRandomNumber());
		int expectedCount = 1;
		int actualCount= newGame.getTotalGuessCount();
		
		assertEquals(expectedCount , actualCount);
	}

	@Test
	public void test_return_CorrectMessage_string_after_guessing_correct_guess() {
		String expectedMessage = "Correct Guess";
		String actualMessage = newGame.analayseGuess(newGame.getRandomNumber());
		
		assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	public void test_return_TooLarge_string_after_guessing_a_guess_greater_than_correctGuess() {
		String expectedMessage = "Too Large";
		String actualMessage = newGame.analayseGuess(newGame.getRandomNumber()+1);
		
		assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	public void test_return_TooSmall_string_after_guessing_a_guess_smaller_than_correctGuess() {
		String expectedMessage = "Too Small";
		String actualMessage = newGame.analayseGuess(newGame.getRandomNumber()-1);
		
		assertEquals(expectedMessage, actualMessage);
	}

	@Test
	public void test_return_100_score_after_correctGuess() {
		newGame.analayseGuess(newGame.getRandomNumber());
		int expectedScore = 100;
		int actualScore = newGame.getScore();
		
		assertEquals(expectedScore, actualScore);	
	}

}
