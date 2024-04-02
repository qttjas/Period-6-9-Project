public class MazeMap extends Board {
    protected String playerName;
    protected char[][] map;

    public MazeMap(char[][] map, int initialRow, int initialCol, String playerName) {
        super(map, initialRow, initialCol);
        this.playerName = playerName;
        this.map = map;
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void start() {
        // Start map gameplay
    }
}

