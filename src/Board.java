public class Board {

    private char[][] map;
    private int startX;
    private int startY;

    public Board(char[][] map) {
        this.map = map;
        this.startX = getStartX();
        this.startY = getStartY();
    }

    public int getRows() {
        return map.length;
    }

    public int getCols() {
        return map[0].length;
    }

    public int getStartX() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'S') {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getStartY() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'S') {
                    return j;
                }
            }
        }
        return -1;
    }

    public boolean isGoalReached(int x, int y) {
        return map[x][y] == 'F';
    }

    public boolean isObstacle(int x, int y) {
        return map[x][y] == '⬛';
    }
}


//MAZE
//PLAYERS WILL ENTER THEIR NAME
//PRINTS OUT RULES
//AND THEN W A S D CONTROLS
//MENU IF YOU WANT TO DO MAP 1 OR MAP 2
//OUTPUT WINDOW (CONTROL WHERE THEY WANT TO GO YES)
//BOUNDARIES IF THEY GO OUT OF BOUND IT STOPS
//IF THEY GET TO THE EXIT THEY WIN YAY
