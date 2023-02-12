public class ex {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String str = "aaaabbcddd";
        int sum = 0;
        System.out.println(makeString(str, sum));

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    // Сжатие строки
    private static String makeString(String str, int sum) {
        StringBuilder stringBuilder = new StringBuilder();
        sum = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                sum++;
            } else {
                stringBuilder.append(sum).append(str.charAt(i));
                sum = 1;
            }
            // доделать обработку последних элементов

        }
        return stringBuilder.toString();
    }
}
