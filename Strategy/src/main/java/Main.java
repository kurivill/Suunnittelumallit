import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rng = new Random();

        int[] arrSmall = new int[100];
        int[] arrLarge = new int[100000];

        for (int i = 0; i < arrSmall.length; i++) {
            arrSmall[i] = rng.nextInt(100);
        }
        for (int i = 0; i < arrLarge.length; i++) {
            arrLarge[i] = rng.nextInt(100);
        }

        AlgorithmContext context = new AlgorithmContext(new HeapSortStrat());

        System.out.println("Heap Sort");
        Timer.time(context, Arrays.copyOf(arrSmall, arrSmall.length));
        Timer.time(context, Arrays.copyOf(arrLarge, arrLarge.length));

        context.setStrategy(new InsertionStrat());

        System.out.println("Insertion Sort");
        Timer.time(context, Arrays.copyOf(arrSmall, arrSmall.length));
        Timer.time(context, Arrays.copyOf(arrLarge, arrLarge.length));

        context.setStrategy(new ThreewayStrat());

        System.out.println("3-Way Quick Sort");
        Timer.time(context, Arrays.copyOf(arrSmall, arrSmall.length));
        Timer.time(context, Arrays.copyOf(arrLarge, arrLarge.length));



    }
}
