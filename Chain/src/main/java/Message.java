public class Message {

    public String getSender() {
        return sender;
    }

    enum Type {
        CONTACTREQUEST, CLAIM, SUGGESTION, GENERAL
    }

    private String msg;
    private Type type;
    private String sender;

    public Message(String msg, Type type, String sender) {
        this.msg = msg;
        this.type = type;
        this.sender = sender;
    }

    public Type getType() {
        return type;
    }
}
