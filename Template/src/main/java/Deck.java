import java.util.ArrayList;
import java.util.Random;

public class Deck {

     private ArrayList<Integer> cards;
     private Random rng;

     public Deck() {
         this.cards = new ArrayList<Integer>();
         rng = new Random();
         reset();
     }

    public void reset() {
        cards.clear(); // Clear existing cards
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(i);
            }
        }
    }

     public int drawCard() {
         if (cards.isEmpty()) {
             reset();
         }
         return cards.remove(rng.nextInt(cards.size()));

     }




}
