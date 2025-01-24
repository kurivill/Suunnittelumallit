import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable{

    private int temperature;
    private List<Observer> observers = new ArrayList<>();
    Random rng = new Random();
    private int max = 60;
    private int sub = 25;

    public WeatherStation(){
        this.temperature = rng.nextInt(max) - sub;
    }

    public void run() {
        while(true){
            try {
                Thread.sleep(3000);
                if (rng.nextBoolean()) {
                    this.temperature++;
                } else {
                    this.temperature--;
                }
                notifyObservers();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this.temperature);
        }
    }
}
