package View;

import javafx.scene.control.CheckBox;

public abstract class CheckBoxAbstract {
    String text;

    public abstract CheckBox display();

    public void setText(String text) {
        this.text = text;
    };
}
