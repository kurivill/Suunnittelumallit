import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatWindow extends Application {
    private static Mediator mediator = new ChatRoom();
    private ChatClient client;
    private TextArea chatArea;
    private TextField messageField;
    private TextField recipientField;
    private static String username;

    public static void setUsername(String name) {
        username = name;
    }

    @Override
    public void start(Stage primaryStage) {
        if (username == null) {
            throw new IllegalStateException("Username not set. Use setUsername() before launching.");
        }
        client = new ChatClient(username, mediator);
        client.setChatWindow(this);

        primaryStage.setTitle(client.getUsername());

        chatArea = new TextArea();
        chatArea.setEditable(false);

        messageField = new TextField();
        recipientField = new TextField();
        recipientField.setPromptText("Enter recipient username");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> sendMessage());

        VBox layout = new VBox(10, chatArea, recipientField, messageField, sendButton);
        layout.setPadding(new Insets(10));

        primaryStage.setScene(new Scene(layout, 400, 300));
        primaryStage.show();
    }

    private void sendMessage() {
        String message = messageField.getText();
        String recipient = recipientField.getText();
        if (!message.isEmpty() && !recipient.isEmpty()) {
            client.sendMessage(message, recipient);
            displayMessage("Me: " + message);
            messageField.clear();
        }
    }

    public void displayMessage(String message) {
        chatArea.appendText(message + "\n");
    }
}