package warGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Deck extends LinkedList<Card>{
	private List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	private List<String> names = List.of("clubs", "Diamonds", "Hearts", "Spades");

	public Deck() {
		for(int i = 0; i<numbers.size(); i++) {
			int value = numbers.get(i);
			for (String name : names) {
				this.add(new Card(name, value));
			}
		}
	}
	
	public Deck shuffle() {
		Random random = new Random();
		List<Card> temp = new LinkedList<>(this);
		this.clear();
		while(!temp.isEmpty()) {
			int pos = random.nextInt(temp.size());
			this.add(temp.remove(pos));
		}
		return this;
		
	}
	
	
	public Card draw() {
		Card drawnCard = this.remove(0);
		return drawnCard;
	}
	
	public void cards() {
		for(Card card : this) {
			card.describe();
		}
		
	}


	
}

