
// Проверка вхождения одной строки в другую
public class charAtString {
    public static void main(String[] args) {
        String s = "ab";
        String j = "aabbccdaaabd";
        int count = 0;

        for (int i = 0; i < j.length(); i++) {
            if (s.charAt(0) == j.charAt(i)) count += 1;
            if (s.charAt(1) == j.charAt(i)) count += 1;
        }
        System.out.printf("Количество вхождений ab в строчке j: %d", count);
    }
}