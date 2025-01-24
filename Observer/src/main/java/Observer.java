public class Observer {
    public String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(int temperature){
        System.out.println("At " + this.name + " the temperature is " + temperature);
    }
}
