public class Main {

    public static void main(String[] args) {

        APIFacade apiFacade = new APIFacade();
        try {
            System.out.println(apiFacade.getAttributeValueFromJSON("https://api.chucknorris.io/jokes/random", "value"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(apiFacade.getAttributeValueFromJSON("https://api.fxratesapi.com/latest", "rates.ADA"));
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
