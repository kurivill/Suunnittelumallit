import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        do {
            System.out.println("Enter 1 for CityMap, 2 for WildernessMap, type 'exit' to quit");
            String input = sc.nextLine();
            if (!input.equals("exit")) {
                Map map = game.createMap(input);
                map.display();
            }

        } while (!sc.nextLine().equals("exit"));
    }

    public Map createMap(String input) {
        if (input.equals("1")) {
            return new CityMap();
        } else if (input.equals("2")) {
            return new WildernessMap();
        } else {
            return null;
        }
    }
}
