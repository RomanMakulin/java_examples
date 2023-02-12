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

        String line = reader().replace("{", "")
                .replace("}", "")
                .replace("'", "");

        String[] arr = line.split(", ");

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i].contains("null")) {
        // arr[i] = "";

        // }
        // }

        System.out.println(Arrays.toString(arr));
        System.out.println(sql + " " + arrToStr(arr));

    }

    private static String arrToStr(String[] str) {
        StringBuilder builder = new StringBuilder();
        String[] newArr = new String[str.length];
        int count = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (str[i].contains("null") || str[i] == null) {
                System.out.println("null");
            } else {
                newArr[count] = str[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        for (int i = 0; i < newArr.length; i++) {

            if (i < newArr.length - 1) {
                builder.append(newArr[i]);
            }

            if (i < newArr.length - 2) {
                builder.append(" and ");
            }
            
            if (i == newArr.length - 1) {
                builder.append(";");
            }

            

        }

        // for (String string : str) {
        // builder.append(string).append(" and ");
        // }
        return builder.toString();
    }

    // Читаем файл и записываем в строку
    private static String reader() {
        BufferedReader reader;
        StringBuilder str = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("ex1.txt"));
            str.append(reader.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.toString();
    }

}
