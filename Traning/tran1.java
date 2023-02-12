// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
import java.util.Random;

public class tran1 {
    public static void main(String[] args) {
        int n = 5;
        char c1 = 'v';
        char c2 = 'q';
        String resultString = "";
        resultString = newStr(n, c1, c2, resultString);
        System.out.println(resultString);
    }

    private static String newStr(int n, char c1, char c2, String resultString) {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int generation = random.nextInt(1, 3); // генерируем рандомное c1 or c2
            if (generation == 1)
                str.append(c1); // добавляем значение в результирующую строку
            else
                str.append(c2);
        }
        return str.toString();
    }
}
