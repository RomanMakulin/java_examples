// 2. Реализуйте алгоритм сортировки пузырьком числового массива
// результат после каждой итерации записать в лог-файл;

package seminar.sem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        int size = 0;
        int[] array = new int[input(size)];
        array = FillArr(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bubleSorting(array)));

    }
    // метод ввода с клавиатуры размера массива
    private static int input(int number) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите размер массива: ");
            number = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return number;
    }

    // заполнение массива рандомом
    private static int[] FillArr(int[] collection) {
        Random random = new Random();
        int min = 1;
        int max = 10;
        for (int i = 0; i < collection.length; i++) {
            collection[i] = random.nextInt(min, max);
        }
        return collection;
    }

    // метод сортировки массива пузырьком
    private static int[] bubleSorting(int[] collection) {
        int temp;

        // логирование + сортировка + обработка исключений
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("log.txt"));

            for (int i = 0; i < collection.length - 1; i++) {
                for (int j = i + 1; j < collection.length; j++) {
                    if (collection[j] < collection[i]) {
                        temp = collection[i];
                        collection[i] = collection[j];
                        collection[j] = temp;
                    }
                    writer.write(Arrays.toString(collection) + System.lineSeparator());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException io) {
            }
        }
        return collection;
    }
}
