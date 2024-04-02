public class Map2 extends MazeMap {
    public Map2(String playerName) {
        super(generateMap2(), 0, 0, playerName);
    }

    private static char[][] generateMap2() {
        // Logic to generate map 2
        return new char[5][5]; // Example map
    }

    @Override
    public void start() {
        printMap(); // Print map before starting gameplay
        // Start map 2 gameplay
    }
}

