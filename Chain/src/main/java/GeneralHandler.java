public class GeneralHandler extends Handler{

    @Override
    public void handle(Message msg) {
        System.out.println("Message has been sent for manual review");
    }
}
