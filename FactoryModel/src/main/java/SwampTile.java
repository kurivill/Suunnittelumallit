public class SwampTile implements Tile{

    char type = 'S';

    public char getCharacter() {
        return type;
    }

    public String getDescription() {
        return "Swamp";
    }

    public void action() {
        System.out.println("You are playing");
    }
}
