import java.util.HashMap;
import java.util.Map;

class ChatRoom implements Mediator {
    private final Map<String, ChatClient> clients = new HashMap<>();

    @Override
    public void sendMessage(String message, String sender, String recipient) {
        if (clients.containsKey(recipient)) {
            clients.get(recipient).receiveMessage(message, sender);
        }
    }

    @Override
    public void registerClient(ChatClient client) {
        clients.put(client.getUsername(), client);
    }
}
