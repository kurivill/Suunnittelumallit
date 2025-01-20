package View;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface UIFactory {

    GraphicsContext createGraphicsContext(Canvas canvas);
    Canvas createCanvas();

    TextField createTextField(String text);
    CheckBox createCheckBox(String text);
    Button createButton(String text);
}
