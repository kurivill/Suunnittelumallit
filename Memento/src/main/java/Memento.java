

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        System.out.println("Memento created");
        // TÄhän pitää lisätä timestamp
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public String toString() {
        return "Memento: options: " + options[0] + " " + options[1] + " " + options[2] + " isSelected: " + isSelected;
    }
}