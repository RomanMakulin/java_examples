// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST 
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
import java.io.BufferedWriter;
import java.io.FileWriter;

public class tran2 {
    public static void main(String[] args) {
        String result = "";
        int repeats = 5;
        String word = "TEST";
        System.out.println(repeatWord(result, repeats, word));
        inputFile(result, repeats, word);
    }

    private static String repeatWord(String str, int repeats, String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repeats - 1; i++) {
            builder.append(word + ", ");
            if (i == repeats - 2) {
                builder.append(word + ";");
            }
        }
        return builder.toString();
    }

    private static void inputFile(String str, int repeats, String word) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("text.txt"));
            writer.write(repeatWord(str, repeats, word));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
