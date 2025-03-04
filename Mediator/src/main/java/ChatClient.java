class ChatClient {
    private final String username;
    private final Mediator mediator;
    private ChatWindow chatWindow;

    public ChatClient(String username, Mediator mediator) {
        this.username = username;
        this.mediator = mediator;
        mediator.registerClient(this);
    }

    public String getUsername() {
        return username;
    }

    public void setChatWindow(ChatWindow chatWindow) {
        this.chatWindow = chatWindow;
    }

    public void sendMessage(String message, String recipient) {
        mediator.sendMessage(message, username, recipient);
    }

    public void receiveMessage(String message, String sender) {
        if (chatWindow != null) {
            chatWindow.displayMessage(sender + ": " + message);
        }
    }
}
