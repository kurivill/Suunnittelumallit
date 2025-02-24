package ComponentPackage;

public class RAM extends Komponentit {

    public int size;
    public String type;

    public RAM(String name, double price, int size, String type) {
        super(name, price);
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "RAM: " + getName() + ", size: " + size + "GB, type: " + type + ", price: " + getPrice() + "€";
    }
}
