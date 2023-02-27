package Labirint;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// Класс реализации волнового алгоритма и поиска кратчайшего пути из лабиринта
class WaveAlgorithm {
    int[][] map;

    // Делаем метод, позволяющий классу работать map публично
    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    // Метод основого алгоритма распределения волны
    public void Colorize(Point2D startPoint) {

        // Устанавливаем и добавляем в очередь стартовую точку на карте
        Queue<Point2D> que = new LinkedList<Point2D>();
        que.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        // Цикл распределения волны
        while (que.size() != 0) {
            Point2D p = que.remove();

            // up
            if (map[p.x - 1][p.y] == 0) {
                que.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            // right
            if (map[p.x][p.y + 1] == 0) {
                que.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
            // down
            if (map[p.x + 1][p.y] == 0) {
                que.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            // left
            if (map[p.x][p.y - 1] == 0) {
                que.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
        }
    }

    // Ключ значение (ключ - точка на карте, значение - координаты этой точки)
    // Поиск пути
    public Map<Integer, Point2D> getRoad(Point2D exit) {

        // Используем LinkedHashMap для запоминания последовательности добавления
        Map<Integer, Point2D> hash = new LinkedHashMap<>();
        hash.put(map[exit.x][exit.y], new Point2D(exit.x, exit.y)); // кладем конечную точку в список

        // пробегаем по карте и ищем короткий путь (от конечной точки до первой),
        // добавляя точку и значение в список
        while (map[exit.x][exit.y] > 1) {

            // up
            if (map[exit.x - 1][exit.y] == map[exit.x][exit.y] - 1) {
                hash.put(map[exit.x - 1][exit.y], new Point2D(exit.x - 1, exit.y));
                exit.x--;
            }
            // right
            if (map[exit.x][exit.y + 1] == map[exit.x][exit.y] - 1) {
                hash.put(map[exit.x][exit.y + 1], new Point2D(exit.x, exit.y + 1));
                exit.y++;
            }
            // down
            if (map[exit.x + 1][exit.y] == map[exit.x][exit.y] - 1) {
                hash.put(map[exit.x + 1][exit.y], new Point2D(exit.x + 1, exit.y));
                exit.x++;
            }
            // left
            if (map[exit.x][exit.y - 1] == map[exit.x][exit.y] - 1) {
                hash.put(map[exit.x][exit.y - 1], new Point2D(exit.x, exit.y - 1));
                exit.y--;
            }

        }
        return hash;
    }
}
