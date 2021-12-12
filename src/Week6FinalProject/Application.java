package Week6FinalProject;

public class Application {
	
	public static void main(String[] args) {
		
//  Instances of the two players for this WAR game
		Player playerOne = new Player("Mark");
		Player playerTwo = new Player("Michelle");
		
//  Instance of Deck from Deck class
		Deck deck = new Deck();
		
//  Will shuffle cards in ArrayList named cards in class Deck
		Deck.shuffle();

//  Loop that iterates 52 times, simulating the length of a deck
//  of cards. Each player draws from deck; if deck count is even,
//  player 1 will draw. Otherwise, player two draws from the deck.
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
			playerOne.draw(deck);
			}
			else {
			playerTwo.draw(deck);
		}
		}
		
//  Loop that iterates 26 times, simulating the length of the game.
//  After each players draws a card, then players flip their cards,
//  and each card value is shown. Whoever has the highest card wins 
//  the match and their score increases.
		for(int i = 0; i < 26; i++) {
			int value1 = playerOne.flip().getCardValue();
			int value2 = playerTwo.flip().getCardValue();
			
			if(value1 > value2) {
				playerOne.incrementScore();	
			}
			else {
				playerTwo.incrementScore();
			}
		}
		
//  Displays scores of each player
		playerOne.getScore();
		playerTwo.getScore();
		
		System.out.println(playerOne.getScore());
		System.out.println(playerTwo.getScore());
		
//  Declaration of the winner based on final scores
		if(playerOne.getScore() > playerTwo.getScore()) {
		System.out.println("Player One is the winner!");
		}
		else if (playerTwo.getScore() > playerOne.getScore()) {
		System.out.println("Player Two is the winner!");
		}
		else {
			System.out.println("It's a draw...");
		}
	}
}	
	

