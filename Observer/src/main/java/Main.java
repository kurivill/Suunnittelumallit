public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer observer1 = new Observer("Observer 1");
        Observer observer2 = new Observer("Observer 2");
        Observer observer3 = new Observer("Observer 3");

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);
        weatherStation.addObserver(observer3);

        Thread thread = new Thread(weatherStation);
        thread.start();

        try {
            Thread.sleep(10000);
            weatherStation.removeObserver(observer2);
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
