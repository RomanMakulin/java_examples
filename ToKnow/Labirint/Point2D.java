package Labirint;

// Класс определения точки по координатам
class Point2D {
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Пересобираем функцию toString как нам надо
    @Override
    public String toString() {
        return String.format("(x: %d  y: %d)", x, y);
    }
}
