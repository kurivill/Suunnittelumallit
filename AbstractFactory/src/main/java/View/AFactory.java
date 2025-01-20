package View;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class AFactory implements UIFactory{

    public GraphicsContext createGraphicsContext(Canvas canvas){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        return gc;
    }

    public Canvas createCanvas() {
        Canvas canvas = new Canvas(800, 600);
        return canvas;
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA();
    }

    @Override
    public CheckBox createCheckBox(String text) {
        return new CheckBoxA();
    }

    @Override
    public Button createButton(String text) {
        return new ButtonA();
    }
}
