

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

import java.util.Stack;

public class Gui extends Application {

    // Eli tähän luokkaan pitää lisätä nappi, jolla tehdään uusi stage
    // Sen stagen sisään siis listview, joka populoidaan noiden arraylistien mukaan
    // Eli uusi kontrolleri, joka saa parametrinaan saman modelin, ja sieltä sitten päästään käsiksi mementoihin

    // Staten vaihtaminen pitäisi olla aika yksinkertainen homma, toivon mukaan.

    // create a GUI with three adjacent ColorBoxes and one CheckBox below them
    private Controller controller;
    private HistoryController hController;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;

    public void start(Stage stage) {

        controller = new Controller(this);

        // Insets for margin and padding
        Insets insets = new Insets(10, 10, 10, 10);

        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);

        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        // Add the ColorBoxes and CheckBox to a HBox
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);


        ListView<String> listView = new ListView<>();



        Label label = new Label("Press Ctrl-Z to undo the last change.");
        label.setPadding(insets);
        Label redoLabel = new Label("Press Ctrl-Y to redo the last change.");
        redoLabel.setPadding(insets);
        Button button = new Button("Open history");

        // create a VBox that contains the HBox and the CheckBox
        VBox vBox = new VBox(hBox, checkBox, label, redoLabel, button);
        // call controller when the CheckBox is clicked
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });

        button.setOnAction(event -> {
            hController = new HistoryController(this, controller.getHistory(), controller.getFuture());
            Stage newStage = new Stage();
            listView.getItems().clear();
            newStage.setTitle("History");
            listView.getItems().add("History:");
            for (IMemento memento : controller.getHistory()) {
                listView.getItems().add(memento.toString());
            }
            listView.getItems().add("Future:");
            for (IMemento memento : controller.getFuture()) {
                listView.getItems().add(memento.toString());
            }
            StackPane stackPane = new StackPane();
            stackPane.getChildren().add(listView);
            newStage.setScene(new Scene(stackPane, 300, 300));
            newStage.show();
        });

        listView.setOnMouseClicked(event -> {
            int index = listView.getSelectionModel().getSelectedIndex();
            if (index > 0 && index < controller.getHistory().size() + 1) {
                controller.restoreState(index - 1);
            } else if (index > controller.getHistory().size() + 1) {
                controller.restoreState(index - controller.getHistory().size() - 2);
            }
        });


        // Set the HBox to be the root of the Scene
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                // Ctrl-Z: undo
                System.out.println("Undo key combination pressed");
                controller.undo();
            } else if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                System.out.println("Redo key combination pressed");
                controller.redo();
            }
        });


        stage.setScene(scene);
        stage.setTitle("Memento Pattern Example");
        stage.show();
    }

    public void updateGui() {
        // called after restoring state from a Memento
        colorBox1.setColor(controller.getOption(1));
        colorBox2.setColor(controller.getOption(2));
        colorBox3.setColor(controller.getOption(3));
        checkBox.setSelected(controller.getIsSelected());
    }
}