public class Player {

    private int handScore;
    private int score;

    public Player() {
        this.handScore = 0;
        this.score = 100;
    }


    public int getHandScore() {
        return handScore;
    }

    public void setHandScore(int handScore) {
        this.handScore = handScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
