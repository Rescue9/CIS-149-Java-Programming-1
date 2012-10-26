/*
 * Program: Hangman.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 25, 2012
 * Purpose: To serve as the working class for the hangman program
*/

package Ch5.Program2;

import java.util.Scanner;

public class Hangman {
	
	String secretWord;
	String disguisedWord;
	String myGuess;
	char guessChar;
	int guessesMade;
	int incorrectGuesses;
	
	/**
	 * Precondition: 	User runs LetsPlay. 
	 * @param word 		is the secretWord
	 */
	public void initialize(String word){
		
		// set our counts to zero
		guessesMade = 0;
		incorrectGuesses = 0;
		
		// set word to lowercase to make it easier to deal with
		secretWord = word.toLowerCase();
		// System.out.println(secretWord); // remove - used for testing
		
		// start the game
		System.out.println("Let\'s play a game of hangman.");
		System.out.println("We are playing hangman");
		System.out.println();
		System.out.println("The disguised word is <" + createDisguisedWord(word) + ">");
		
	}
	
	/**
	 * Precondition: 	The secretWord has been established
	 * @param word
	 * @return
	 */
	public String createDisguisedWord(String word){
		
		
		// make word lowercase
		word = word.toLowerCase();
		
		// change disguisedWord characters to ?
		word = word.replace('a', '?');word = word.replace('n', '?');
		word = word.replace('b', '?');word = word.replace('o', '?');
		word = word.replace('c', '?');word = word.replace('p', '?');
		word = word.replace('d', '?');word = word.replace('q', '?');
		word = word.replace('e', '?');word = word.replace('r', '?');
		word = word.replace('f', '?');word = word.replace('s', '?');
		word = word.replace('g', '?');word = word.replace('t', '?');
		word = word.replace('h', '?');word = word.replace('u', '?');
		word = word.replace('i', '?');word = word.replace('v', '?');
		word = word.replace('j', '?');word = word.replace('w', '?');
		word = word.replace('k', '?');word = word.replace('x', '?');
		word = word.replace('l', '?');word = word.replace('y', '?');
		word = word.replace('m', '?');word = word.replace('z', '?');
		
		// set disguisedWord to value of word
		disguisedWord = word;
		return disguisedWord;
	}
	
	/**
	 * Precondition:	disguisedWord is established
	 * @return			will return the guessed character
	 */
	public char makeGuess(){
		
		System.out.println("Guess a letter");
		Scanner keyboard = new Scanner(System.in);
		
		myGuess = keyboard.next();
		while (myGuess.length() > 1){
			System.out.println("You entered more than one character. Try again.");
			myGuess = keyboard.next();
		}
		
		// swap string for char & set lowercase
		guessChar = myGuess.toLowerCase().charAt(0);
		// System.out.println(guessChar); // remove - used for testing
		return guessChar;
	}
	
	/**
	 * Precondition:	guessed character has been established
	 * @param guess		the guessed character
	 */
	public void checkGuess(char guess){
		
		String checkingWord = "";
		// check to see if letter guessed already
		if (disguisedWord.indexOf(guess) != -1){
			System.out.println("The letter has already been guessed");
			return;
		}
		guessesMade++;	
		for (int i =0; i < secretWord.length(); i++){
			
			if (secretWord.charAt(i) == guess){
				checkingWord = checkingWord + secretWord.charAt(i);
				// System.out.println(checkingWord); // remove - used for testing
				
			} else {
				checkingWord = checkingWord + disguisedWord.charAt(i);
				// System.out.println(checkingWord); // remove - used for testing
			}
		}
		if (disguisedWord.equals(checkingWord)){
			incorrectGuesses++;
		}
		
		System.out.println("Guess made " + getGuessCount() + " with " + incorrectGuesses + " wrong.");
		
		disguisedWord = checkingWord;
		System.out.println("The disguised word is<" + disguisedWord + ">");
		
	}
	
	/**
	 * Precondition:	secretWord & disguisedWord hve both been established.
	 */
	public void checkWin(){
		if (disguisedWord.equalsIgnoreCase(secretWord)){
			System.out.println("Congratulations, you found the secret word: " + getSecretWord());
		}
	}
	
	
	
	public String getSecretWord(){
		return secretWord;
	}

	public int getGuessCount(){
		return guessesMade;
	}
	
	public String getDisguisedWord(){
		return disguisedWord;
	}
	

}
