// Ввод с клавиатуры
import java.io.*;
public class InputBuff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите число: ");
        int b = Integer.parseInt(reader.readLine());
        int c = a + b;
        System.out.println(c);
        reader.close();
    }
}