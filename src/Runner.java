import java.awt.*;
import java.util.Scanner;

public class Runner {
    public String name;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to A-maze-ing Adventures! Enter your name: ");
        String name = scanner.nextLine();

        // Print rules
        printRules();
        MazeMap maze = new MazeMap() {
            @Override
            protected void paintComponent(Graphics g) {

            }
        };
    }

    private static void printRules() {
        // Print game rules
        System.out.println("\n--- MAZE GAME RULES ---");
        System.out.println("Use W, A, S, D controls to navigate the maze.");
        System.out.println("Reach the exit to win the game... \uD83D\uDE0B");
    }
}
