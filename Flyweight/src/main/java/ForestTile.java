public class ForestTile implements Tile{

    char type = 'F';

    public char getCharacter() {
        return type;
    }

    public String getDescription() {
        return "Forest";
    }

    public void action() {
        System.out.println("You are playing");
    }
}
