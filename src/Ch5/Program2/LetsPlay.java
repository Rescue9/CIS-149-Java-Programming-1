/*
 * Program: LetsPlay.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 25, 2012
 * Purpose: To play Hangman. Uses the Hangman class.
*/

package Ch5.Program2;

public class LetsPlay {
	
	public static void main(String[] args){
		
		// create Hangman object with name of game
		Hangman game = new Hangman();
		
		game.initialize("Happiness");
	}

}
