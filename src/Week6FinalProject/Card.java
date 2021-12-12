package Week6FinalProject;

public class Card {

//  Fields (instance variables) that will be used when playing
//  the game
	private int cardValue;
	private String cardName;
		
//  Retrieves value of card played		
	public int getCardValue() {
		return cardValue;
	}
//  Sets card value
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
//  Retrieves card name	
	public String getCardName() {
		return cardName;
	}
//  Sets card name	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
//  Method that describes cards, both value and name
	public String describe() {
		return "This is the " + cardValue + " of " + cardName;
	}
}
