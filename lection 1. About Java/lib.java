// методы функции

public class lib {
    static void sayHi() {
        System.out.println("Hello");
    }

    static String getType(Object o) { // Находим тип данных НАШ МЕТОД
            return o.getClass().getSimpleName();
        }
}


