package FilesWork;
// Чтение и запись файла
import java.io.*;
public class FileBuff {

    public static void main(String[] args) throws IOException {
        BufferedReader buffR = new BufferedReader(new FileReader("input.txt")); // Инициализация баффера
        String line = buffR.readLine(); // считываем строку с файла
        String[] nums = line.split(" "); // разделяем элементы строки в массив строк
        int sum = 0;

        for (String i : nums) { // Считываем каждый элемент массива строки
            if (i.matches("\\d+") == true) // Проверяем является ли элемент числом (d)
                sum += Integer.parseInt(i); // Суммируем числа
        }
        buffR.close(); // Закрываем поток

        BufferedWriter buff = new BufferedWriter(new FileWriter("output.txt"));
        String result = Integer.toString(sum); // Записываем число снова в строку
        buff.write(result); // Проводим запись в файл
        buff.close();
    }
}