package warGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class GalacticWar {
	
	public static void main(String[] args) {
		new GalacticWar().play();
	}
	private void play() {
		Deck deck = new Deck();
		Player player1 = new Player("John", deck.shuffle());
		Player player2 = new Player("Marcus", deck.shuffle());
		
		deal(deck, player1, player2);
		
		
		
		
	}
	private void deal(Deck deck, Player player1, Player player2) {
		// TODO Auto-generated method stub
		for(int i = 0; i< deck.size(); i++) {
			int p1Value = player1.flip().getValue();
			int p2Value = player1.flip().getValue();
			if(p1Value > p2Value){
				player1.incrementScore();
			} else if(p1Value < p2Value){
				player2.incrementScore();
			}
		}
		int p1Score = player1.getScore();
		int p2Score = player2.getScore();
		System.out.println("Player 1 Score " + p1Score  + "\n" + "Player 2 Score " + p2Score);
		if(p1Score > p2Score) {
			System.out.println("Player 1 is the winner!");
		} else if( p1Score < p2Score) {
			System.out.println("Player 2 is the winner!");
		} else  if ( p1Score == p2Score){
			System.out.println("It's a Draw!");
		}
	}


}



