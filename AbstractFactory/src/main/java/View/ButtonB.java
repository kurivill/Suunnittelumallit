package View;
import javafx.scene.control.Button;


public class ButtonB extends View.ButtonAbstract{

    private String text;
    private Button button;

    public ButtonB(String text) {

        this.text = text;
        this.button = new Button(text);
    }

    @Override
    public Button display() {
        Button button = new Button(text);
        button.setStyle("-fx-border-width: 3px; -fx-border-color: grey; -fx-background-color: #000000; -fx-text-fill: #ffffff;");
        return button;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }



}
