package Week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
//  Creating an instance of Card as an object (List) for Player class; also some fields 	
	List<Card> hand = new ArrayList<Card>();
	int score; 
	String playerName;

	public Player(String playerName) {
		score = 0;
		this.playerName = playerName;
	}
	
//  describes the cards being played
	public void describe(Card warCard) {
		System.out.println(this.playerName + " is playing the " + warCard.describe());
		
	}
//  Calls on the draw method from Deck. Allows the player to draw from the deck essentially
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
//  Player flips their card then top card is removed	
	public Card flip() {
		return hand.remove(0);
		
	}
//  Scores of players are incremented
	public Integer incrementScore(){
		return this.score += 1;
		
	}
//  Getters and setters for players; getScore will be useful when retrieving
//  final scores of a hand
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
