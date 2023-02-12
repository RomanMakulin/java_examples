package seminar.sem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class ex1 {
    public static void main(String[] args) {

        String sql = "select * from students where";

      
        String line = replace(reader());
        System.out.println(line);

        String[] arr = line.split(" ");
        System.out.println(Arrays.toString(arr));

    }

    // Читаем файл и записываем в строку
    private static String reader() {
        BufferedReader reader;
        StringBuilder str = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("ex1.txt"));
            str.append(reader.readLine()).append(System.lineSeparator());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    private static String replace(String str) {
        str = str.replace("{", "")
                .replace("}", "")
                .replace("'", "")
                .replace("age:null", "")
                .replace(",", " and");

        

        return str;
    }
}
