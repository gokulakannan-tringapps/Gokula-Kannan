package cardgame;
import java.util.*;
public class Players_Action extends PlayerTurn {
				
				
				Players_Action(List<Card> deck,int id){
					
					playerId=id;
					for(int i=0;i<7;i++) {
						play_Cards.add(deck.get(0));
						deck.remove(0);
					}
					for(int i=0;i<7;i++) {
						System.out.print(play_Cards.get(i).getSuit()+" "+play_Cards.get(i).getRank()+", ");
					}
				}
				
				public boolean play() {
					
					for(int i=0;i<this.play_Cards.size();i++) {
						if(this.play_Cards.get(i).getSuit().equals(this.TopCard.getSuit()) || this.play_Cards.get(i).getRank().equals(this.TopCard.getRank())) {
										this.TopCard=this.play_Cards.get(i);
										System.out.println("Player "+this.playerId+" Turns.."+this.TopCard.getSuit()+" "+this.TopCard.getRank());
										this.play_Cards.remove(i);
										return true;
						}
					}
					return false;
					
				}
				
				public void drawFromdeck() {
					
				}
}
