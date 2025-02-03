public class Main {

    public static void main(String[] args) {
        Handler handler = new BasicHandler();


        Message msg1 = new Message("I have a suggestion", Message.Type.SUGGESTION, "John.Deer@gmail.com");
        handler.handle(msg1);
        Message msg2 = new Message("I have a complaint", Message.Type.CLAIM, "asdasd@gmail.com");
        handler.handle(msg2);
    }
}
