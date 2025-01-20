package View;

import javafx.scene.control.Button;

public abstract class ButtonAbstract {
    String text;

    public abstract Button display();

    public void setText(String text) {
        this.text = text;
    };

}
