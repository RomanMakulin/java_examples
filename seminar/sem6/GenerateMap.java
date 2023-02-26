package seminar.sem6;

// [Class] Создание и получение карты. Определение точки входа и выхода
public class GenerateMap {
    int map[][];
    int enter = -2;
    int exit = -3;

    // Генерация карты
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

    // Получение карты
    public int[][] getMap() {
        return map;
    }

    // Точка входа
    public void setEnter(Point2D pos) {
        map[pos.x][pos.y] = enter;
    }

    // Точка выхода
    public void setExit(Point2D pos) {
        map[pos.x][pos.y] = exit;
    }
}

// [Class] Создание класса точки по 2 координатам, их получение и пересборка String
class Point2D {
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // получение первой точки
    public int getX() {
        return x;
    }

    // получение второй точки
    public int getY() {
        return y;
    }

    // пересобираем метод для вывода данных
    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x, y);
    }
}
