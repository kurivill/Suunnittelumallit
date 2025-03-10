import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int count;
    private final int size;
    private int previous = 0;
    private int current = 1;

    // Päätin säilyttää tiedon aikaisemmista luvuista tässä luokassa, koska mielestäni tämä on luonteva paikka niille.
    // Koska seuraava luku lasketaan aina edellisten lukujen perusteella tässä luokassa, mielestäni niistä voidaan pitää
    // kirjaa tässä luokassa.
    // Tämä mahdollistaa useamman itsenäisen iteraattorin luomisen. Ja FibonacciSequence on nyt hyvin yksinkertainen.

    // Arvojen säilyttäminen Sequence-luokassa olisi järkevää, mikäli tehtäisiin uusi iteraattori, ja sen haluttaisiin
    // jatkavan siitä, mihin ensimmäinen iteraattori lopetti.

    public FibonacciIterator(int size) {
        this.size = size;
        this.count = 0;
        this.previous = 0;
        this.current = 1;
    }

    @Override
    public boolean hasNext() {
        return count < size;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the sequence");
        }
        int nextFib;
        if (count == 0) {
            nextFib = 1;
        } else {
            nextFib = previous + current;
            previous = current;
            current = nextFib;
        }
        count++;
        return nextFib;
    }
}
