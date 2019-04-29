import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        int one = o1.getSuit();
        int two = o2.getSuit();
        if (one == two) {
            return o1.getValue() - o2.getValue();
        } else if (one < two) {
            return -1;
        } else {
            return 1;
        }
    }
}
