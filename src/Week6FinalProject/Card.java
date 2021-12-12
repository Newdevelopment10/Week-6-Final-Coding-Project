package Week6FinalProject;

public class Card {

	private int cardValue;
	
	private String cardName;
		
		
	public int getCardValue() {
		return cardValue;
	}
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String describe() {
		return "This is the " + cardValue + " of " + cardName;
	}
	
	
}
