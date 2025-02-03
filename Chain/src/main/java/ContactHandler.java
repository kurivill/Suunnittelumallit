public class ContactHandler extends Handler{

    @Override
    public void handle(Message msg) {
        System.out.println("Message has been sent to the correct department");
    }
}
