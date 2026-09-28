public class Player {

    private String name;
    private int health = 100;
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public void changeHealth(int value) {
        health = Math.max(0, Math.min(100, health + value));
    }

    public void addScore(int value) {
        score += value;
    }
}