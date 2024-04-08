import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to A-maze-ing Adventures! Enter your name: ");
        String playerName = scanner.nextLine();

        // Print rules
        printRules();

        // Menu for map selection
        System.out.println("\n--- SELECT MAP ---");
        System.out.println("1. Map 1");
        System.out.println("2. Map 2");
        System.out.print("Choose map (1/2): ");
        int mapChoice = scanner.nextInt();

        // Start the game based on map choice
        if (mapChoice == 1) {
            Map1 map1 = new Map1(playerName);
            map1.start();
        } else if (mapChoice == 2) {
            Map2 map2 = new Map2(playerName);
            map2.start();
        } else {
            System.out.println("Invalid map choice. Exiting...");
        }
    }

    private static void printRules() {
        // Print game rules
        System.out.println("\n--- MAZE GAME RULES ---");
        System.out.println("Use W, A, S, D controls to navigate the maze.");
        System.out.println("Reach the exit to win the game... \uD83D\uDE0B");
    }
}
