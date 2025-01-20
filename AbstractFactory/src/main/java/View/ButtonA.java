package View;

import javafx.scene.control.Button;

public class ButtonA extends View.ButtonAbstract {

    private String text;

    public ButtonA(String text){
        this.text = text;
    }

    @Override
    public Button display() {
        Button button = new Button(text);
        button.setStyle("-fx-border-width: 1px; -fx-border-color: black; -fx-background-color: #ffffff; -fx-text-fill: #000000;");
        return button;
    }

}
