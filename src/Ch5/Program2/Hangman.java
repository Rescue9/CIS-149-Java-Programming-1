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
	String remainingLetters;
	int guessesMade;
	int incorrectGuesses;
	
	public void initialize(String word){
		
		// set our counts to zero
		guessesMade = 0;
		incorrectGuesses = 0;
		
		// set word to lowercase to make it easier to deal with
		secretWord = word.toLowerCase();
		System.out.println(secretWord); // TODO comment out - used for testing
		
		// start the game
		System.out.println("Let\'s play a game of hangman.");
		System.out.println("We are playing hangman");
		System.out.println();
		System.out.println("The disguised word is <" + createDisguisedWord(word) + ">");
	}
	
	public String createDisguisedWord(String word){
		
		
		// make sord lowercase
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
	
	public void makeGuess(char c){
		
		System.out.println("Guess a letter");
		Scanner keyboard = new Scanner(System.in);
		
		String myGuess = keyboard.next();
		// TODO check to make sure that myGuess is only 1 character long.
		
		if (secretWord.contains(myGuess)){
			//TODO start revealing the disguisedWord
		}
	}
	
	public String getDisguisedWord(){
		return null;
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
