package cardgame;

/*
 * ========================
 * DO NOT MODIFY THIS FILE.
 * ========================
 */
import java.util.*;

/**
 * Represents an player's action on their turn: either they drew a card or they played a card.
 */
public class PlayerTurn {

    /**
     * The ID of the player that this action corresponds to
     */
    public int playerId;
    
    public List<Card> play_Cards=new ArrayList<>();
    public List<Card> Game_Deck=new ArrayList<>();

    /**
     * If the player drew a card on their turn
     */
    public boolean drewACard;

    /**
     * The card the player played on their turn, or null if the player didn't play a card.
     */
    public Card playedCard;
    public Card TopCard;

    /**
     * When a player plays an "8", they can declare what suit the next player must play to.
     * <p>
     * If the player played an "8", this is the suit that they declared. Otherwise, this is null.
     */
    public Card.Suit declaredSuit;

    // Convenience methods; you might or might not need these.

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayerTurn that = (PlayerTurn) o;
        return playerId == that.playerId &&
            drewACard == that.drewACard &&
            Objects.equals(playedCard, that.playedCard) &&
            declaredSuit == that.declaredSuit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, drewACard, playedCard, declaredSuit);
    }
    
    public void start_game(Players_Action player1,Players_Action player2, List<Card> Deck) {
    	
    	player1.TopCard=Deck.get(0);
    	Deck.remove(0);
    	System.out.println("\nTop Card :"+ player1.TopCard.getSuit()+" "+ player1.TopCard.getRank());
    	boolean flag1=true,flag2=true;
    	while(true) {
    		flag1=player1.play();
    		if(flag1==false) {
    			break;
    		}
    		else {
    			player2.TopCard=player1.TopCard;
    		}
    		flag2=player2.play();
    		if(flag2==false) {
    			break;
    		}
    		else {
    			player1.TopCard=player2.TopCard;
    		}
    	}
    	
    }
}
