package View;

import javafx.scene.control.TextField;

public class TextFieldB extends View.TextFieldAbstract {

    private String text;

    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public TextField display() {
        TextField tf = new TextField(text);
        tf.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;");
        return tf;
    }
}
