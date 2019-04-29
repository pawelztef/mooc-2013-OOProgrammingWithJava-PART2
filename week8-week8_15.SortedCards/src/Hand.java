import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
       this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for(Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
       Collections.sort(this.cards);
    }
    public void sortAgainstSuit() { Collections.sort(this.cards, new SortAgainstSuitAndValue());}

    @Override
    public int compareTo(Hand o) {
        int one = 0, two = 0;
        for(Card c : cards) {
            one += c.getValue();
        }
        for (Card c : o.cards) {
            two += c.getValue();
        }
        return one - two;
    }
}


