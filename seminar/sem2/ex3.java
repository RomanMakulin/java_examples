// Дана json строка типа:
// [{"Фамилия":"Ivanov", "оценка:5", "предмет":"math"}]
// Распарсить строку используя StringBuilder и создаст строку вида:
// Студент [фамилия] получил [оценка] по предмету [предмет]
// Студент Ivanov получил 5 по предмету math;

package seminar.sem2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(parseStr());
    }

    private static String parseStr() {
        BufferedReader reader = null;
        StringBuilder str = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("ex3.txt"));

            String line;
            while ((line = reader.readLine()) != null) {

                str.append(line.replace("[", "")
                        .replace("]", "")
                        .replace("{", "")
                        .replace("}", "")
                        .replace(":", " ")
                        .replace("Фамилия", "Студент")
                        .replace("оценка", "получил оценку")
                        .replace("предмет", "по предмету")
                        .replace(",", "")
                        .replace("'", "") + System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (Exception io) {
            }
        }
        return str.toString();
    }
}
