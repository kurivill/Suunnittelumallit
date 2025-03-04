public class CityMap extends Map{

    CityMap() {
        super();
    }

    @Override
    public Tile createTile() {

        int tileType = rng.nextInt(3);
        if (tileType == 0) {
            return new RoadTile();
        } else if (tileType == 1) {
            return new BuildingTile();
        } else {
            return new ForestTile();
        }
    }
}
