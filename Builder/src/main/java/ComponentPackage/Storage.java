package ComponentPackage;

public class Storage extends Komponentit{


    private int capacity;
    private String type;

    public Storage(String name, double price, int capacity, String type) {
        super(name, price);
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Storage: " + getName() + ", capacity: " + capacity + "GB, type: " + type + ", price: " + getPrice() + "€";
    }
}
