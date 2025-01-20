package View;

import javafx.scene.control.CheckBox;
public class CheckBoxA extends CheckBoxAbstract {

    private String text;

    public CheckBoxA(String text) {
        this.text = text;
    }

    @Override
    public CheckBox display(){
        CheckBox cb = new CheckBox(text);
        cb.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        return cb;
    }
}
