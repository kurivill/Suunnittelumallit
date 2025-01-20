package View;

import javafx.scene.control.CheckBox;
public class CheckBoxA extends CheckBoxAbstract {

    private String text;
    private CheckBox cb;

    public CheckBoxA(String text) {

        this.text = text;
        this.cb = new CheckBox(text);
    }

    @Override
    public CheckBox display(){
        CheckBox cb = new CheckBox(text);
        cb.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        return cb;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
