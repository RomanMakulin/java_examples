import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 1. Возведение в степень 
public class Pow {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите число: ");
            int a = Integer.parseInt(reader.readLine());
            System.out.print("Введите степень: ");
            int b = Integer.parseInt(reader.readLine());
            reader.close();

            int result = 1;
            for (int i = 0; i < b; i++) { // возведение в степень
                result *= a;
            }
            System.out.printf("%d^%d = %d", a, b, result);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}