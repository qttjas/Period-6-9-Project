public class Map2 extends Board{
    public Map2(String playerName) {
        super(generateMap2(), 0, 0, playerName);
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
