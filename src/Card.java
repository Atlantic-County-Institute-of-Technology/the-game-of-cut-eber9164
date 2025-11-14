public class Card {

    private final String[] faces = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {null, "Spades", "Hearts", "Clubs", "Diamonds"};

    private final int face;
    private final int suit;

    public Card(int suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    public String getFace(){
        return faces[face];
    }

    public String getSuit(){
        return suits[suit];
    }

    public String toString() {
        return faces[face] + " of " + suits[suit];
    }





    //    return faces[face] + "of" + suits[suit];
//    private Card[] deck = new Card[52];
//    for(){
//        for(){
//
//        }
//    }
//    deck[i] = new Card(face, suit)


//    public class Main {
//        public static void main(String[] args) {
//
//            arrDeck deck = new arrDeck();
//            deck.populateDeck();
//
//
//        }
//
//
//    }
}
