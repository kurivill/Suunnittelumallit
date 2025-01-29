
import java.util.Scanner;
import java.util.Random;

public class Hahmo {

    private final String name;
    private String level;
    private int experiencePoints;
    private int healthPoints;
    private State state;
    private static Scanner scanner = new Scanner(System.in);
    private static Random rng = new Random();
    private int breakPoints[] = {100, 200, 400, 1000};
    private int maxHP = 100;

    public Hahmo(String name) {
        this.name = name;
        this.level = "Novice";
        this.experiencePoints = 0;
        this.healthPoints = 100;
        state = new NoviceState(this);
    }

    public void startGame() {
        while (true) {
            if (state == null) {
                System.out.println("You Died!");
                return;
            } else if (state.getLevelName().equals("Master")) {
                System.out.println("Winner winner chicken dinner");
                return;
            }
            state.action();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int userChoice(String[] options) {
        System.out.println("\nSelect action:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ": " + options[i-1]);
        }
        return scanner.nextInt();
    }

    public void setExperiencePoints(int exp) {
        this.experiencePoints += exp;
    }

    public int[] getBreakPoints() {
        return breakPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void meditate() {
        int hpGain = rng.nextInt(20) + 1;
        System.out.println("Meditation restored " + hpGain + " health points!");
        this.healthPoints += hpGain;
        this.maxHP += 5;
        System.out.println("Max health points increased by 5!");
        if (this.healthPoints > this.maxHP) {
            this.healthPoints = this.maxHP;
        }
    }

    public void checkTrainingFail() {
        if (rng.nextBoolean()) {
            System.out.println("More intense training caused some damage!");
            this.healthPoints -= 10;
            if (this.healthPoints <= 0) {
                this.state = null;
            }
        }
    }

    public void setLevel() {
        this.level = this.state.getLevelName();
    }

    public void fight() {
        System.out.println("You went to fight an enemy!");
        int expGained = rng.nextInt(100) + 10;
        experiencePoints += expGained;
        System.out.println("You gained " + expGained + " experience points!");
        int hpLost = rng.nextInt(20) + 1;
        healthPoints -= hpLost;
        System.out.println("You lost " + hpLost + " health points!");
    }
}

