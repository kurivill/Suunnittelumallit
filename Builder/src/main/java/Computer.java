import ComponentPackage.Komponentit;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Komponentit> components;

    public Computer() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Komponentit component) {
        this.components.add(component);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Komponentit component : components) {
            sb.append(component.toString());
            sb.append("\n");
        }
        sb.append("Total price: " + getPrice() + "€");
        return sb.toString();
    }

    public double getPrice() {
        double price = 0;
        for (Komponentit component : components) {
            price += component.getPrice();
        }
        return price;
    }
}
