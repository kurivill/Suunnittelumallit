import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        FibonacciSequence fbSequence = new FibonacciSequence(10);
        Iterator<Integer> iterator = fbSequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
