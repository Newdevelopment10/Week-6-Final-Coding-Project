package Week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	int score; 
	String playerName;

	public Player(String playerName) {
		score = 0;
		this.playerName = playerName;
	}
	
	
	public void describe(Card warCard) {
		System.out.println(this.playerName + " is playing the " + warCard.describe());
		
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {
		return hand.remove(0);
		
	}
	
	public Integer incrementScore(){
		return this.score += 1;
		
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getScore() {
		return score;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerName() {
		return playerName;
	}

	}
