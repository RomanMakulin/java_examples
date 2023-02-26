package seminar.sem6;

public class GenerateMap {
    int map[][];

    public GenerateMap() {
        int[][] map = {
                { -1, -1, -1, -1, -1, -1 },
                { -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, -1 },
                { -1, -1, -1, -1, -1, -1 },
        };
        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }
}
