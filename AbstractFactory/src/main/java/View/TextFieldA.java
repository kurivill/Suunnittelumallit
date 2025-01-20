package View;

import javafx.scene.control.TextField;

public class TextFieldA extends View.TextFieldAbstract {

    private String text;
    private TextField tf;

    public TextFieldA(String text) {
        this.text = text;
        this.tf = new TextField(text);
    }
    @Override
    public TextField display() {
        TextField tf = new TextField(text);
        tf.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        return tf;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
