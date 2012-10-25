/*
 * Program: Hangman.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 25, 2012
 * Purpose: To serve as the working class for the hangman program
*/

package Ch5.Program2;

public class Hangman {
	
	String secretWord;
	String disguisedWord;
	String remainingLetters;
	int guessesMade;
	int incorrectGuesses;
	
	public void initialize(String word){
		
		// set our counts to zero
		guessesMade = 0;
		incorrectGuesses = 0;
		
		// set word to lowercase to make it easier to deal with
		secretWord = word.toLowerCase();
		System.out.println(secretWord); // used for testing
	}
	
	public void makeGuess(char c){

	}
	
	public String getDisguisedWord(){
		
	}
	
	public String getSecretWord(){
		return secretWord;
	}
	
	public void isFound(){
		System.out.println("Congratulations, you found the secret word " + secretWord);
		System.out.println();
		
	}
	public int getGuessCount(){
		return guessesMade;
	}
	

}
