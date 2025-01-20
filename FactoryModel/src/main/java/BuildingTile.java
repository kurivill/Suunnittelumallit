public class BuildingTile implements Tile{

    char type = 'B';

    public char getCharacter() {
        return type;
    }

    public String getDescription() {
        return "Building";
    }

    public void action() {
        System.out.println("You are playing");
    }
}
