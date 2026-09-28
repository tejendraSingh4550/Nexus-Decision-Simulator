import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       DECISION ADVENTURE");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        Player player = new Player(name);
        DecisionEngine engine = new DecisionEngine(player, scan);

        Decision d1 = new Decision(
                "You find a wallet on the road. What do you do?",
                "Return it",
                "Keep it"
        );

        Decision d2 = new Decision(
                "You have an important exam tomorrow.",
                "Study",
                "Go out with friends"
        );

        Decision d3 = new Decision(
                "Your friend needs help with a difficult task.",
                "Help your friend",
                "Ignore the problem"
        );

        engine.play(d1);
        engine.play(d2);
        engine.play(d3);

        System.out.println("\n========== RESULT ==========");
        System.out.println("Player: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Score : " + player.getScore());

        if (player.getScore() >= 25)
            System.out.println("Result: ⭐ Great Decision Maker!");
        else
            System.out.println("Result: ⚠️ You need better decisions.");

        scan.close();
    }
}