package seminar.sem2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("1. Сложение, 2. Вычитание, 3. Деление, 4. Умножение, 5. Целочисленное деление");
        System.out.print("Выберите номер действия: ");
        int choice = input();

        if (choice == 1)
            System.out.printf("Ответ: %d", sum());
        if (choice == 2)
            System.out.printf("Ответ: %d", minus());
        if (choice == 3)
            System.out.printf("Ответ: %f", div());
        if (choice == 4)
            System.out.printf("Ответ: %d", mult());
        if (choice == 5)
            System.out.printf("Ответ: %d", divCel());
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

    // Ввод числа double
    private static double inputDiv() {
        BufferedReader reader = null;
        double num = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            num = Double.parseDouble(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    private static int sum() {
        System.out.print("Введите количество чисел для суммирования: ");
        int countNums = input();
        int result = 0;
        int oldRes = 0;
        int num;
        try (FileWriter writer = new FileWriter("logCalc.txt", false)) {

            for (int i = 0; i < countNums; i++) {
                System.out.print("Введите число: ");
                num = input();
                oldRes = result;
                result = result + num;
                writer.write(Integer.toString(oldRes) + " + " + Integer.toString(num) + " = "
                        + Integer.toString(result) + System.lineSeparator());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    private static int minus() {
        int result = 0;
        try (FileWriter writer = new FileWriter("logCalc.txt", false)) {
            System.out.print("Введите первое число: ");
            int a = input();
            System.out.print("Введите второе число: ");
            int b = input();
            result = a - b;
            writer.write(Integer.toString(a) + " - " + Integer.toString(b) + " = "
                    + Integer.toString(result) + System.lineSeparator());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    private static int divCel() {
        int result = 0;
        try (FileWriter writer = new FileWriter("logCalc.txt", false)) {
            System.out.print("Введите первое число: ");
            int a = input();
            System.out.print("Введите второе число: ");
            int b = input();
            result = a / b;
            writer.write(Integer.toString(a) + " / " + Integer.toString(b) + " = "
                    + Integer.toString(result) + System.lineSeparator());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    private static int mult() {
        int result = 0;
        try (FileWriter writer = new FileWriter("logCalc.txt", false)) {
            System.out.print("Введите первое число: ");
            int a = input();
            System.out.print("Введите второе число: ");
            int b = input();
            result = a * b;
            writer.write(Integer.toString(a) + " * " + Integer.toString(b) + " = "
                    + Integer.toString(result) + System.lineSeparator());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    private static double div() {
        double result = 0;
        try (FileWriter writer = new FileWriter("logCalc.txt", false)) {
            System.out.print("Введите первое число: ");
            double a = inputDiv();
            System.out.print("Введите второе число: ");
            double b = inputDiv();
            result = a / b;
            writer.write(Double.toString(a) + " / " + Double.toString(b) + " = "
                    + Double.toString(result) + System.lineSeparator());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

}