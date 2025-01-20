package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class GUI extends Application {

    private UIFactory currentFactory;
    private Pane createdElement;
    private Text currentStyle = new Text();
    private String teksti = "This is an element";
    String lastPressed = "";

    public void start(Stage window) {
        VBox root = new VBox(10);

        HBox styleSelection = new HBox(10);
        Button style1 = new Button("Style 1");
        Button style2 = new Button("Style 2");

        style1.setOnAction(e -> {
            currentFactory = new AFactory();
            currentStyle.setText("Current style: 1");
        }
        );
        style2.setOnAction(e -> {
            currentFactory = new BFactory();
            currentStyle.setText("Current style: 2");
        }
        );
        styleSelection.getChildren().addAll(style1, style2, currentStyle);


        HBox elementSelection = new HBox(10);
        Button createButton = new Button("Create button");
        Button createTextField = new Button("Create text field");
        Button createCheckBox = new Button("Create check box");

        createdElement = new Pane();

        createButton.setOnAction(e -> {
            createElement("button");
            lastPressed = "button";
        });
        createTextField.setOnAction(e -> {
            createElement("textField");
            lastPressed = "textField";
        });
        createCheckBox.setOnAction(e -> {
            createElement("checkBox");
            lastPressed = "checkBox";
        });

        elementSelection.getChildren().addAll(createButton, createTextField, createCheckBox);

        Button changeText = new Button("Change text");
        changeText.setOnAction(e -> {
            if (teksti.equals("altered text")) {
                teksti = "This is an element";
            } else {
            teksti = "altered text";
            }
            createElement(lastPressed);
        });


        root.getChildren().addAll(styleSelection, elementSelection, changeText, createdElement);

        Scene scene = new Scene(root, 400, 400);
        window.setScene(scene);
        window.show();
    }

    private void createElement(String type) {
        if (currentFactory == null) {
            return;
        }

        createdElement.getChildren().clear();

        switch (type) {
            case "button":
                ButtonAbstract button = currentFactory.createButton(teksti);
                createdElement.getChildren().add(button.display());
                break;
            case "textField":
                TextFieldAbstract textField = currentFactory.createTextField(teksti);
                createdElement.getChildren().add(textField.display());
                break;
            case "checkBox":
                CheckBoxAbstract checkBox = currentFactory.createCheckBox(teksti);
                createdElement.getChildren().add(checkBox.display());
                break;
        }
    }
}

