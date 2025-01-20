package View;

import javafx.scene.control.TextField;

public abstract class TextFieldAbstract {
    String text;

    public abstract TextField display();

    public void setText(String text) {
        this.text = text;
    }
}
