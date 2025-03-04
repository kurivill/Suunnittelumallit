
    interface Mediator {
        void sendMessage(String message, String sender, String recipient);
        void registerClient(ChatClient client);
    }
