package cardgame;
import java.util.*;
public class Game_Engine  extends PlayerTurn{
		
	
	public static void main(String[] args) {
			
			List<Card> random_Deck=new ArrayList<>();
			random_Deck=Card.getDeck();
			Collections.shuffle(random_Deck);
			
			System.out.println("Player 1 Decks....");
			Players_Action player1=new Players_Action(random_Deck, 1);
			
			System.out.println("\nPlayer 2 Decks....");
			
			Players_Action player2=new Players_Action(random_Deck, 2);
			
		/*	System.out.println("\nRemaining cards");
			for(int i=0;i<random_Deck.size();i++) {
				System.out.println(random_Deck.get(i).getSuit()+" "+random_Deck.get(i).getRank());
			
			}*/
			
			Game_Engine start=new Game_Engine();
			start.start_game(player1,player2,random_Deck);
			
			
			
	}
}
