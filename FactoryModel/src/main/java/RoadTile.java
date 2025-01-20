public class RoadTile implements Tile {

    char type = 'R';

    public char getCharacter() {
        return type;
    }

    public String getDescription() {
        return "Road";
    }

    public void action() {
        System.out.println("You are playing");
    }
}
