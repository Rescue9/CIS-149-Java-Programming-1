/*
 * Program: LetsPlay.java
 * Programmer: Andrew Buskov
 * Class: CIS 149
 * Date: Oct 25, 2012
 * Purpose: To play Hangman. Uses the Hangman class.
*/

package Ch5.Program2;


public class LetsPlay {
	
	 static Hangman game = new Hangman();

	
	public static void main(String[] args){
		
		// create Hangman object with name of game
		game.initialize("Happiness");
		
		while (!game.getSecretWord().equalsIgnoreCase(game.getDisguisedWord())){
		
		char guessChar = game.makeGuess();
		game.checkGuess(guessChar);
		game.checkWin();
		}
	
	}

}
