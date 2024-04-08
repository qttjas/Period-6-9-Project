public class Board {

    private char[][] map;
    private int startX;
    private int startY;
    public Board() {
        startX = 0;
        startY = 0;
        map = new char[][] {{0}, {0}};
    }

    public int getRows() {
        return map.length;
    }

    public int getCols() {
        return map[0].length;
    }
    public int getStartX() {
        return startX;
    }
    public int getStartY() {
        return startY;
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
