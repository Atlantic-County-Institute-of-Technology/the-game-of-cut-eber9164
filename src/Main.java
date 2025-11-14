import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Card card = new Card(1,13);
//        System.out.println(card);

        Deck deck = new Deck();
        deck.populateDeck();
        deck.shuffleDeck();
        System.out.println(deck);


        Scanner enterCard = new Scanner(System.in);  // Create Scanner
        System.out.println("Select a Card (Number Only): ");
        int userCard = enterCard.nextInt();  // Read user input
        Card selection = deck.selectCard(userCard);
        System.out.println(selection);

//        Card ran_selection = deck.selectCard(shuffler);
//        System.out.println(ran_selection);

        
//        System.out.println("Card is " + selectCard);
    }

}


