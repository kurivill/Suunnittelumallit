import java.util.ArrayList;
import java.util.List;

public class HistoryController {

    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> future; // Memento future

    public HistoryController(Gui gui, ArrayList<IMemento> history, ArrayList<IMemento> future) {
        this.model = new Model();
        this.gui = gui;
        this.history = history;
        this.future = future;
    }


}
