import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleBlackjack extends Game{

    private Deck deck;
    private ArrayList<Player> players;
    private int turnNumber;
    private int dealerCard1;
    private int dealerCard2;

    public SimpleBlackjack() {
        players = new ArrayList<Player>();
        turnNumber = 1;
        Scanner scanner = new Scanner(System.in);
    }

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
            if (player.getScore() >= 15) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {

        if (turnNumber % (players.size() + 1) == 1) { // Tämä siis kierroksen alku
            dealerCard1 = deck.drawCard();
            dealerCard2 = deck.drawCard();
            System.out.println("Dealer's cards: " + dealerCard1 + ", ?");

        }

        else if (turnNumber % (players.size() + 1) == 0) {
            System.out.println("Dealer's cards: " + dealerCard1 + ", " + dealerCard2);
            turnNumber = 1;
            while (dealerCard1 + dealerCard2 < 17) {
                System.out.println("Dealer draws a card");
                dealerCard1 += deck.drawCard();
                System.out.println("Dealer's total:" + (dealerCard1 + dealerCard2));
            }
            if (dealerCard1 + dealerCard2 > 21) {
                System.out.println("Dealer busts!");
                for (Player p : players) {
                    if (p.getHandScore() <= 21) {
                        p.setScore(p.getScore() + 1);
                    }
                    System.out.println("Player " + players.indexOf(p) + " score: " + p.getScore());
                }
            } else if (dealerCard1 + dealerCard2 >= 17) {
                System.out.println("Dealer stands");
            }
            for (Player p : players) {
                if (p.getHandScore() > dealerCard1 + dealerCard2 && p.getHandScore() <= 21 || dealerCard1 + dealerCard2 > 21 && p.getHandScore() <= 21) {
                    p.setScore(p.getScore() + 1);
                } else if (p.getHandScore() == dealerCard1 + dealerCard2) {
                    p.setScore(p.getScore() + 0);
                } else if (p.getHandScore() < dealerCard1 + dealerCard2 || p.getHandScore() > 21) {
                    p.setScore(p.getScore() - 1);
                }
                System.out.println("Player " + players.indexOf(p) + " score: " + p.getScore());
            }
            turnNumber++;
            deck.reset();
        } // Eli yläpuolella on nyt käsitelty, että jakajan vuoro on ohi ja pelaajat ovat pelanneet.

            players.get(player).setHandScore(deck.drawCard() + deck.drawCard());
            System.out.println("Player " + player + " cards: " + players.get(player).getHandScore());
            if (players.get(player).getHandScore() == 21) {
                System.out.println("Player " + player + " got blackjack!");
                players.get(player).setScore(players.get(player).getScore() + 1);
                System.out.println("Player " + player + " score: " + players.get(player).getScore());
                turnNumber++;
            }
            while (players.get(player).getHandScore() < 21) {
                System.out.println("Would you like to draw another card? (y/n)");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if (input.equals("y")) {
                    players.get(player).setHandScore(players.get(player).getHandScore() + deck.drawCard());
                    System.out.println("Player " + player + " cards: " + players.get(player).getHandScore());
                    if (players.get(player).getHandScore() > 21) {
                        System.out.println("Player " + player + " busts!");
                        players.get(player).setScore(players.get(player).getScore() - 1);
                        System.out.println("Player " + player + " score: " + players.get(player).getScore());
                        turnNumber++;
                        break;
                    }
                } else if (input.equals("n")) {
                    turnNumber++;
                    break;
                }
            }


    }

    @Override
    public void displayWinner() {
        for (Player player : players) {
            if (player.getScore() >= 15) {
                System.out.println("Player " + players.indexOf(player) + " wins!");
            }
        }
    }
}
