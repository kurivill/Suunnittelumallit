package ComponentPackage;

public class GPU extends Komponentit{

    private int VRAM;

    public GPU(String name, int VRAM, double price) {
        super(name, price);
        this.VRAM = VRAM;

    }

    @Override
    public String toString() {
        return "GPU: " + getName() + ", VRAM: " + VRAM + "GB, price: " + getPrice() + "€";
    }
}
