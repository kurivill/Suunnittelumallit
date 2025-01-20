package View;

import javafx.scene.control.CheckBox;

public class CheckBoxB extends CheckBoxAbstract {

    private String text;
    private CheckBox cb;

    public CheckBoxB(String text) {
        this.text = text;
        this.cb = new CheckBox(text);
    }

    @Override
    public CheckBox display() {
        CheckBox cb = new CheckBox(text);
        cb.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;");
        return cb;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
