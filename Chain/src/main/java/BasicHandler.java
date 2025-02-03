public class BasicHandler extends Handler {

    private Handler nextHandler;

    public BasicHandler() {
        nextHandler = null;
    }

    @Override
    public void handle(Message msg) {
        setNextHandler(msg);
    }


    @Override
    public void setNextHandler(Message msg) {
        switch (msg.getType()) {
            case CONTACTREQUEST:
                nextHandler = new ContactHandler();
                nextHandler.handle(msg);
                break;
            case SUGGESTION:
                nextHandler = new SuggestionHandler();
                nextHandler.handle(msg);
                break;
            case CLAIM:
                nextHandler = new ClaimHandler();
                nextHandler.handle(msg);
                break;
            case GENERAL:
                nextHandler = new GeneralHandler();
                nextHandler.handle(msg);
                break;
            default:
                nextHandler = null;
                System.out.println("Invalid message type");
                break;

        }

    }


}
