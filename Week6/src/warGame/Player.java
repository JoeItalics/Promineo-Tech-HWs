package warGame;

import java.util.List;

public class Player {
	
	private Deck hand;
	private int score = 0;
	private String name;
	
	public Player(String name, Deck hand) {
		this.hand = hand;
		this.name = name;
		
	}
	public void describe() {
		System.out.println("Player Name " + this.name + "\n" + "Player Points " + this.score);
		for(Card card : this.hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card flippedCard = this.hand.remove(0);
		return flippedCard;
	}

	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		drawnCard.describe();
		
		
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	public Deck getHand() {
		return hand;
	}
	public void setHand(Deck hand) {
		this.hand = hand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}

	
}
