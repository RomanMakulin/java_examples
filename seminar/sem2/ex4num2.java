package seminar.sem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex4num2 {
    public static void main(String[] args) {
        System.out.print("Что посчитаем? (Пример: 5-2): ");
        System.out.printf("Ответ: %d", calc(input()));
    }

    private static String input() {
        BufferedReader reader = null;
        String string = "";
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            string = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }

    private static int calc(String str) {
        String[] arr;
        int result = 0;

        if (str.contains("+")) {
            arr = str.split("\\+");
            result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }
        if (str.contains("-")) {
            arr = str.split("\\-");
            result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
        }
        if (str.contains("/")) {
            arr = str.split("\\/");
            result = Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]);
        }
        if (str.contains("*")) {
            arr = str.split("\\*");
            result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }

        return result;
    }

}