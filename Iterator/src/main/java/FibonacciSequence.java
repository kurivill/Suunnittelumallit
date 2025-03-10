import java.util.Iterator;

public class FibonacciSequence implements Sequence {

    private final int size;

    public FibonacciSequence(int size) {
        this.size = size;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(size);
    }
}
