import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

// дан массив чисел, нужно сформировать новую выборку
// только из четных чисел
public class massivChetEl {
    public static void main(String[] args) {

        int count = 0;
        int newSize = 0;

        // ввод с клавиатуры
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
            System.out.println("Введите размер массива: ");
            int size = Integer.parseInt(reader.readLine());
            reader.close();
            int[] newArr = new int[size];

            // заполнение массива рандомом
            for (int i = 0; i < newArr.length; i++) {
                Random random = new Random();
                newArr[i] = random.nextInt(1, 10);
            }

            // проверяет условие задачи и формирует новый размер для след массива
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] % 2 == 0)
                    newSize++;
            }

            // формируем итоговый массив
            int[] resArr = new int[newSize];
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] % 2 == 0)
                    resArr[count++] = newArr[i];
            }
            System.out.println(Arrays.toString(newArr));
            System.out.println(Arrays.toString(resArr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
