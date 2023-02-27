package ToKnow.Labirint;

public class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] map = {
                { -1, -1, -1, -1, -1 },
                { -1, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1 },
                { -1, -1, -1, -1, -1 },
        };
        this.map = map;
    }

    // Возвращаем карту
    public int[][] getMap(){
        return map;
    }
}
