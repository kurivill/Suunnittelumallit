public class AlgorithmContext {

    private AlgorithmStrategy strategy;

    public AlgorithmContext(AlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] arr) {
        strategy.sort(arr);
    }
}
