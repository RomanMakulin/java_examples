package ToKnow.Labirint;

public class Main {
    public static void main(String[] args) {

        // Получаем класс генерации карты и печатаем ее
        var mg = new MapGenerator();
        System.out.println(new MapPrinter().rawData(mg.getMap()));

        // Получаем класс волнового алгоритма. Вызываем его и ставим начальную точку - >
        // Реализация алгоритма
        var lee = new WaveAlgorithm(mg.getMap());
        lee.Colorize(new Point2D(3, 3));

        // Снова получаем карту и печатаем новый вариант
        System.out.println(new MapPrinter().rawData(mg.getMap()));

        // Реализация поиска пути
        System.out.println(lee.getRoad(new Point2D(5, 5)));
    }
}
