package seminar.sem2;

import java.io.BufferedReader;
import java.io.FileReader;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class ex1 {
    public static void main(String[] args) {
        String sql = "select * from students where";
        System.out.println(sql + " " + arrToStr(repl(reader()).split(", ")));
    }

    private static String arrToStr(String[] str) {
        StringBuilder builder = new StringBuilder();
        String[] newArr = new String[str.length];
        int count = 0; // счетчик нового массива
        int sizeNull = 0; // определение будущего размера массива с учетом нулевых значений

        for (int i = 0; i < newArr.length; i++) {
            if (str[i].contains("null") || str[i] == null) {
                sizeNull++;
            } else {
                newArr[count] = str[i];
                count++;
            }
        }

        int newSize = newArr.length - sizeNull;
        for (int i = 0; i < newSize; i++) {
            if (i < newSize) {
                builder.append(newArr[i]);
            }
            if (i < newSize - 1) {
                builder.append(" and ");
            }
            if (i == newSize - 1) {
                builder.append(";");
            }
        }
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

    private static String repl(String str) {
        str.replace("{", "")
                .replace("}", "")
                .replace("'", "");

        return str;
    }
}
