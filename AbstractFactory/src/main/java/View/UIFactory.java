package View;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public abstract class UIFactory {

    public GraphicsContext createGraphicsContext(Canvas canvas){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        return gc;
    }

    public Canvas createCanvas() {
        Canvas canvas = new Canvas(500, 500);
        return canvas;
    }

    abstract TextFieldAbstract createTextField(String text);
    abstract CheckBoxAbstract createCheckBox(String text);
    abstract ButtonAbstract createButton(String text);
}
