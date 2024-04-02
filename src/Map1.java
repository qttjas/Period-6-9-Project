public class Map1 extends MazeMap {
    public Map1(String playerName) {
        super(generateMap1(), 0, 0, playerName);
    }

    private static char[][] generateMap1() {
        // Logic to generate map 1
        return new char[5][5]; // Example map
    }

    @Override
    public void start() {
        printMap(); // Print map before starting gameplay
        // Start map 1 gameplay
    }
}