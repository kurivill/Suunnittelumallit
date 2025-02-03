import java.time.Duration;
import java.time.Instant;

public class Timer {

    public static void time(AlgorithmContext context, int[] arr) {
        Instant start = Instant.now();
        context.sort(arr);
        Instant end = Instant.now();
        System.out.println("Time taken: " + Duration.between(start, end).toMillis() + " milliseconds");
    }
}
