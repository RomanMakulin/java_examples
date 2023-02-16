import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Удаление указанного элемента из массива

public class DelElMassiv {
    public static void main(String[] args) {

        int[] array = { 3, 2, 1, 6, 7, 1, 10 };
        System.out.print(Arrays.toString(array) + "\nВведите элемент удаления: ");
        System.out.println(del(array, input()));

    }

    // метод ввода с клавиатуры
    public static int input() {
        BufferedReader reader = null;
        int n = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    // del with list
    private static Object del(int[] array, int searchElement) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != searchElement)
                list.add(array[i]);
        }

        return list;
    }

}