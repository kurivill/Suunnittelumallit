public class WaterTile implements Tile{

        char type = 'W';

        public char getCharacter() {
            return type;
        }

        public String getDescription() {
            return "Water";
        }

        public void action() {
        System.out.println("You are playing");
        }
}
