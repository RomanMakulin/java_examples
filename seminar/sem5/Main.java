package seminar.sem5;

public class Main {
    public static void main(String[] args) {

        // Получаем класс генерации карты и печатаем ее
        var mg = new MapGenerator();
        System.out.println(new MapPrinter().rawData(mg.getMap()));

    }
}