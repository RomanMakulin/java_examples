
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {

    // Получаем класс генерации карты
    var mg = new MapGenerator();

    // Печатаем сгенерированную карту
    System.out.println(
        new MapPrinter().rawData(
            mg.getMap()));

    // Получаем класс волнового алгоритма
    var lee = new WaveAlgorithm(mg.getMap());

    // Запускаем реализацию волнового алгоритма заполняя карту
    lee.Colorize(new Point2D(3, 3));

    // Печатаем заполненную карту
    System.out.println(
        new MapPrinter().rawData(
            mg.getMap()));

    // Показываем кратчайший путь
    System.out.println(lee.getRoad(new Point2D(5, 5)));

  }
}

// Класс указания двух точек
class Point2D {
  int x, y;

  public Point2D(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Пересобираем функцию для печати как нам нужно
  @Override
  public String toString() {
    return String.format("(x: %d  y: %d)", x, y);
  }
}

// Класс генерации карты
class MapGenerator {
  int[][] map;

  // Метод генерации карты
  public MapGenerator() {
    int[][] map = {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    this.map = map;
  }

  // Возвращаем сгенерированную карту
  public int[][] getMap() {
    return map;
  }

}

// Класс печати карты
class MapPrinter {

  // Метод печати карты
  public String rawData(int[][] map) {
    StringBuilder sb = new StringBuilder();

    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        sb.append(String.format("%5d", map[row][col]));
      }
      sb.append("\n");
    }
    // промежуток 3 строки
    for (int i = 0; i < 3; i++) {
      sb.append("\n");
    }

    return sb.toString();
  }

}

// Класс волнового алгоритма
class WaveAlgorithm {
  int[][] map;

  // Делаем карту "публичной" для класса
  public WaveAlgorithm(int[][] map) {
    this.map = map;
  }

  // Метод реализации распространения волны и "закрашивания числами" ячеек
  public void Colorize(Point2D startPoint) {
    Queue<Point2D> queue = new LinkedList<Point2D>();
    queue.add(startPoint);
    map[startPoint.x][startPoint.y] = 1;

    while (queue.size() != 0) {
      Point2D p = queue.remove();

      if (map[p.x - 1][p.y] == 0) {
        queue.add(new Point2D(p.x - 1, p.y));
        map[p.x - 1][p.y] = map[p.x][p.y] + 1;
      }
      if (map[p.x][p.y - 1] == 0) {
        queue.add(new Point2D(p.x, p.y - 1));
        map[p.x][p.y - 1] = map[p.x][p.y] + 1;
      }
      if (map[p.x + 1][p.y] == 0) {
        queue.add(new Point2D(p.x + 1, p.y));
        map[p.x + 1][p.y] = map[p.x][p.y] + 1;
      }
      if (map[p.x][p.y + 1] == 0) {
        queue.add(new Point2D(p.x, p.y + 1));
        map[p.x][p.y + 1] = map[p.x][p.y] + 1;
      }
    }
  }

  // Метод получения кратчайшего пути по заданным координатам выхода
  public ArrayList<Point2D> getRoad(Point2D exit) {
    ArrayList<Point2D> road = new ArrayList<>();
    road.add(0, new Point2D(exit.x, exit.y)); // добавляем координату выхода
    System.out.println(map[exit.x][exit.y]);
    int count = 1; // счетчик кол-ва шагов

    // идем от выхода в начало
    while (map[exit.x][exit.y] > 1) {

      // up
      if (map[exit.x - 1][exit.y] == map[exit.x][exit.y] - 1) {
        road.add(count, new Point2D(exit.x - 1, exit.y));
        System.out.println(map[exit.x - 1][exit.y]);
        exit.x--;
        count++;
      }

      // right
      if (map[exit.x][exit.y + 1] == map[exit.x][exit.y] - 1) {
        road.add(count, new Point2D(exit.x, exit.y + 1));
        System.out.println(map[exit.x][exit.y + 1]);
        exit.y++;
        count++;
      }

      // down
      if (map[exit.x + 1][exit.y] == map[exit.x][exit.y] - 1) {
        road.add(count, new Point2D(exit.x + 1, exit.y));
        System.out.println(map[exit.x + 1][exit.y]);
        exit.x++;
        count++;
      }

      // left
      if (map[exit.x][exit.y - 1] == map[exit.x][exit.y] - 1) {
        road.add(count, new Point2D(exit.x, exit.y - 1));
        System.out.println(map[exit.x][exit.y - 1]);
        exit.y--;
        count++;
      }
    }

    return road;
  }
}