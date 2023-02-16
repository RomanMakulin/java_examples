import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// дан массив чисел, нужно сформировать новую выборку
// только из четных чисел

public class ChetEl {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        int[] array = new int[input()];
        array = FillArr(array);
        System.out.println(Arrays.toString(array));

        int[] newArr = FilterEven(array);
        System.out.println(Arrays.toString(newArr));
        
    }

    // Определяем размер массива
    private static int input(){
        BufferedReader reader = null;
        int inputNumber = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            inputNumber = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputNumber;
    }

    // Заполняем массив рандомом
    private static int[] FillArr(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }
        return array;
    }

    private static int[] FilterEven(int[] array){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) list.add(array[i]);
        }

        // превращаем список в числовой массив 
        array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }

}
