import javafx.application.Application;
import javafx.stage.Stage;

class MultiChatLauncher extends Application {
    @Override
    public void start(Stage primaryStage) {
        new ChatWindow("Alice").start(new Stage());
        new ChatWindow("Bob").start(new Stage());
        new ChatWindow("Charlie").start(new Stage());
    }
}