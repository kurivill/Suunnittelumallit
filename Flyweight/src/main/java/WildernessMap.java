public class WildernessMap extends Map {

    WildernessMap() {
        super();
    }

    @Override
    public Tile createTile() {

        int tileType = rng.nextInt(3);
        if (tileType == 0) {
            return new SwampTile();
        } else if (tileType == 1) {
            return new WaterTile();
        } else {
            return new ForestTile();
        }
    }
}
