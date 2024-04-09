public class Board {

    private char[][] map;
    private int xPt;
    private int yPt;

    public Board(char[][] map) {
        this.map = map;
        xPt = getStartX();
        yPt = getStartY();
    }

    public int getRows() {
        return map.length;
    }

    public int getCols() {
        return map[0].length;
    }
    public int getXPt() {
        return xPt;
    }
    public int getYPt() {
        return yPt;
    }

    public int getStartY() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'S') {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getStartX() {
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

    public boolean wall(int x, int y) {
        if (x >= map.length || x < 0 || y >= map[0].length || y < 0) {
            return true;
        }
        return map[y][x] == '⬛';
    }

    public void setxPt(int x) {
        xPt = x;
    }
    public void setyPt(int y) {
        yPt = y;
    }
    public boolean move(String letter) {
        int newX = xPt;
        int newY = yPt;
        switch (letter) {
            case "W":
                newY--;
                break;
            case "A":
                newX--;
                break;
            case "S":
                newY++;
                break;
            case "D":
                newX++;
                break;
        }
        if (validMove(letter, newX, newY)) {
            xPt = newX;
            yPt = newY;
            return true;
        }
        return false;
    }


    public boolean validMove(String letter, int x, int y) {
        switch (letter) {
            case "W":
                return x - 1 >= 0 && !wall(x, y);
            case "A":
                return y - 1 >= 0 && !wall(x, y);
            case "S":
                return x + 1 < map.length && !wall(x, y);
            case "D":
                return y + 1 < map[0].length && !wall(x, y);
            default:
                return false;
        }
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
