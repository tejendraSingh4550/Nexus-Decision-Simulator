import java.util.Scanner;

public class DecisionEngine {

    private Player player;
    private Scanner sc;

    public DecisionEngine(Player player, Scanner sc) {
        this.player = player;
        this.sc = sc;
    }

    public void play(Decision decision) {

        System.out.println("\n" + decision.getQuestion());
        System.out.println("1. " + decision.getOptionA());
        System.out.println("2. " + decision.getOptionB());

        System.out.print("Choose: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            player.addScore(10);
            player.changeHealth(5);
            System.out.println("Good decision! +10 Score");
        } else if (choice == 2) {
            player.addScore(5);
            player.changeHealth(-5);
            System.out.println("Risky decision! +5 Score");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}