import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

// Массив рандомными числами и получить максимальное, минимальное и среднее знач
// реализовать сортировку

public class ex1 {

    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        int[] collection = new int[input()];
        collection = fillArr(collection);

        System.out.println(Arrays.toString(collection));

        // Быстрая сортировка
        Arrays.sort(collection);
        System.out.println(Arrays.toString(collection));

        System.out.printf("Максимальный элемент массива: %d\n", maxEl(collection));
        System.out.printf("Минимальный элемент массива: %d\n", minEl(collection));
        System.out.printf("Среднее значение массива: %f\n", srEl(collection));

    }

    // Ввод числа с клавиатуры
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

    // заполнение массива
    private static int[] fillArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 10);
        }
        return arr;
    }

    // максимальный элемент
    private static int maxEl(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // минимальный элемент
    private static int minEl(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    // усредненное значение
    private static double srEl(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = sum / arr.length;
        return result;
    }

}