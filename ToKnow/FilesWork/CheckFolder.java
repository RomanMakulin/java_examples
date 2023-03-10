package FilesWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedWriter;

public class CheckFolder {
    public static void main(String[] args) throws IOException {
        // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
        // Напишите метод, который запишет массив, возвращенный предыдущим методом в
        // файл.
        // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
        // исключения, оно должно записаться в лог-файл.

        String[] str = stringFiles();
        ArrayToFile(str);
    }

    // Содержание папки в массив строк
    public static String[] stringFiles() {
        File file = new File(".");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        return list;
    }

    // Запись из массива строк в файл
    public static void ArrayToFile(String[] list) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("desk.txt"));

            for (String string : list) {
                writer.write(string + System.lineSeparator());
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
    }
}
