package ComponentPackage;

public class CPU extends Komponentit {


    private int cores;
    private double frequency;

    public CPU (String name, double price, int cores, double frequency) {
        super(name, price);
        this.cores = cores;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU: " + getName() + ", cores: " + cores + ", frequency: " + frequency + " GHz, price: " + getPrice() + "€";
    }
}
