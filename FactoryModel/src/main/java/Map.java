import java.util.Random;

public abstract class Map {

    int rows, columns;
    Tile [][] tiles;
    protected static final Random rng = new Random();

    public Map() {
        this.rows = 8;
        this.columns = 8;
        this.tiles = new Tile[rows][columns];
        startUp();
    }

    void startUp() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    abstract Tile createTile();

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" " + tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
