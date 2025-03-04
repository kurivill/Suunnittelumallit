import javafx.application.Platform;

public class MultiChatLauncher {
    public static void main(String[] args) {
        Platform.startup(() -> {
            ChatWindow.setUsername("Jukka");
            new ChatWindow().start(new javafx.stage.Stage());

            ChatWindow.setUsername("Taru");
            new ChatWindow().start(new javafx.stage.Stage());

            ChatWindow.setUsername("Antti");
            new ChatWindow().start(new javafx.stage.Stage());
        });
    }
}