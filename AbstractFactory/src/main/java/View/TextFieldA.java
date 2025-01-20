package View;

import javafx.scene.control.TextField;

public class TextFieldA extends View.TextFieldAbstract {

    private String text;

    public TextFieldA(String text) {
        this.text = text;
    }
    public TextField display() {
        TextField tf = new TextField(text);
        tf.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        return tf;
    }
}
