
import java.util.Random;

public class Deck {
    private final int decklength = 52; //placeholder
    private Card[] deck;
    private final Random shuffler; // randomizer (look up and redo)

    public Deck() {
        deck = new Card[decklength];  // <- change to how many cards you can get a deck later
        shuffler = new Random();
    }

    public void populateDeck(){
        int idx = 0;
        for(int face = 1; face <= 13; face++){
            for(int suit = 1; suit <= 4; suit++){
                deck[idx] = new Card(suit, face);
                idx++;
                // Populate/makes each card unique. makes each card (figure out different word to make less confusing
            }
        }

    }
    public void shuffleDeck(){
        for(int i = 0; i < deck.length; i++){ // continues until reaches deck.length so the amount of cards = deck length
            Card temp = deck[i];
            int newPos = shuffler.nextInt(decklength);
            deck[i] = deck[newPos];
            deck[newPos] = temp;
            // uses the randomizer to shuffle deck
            //
        }
    }

    public String toString(){
        String strDeck = "";
        for(int i = 0; i < decklength; i++)
        {
            strDeck += deck[i].toString() + "\n";
        }
        return strDeck;
        // returns all of the deck (without copies)
    }

    public Card selectCard(int index) {  //Shows the card the user inputs by the number
        // return a card at the specific index
        // the index is valid
        index = index - 1; // makes 1-52 instead of 0-51
        return deck[index];
    }




//    strDeck
//    Scanner userCard



        //    Almost Everything below was copied from board, figure out how to use in my code

//    public class arrDeck(){
//        public String toString() {
//            strDeck += deck[1].toString() + "\n";
//        }
//            return strDeck;
//    }
//
//    public Card selectCard(int target) {
//        return deck[target];
//    }
//
//    public int getDeckSize() {
//        return decklength;
//    }

//    return faces[face] + "of" + suits[suit];
//    private Card[] deck = new Card[52];
//    for(){
//        for(){
//
//        }
//    }
//    deck[i] = new Card(face, suit)

}
