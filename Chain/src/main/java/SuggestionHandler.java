public class SuggestionHandler extends Handler{

    @Override
    public void handle(Message msg) {
        System.out.println("Message has been logged, and it will be reviewed by a human");
    }
}
