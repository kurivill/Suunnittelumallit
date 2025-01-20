package View;

import javafx.scene.control.CheckBox;

public class CheckBoxB extends CheckBoxAbstract {

    private String text;

    public CheckBoxB(String text) {
        this.text = text;
    }

    @Override
    public CheckBox display() {
        CheckBox cb = new CheckBox(text);
        cb.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;");
        return cb;
    }
}
