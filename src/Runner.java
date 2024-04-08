
public class Runner {
    public String name;
    public static void main(String[] args) {
        printRules();

        MazeMap maze = new MazeMap();
    }

    private static void printRules() {
        // Print game rules
        System.out.println("\n--- MAZE GAME RULES ---");
        System.out.println("Use W, A, S, D controls to navigate the maze.");
        System.out.println("Reach the exit to win the game... \uD83D\uDE0B");
    }
}
