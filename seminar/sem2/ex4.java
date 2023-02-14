package seminar.sem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("1. Сложение, 2. Вычитание, 3. Деление, 4. Умножение");
        System.out.print("Выберите номер действия: ");
        int choice = input();

        if (choice == 1) System.out.printf("Ответ: %d", sum());
        if (choice == 2) System.out.printf("Ответ: %d", minus());
        if (choice == 3) System.out.printf("Ответ: %d", div());
        if (choice == 4) System.out.printf("Ответ: %d", mult());

    }

    // метод ввода чисел
    private static int input() {
        BufferedReader reader = null;
        int num = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    private static int sum() {
        System.out.print("Введите количество чисел для суммирования: ");
        int countNums = input();
        int result = 0;

        for (int i = 0; i < countNums; i++) {
            System.out.print("Введите число: ");
            result += input();
        }
        return result;
    }

    private static int minus() {
        System.out.print("Введите первое число: ");
        int a = input();
        System.out.print("Введите второе число: ");
        int b = input();
        return a - b;
    }

    private static int div() {
        System.out.print("Введите первое число: ");
        int a = input();
        System.out.print("Введите второе число: ");
        int b = input();
        return a / b;
    }

    private static int mult() {
        System.out.print("Введите первое число: ");
        int a = input();
        System.out.print("Введите второе число: ");
        int b = input();
        return a * b;
    }
}
