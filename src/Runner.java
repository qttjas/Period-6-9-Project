import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to A-maze-ing Adventures! Enter your name: ");
        String playerName = scanner.nextLine();
2
        // rules
        System.out.println("\n--- MAZE GAME RULES ---");
        System.out.println("Use W, A, S, D controls to navigate the maze.");
        System.out.println("Reach the exit to win the game... \uD83D\uDE0B");

        // menu
        System.out.println("\n--- SELECT MAP ---");
        System.out.println("1. Map 1");
        System.out.println("2. Map 2");
        System.out.print("Choose map (1/2): ");
        int mapChoice = scanner.nextInt();
    }
}