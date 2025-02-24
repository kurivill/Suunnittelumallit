package ComponentPackage;

public abstract class Komponentit {

    private String name;
    private double price;

    public Komponentit(){}

    public Komponentit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*
    @Override
    public String toString() {
        return "Component{" + "name=" + name + ", price=" + price + '}';
    }

     */
}
