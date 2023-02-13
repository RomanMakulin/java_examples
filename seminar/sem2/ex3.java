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

        String str = parseStr();
        String[] arrStr = str.split(" ");
        String secondName = arrStr[1], rating = arrStr[3], subject = arrStr[5];
        System.out.printf("Студент %s получил оценку %s по предмету %s;", secondName, rating, subject);

    }

    private static String parseStr() {
        BufferedReader reader = null;
        StringBuilder str = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader("ex3.txt"));
            str.append(reader.readLine().replace("[", "")
                    .replace("]", "")
                    .replace("{", "")
                    .replace("}", "")
                    .replace(":", " ")
                    .replace(",", "")
                    .replace("'", ""));
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
