package Week6FinalProject;

public class Application {
	
	public static void main(String[] args) {
		
		//Instances of the two players for this WAR game
		Player playerOne = new Player("Mark");
		Player playerTwo = new Player("Michelle");
		
		//Instance of Deck from Deck class
		Deck deck = new Deck();
		
		// Will shuffle cards in ArrayList named cards in class Deck
		Deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			playerOne.draw(deck);
			playerTwo.draw(deck);
		}
		
//		for(int i = 0; i < 26; i++) {
//			int value1 = playerOne.flip().getCardValue();
//			int value2 = playerTwo.flip().getCardValue();
//			
//			if(value1 > value2) {
//				playerOne.incrementScore();	
//			}
//			else {
//				playerTwo.incrementScore();
//			}
//			playerOne.getScore();
//			playerTwo.getScore();
//			
//		System.out.println(playerOne.getScore());
//		System.out.println(playerTwo.getScore());
		
		
		
		
		
		}
		
}	
	

