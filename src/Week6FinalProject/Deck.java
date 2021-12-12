package Week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
//  My deck, and it references class Card with values and names
	private static List<Card> cards = new ArrayList<Card>();

	public Deck() {
//  Created card names and values using a Map for the card values (key = card value
//  and value = card name)
		Map<Integer, String> suitValues= new HashMap<Integer, String>();
		suitValues.put(2, "Two");
		suitValues.put(3, "Three");
		suitValues.put(4, "Four");
		suitValues.put(5, "Five");
		suitValues.put(6, "Six");
		suitValues.put(7, "Seven");
		suitValues.put(8, "Eight");
		suitValues.put(9, "Nine");
		suitValues.put(10, "Ten");
		suitValues.put(11, "Jack");
		suitValues.put(12, "Queen");
		suitValues.put(13, "King");
		suitValues.put(14, "Ace");

//  Created card suits
		List<String> suits = new ArrayList<String>();
		suits.add("Hearts");
		suits.add("Diamonds");
		suits.add("Spades");
		suits.add("Clovers");

//  Created for loops for all the possible values of a standard card deck
//  for every suit (spades, clovers, hearts, diamonds)
		for(int i = 2; i <= 14; i++) {
			 Card warCard = new Card();
			 warCard.setCardValue(i);
			 warCard.setCardName(suits.get(0));
			 cards.add(warCard);
		}
		for(int i = 2; i <= 14; i++) {
			 Card warCard = new Card();
			 warCard.setCardValue(i);
			 warCard.setCardName(suits.get(1));
			 cards.add(warCard);
		}
		for(int i = 2; i <= 14; i++) {
			 Card warCard = new Card();
			 warCard.setCardValue(i);
			 warCard.setCardName(suits.get(2));
			 cards.add(warCard);
		}
		for(int i = 2; i <= 14; i++) {
			 Card warCard = new Card();
			 warCard.setCardValue(i);
			 warCard.setCardName(suits.get(3));
			 cards.add(warCard);
		}
	}
//  Shuffles cards every round of game	
	public static void shuffle(){
		Collections.shuffle(cards);
		
	}
//  Draws from List named cards that's referencing the cards
//  in the Card class; the top card is removed from the deck
	public Card draw() {
		
		return cards.remove(0);
	}
//  Refers to size of deck
	public int size() {
		return cards.size();
	}
	
}
