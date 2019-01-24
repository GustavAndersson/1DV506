package ga222gb_lab3;

public class DeckMain {

    public static void main(String[] args){

        Deck d = new Deck(); //Create a deck of cards
        d.shuffle(); //Shuffle the deck of cards

        Card c = d.getCard(); //Get a card
        Card c1 = d.getCard();
        Card c2 = d.getCard();

        System.out.println(c.getColor() + " " + c.getValue()); //printout which card
        System.out.println(c1.getColor() + " " + c1.getValue());
        System.out.println(c2.getColor() + " " + c2.getValue());

        System.out.println(d.cardsLeft()); //print out how many cards there are left ==> 49

    }
}
