package ga222gb_lab3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();

    public Deck(){
        for(Card.Color c : Card.Color.values()){
            for(Card.Value v : Card.Value.values()){
                Card card = new Card(c, v);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        if(cards.size() == 52) {
            Collections.shuffle(cards);
        }else{
            System.out.println("There must be 52 cards in order to shuffle");
        }
    }

    public Card getCard(){
        Card c = cards.get(0);
        cards.remove(0);
        return c;
    }

    public String cardsLeft(){
        String cardsRemaining = "There are " + cards.size() + " cards left";
        return cardsRemaining;
    }

    public boolean play123(){
        int counter = 1;
        for(int i = 0; i < 52; i++){
            if(counter > 3){
                counter = 1;
            }
            Card c = getCard();
            if(c.getValue() == Card.Value.ace && counter == 1){
                return false;
            }else if(c.getValue() == Card.Value.two && counter == 2){
                return false;
            }else if(c.getValue() == Card.Value.three && counter == 3){
                return false;
            }
            counter++;
        }
        return true;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
