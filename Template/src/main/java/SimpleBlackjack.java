import java.util.ArrayList;
import java.util.Random;

public class SimpleBlackjack extends Game{

    private Deck deck;
    private ArrayList<Player> players;

    @Override
    public void initializeGame(int numberOfPlayers) {
        deck = new Deck();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player());
        }
    }

    @Override
    public boolean endOfGame() {
        for (Player player : players) {
            if (player.getScore() >= 150) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {

    }

}
