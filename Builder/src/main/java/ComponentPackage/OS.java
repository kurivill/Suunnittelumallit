package ComponentPackage;

public class OS extends Komponentit{



    public OS(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "OS: " + getName() + ", price: " + getPrice() + "€";
    }
}
