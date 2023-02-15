import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Удаление указанного элемента из массива

public class ex3 {
    public static void main(String[] args) {

        int[] array = { 3, 2, 1, 6, 7, 1, 10 };
        System.out.print("Введите элемент удаления: ");
        int[] newArr = del(array, input());
        System.out.println(Arrays.toString(newArr));

    }

    // метод ввода с клавиатуры
    public static int input() {
        BufferedReader reader = null;
        int n = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return n;
    }

    // метод удаления указанного эелемента
    public static int[] del(int[] array, int n) {
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                offset++;
            else
                array[i - offset] = array[i];
        }
        return Arrays.copyOf(array, array.length - offset);
    }

}
