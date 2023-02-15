package LoggerTest;

import java.io.IOException;
import java.util.logging.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class example {
    public static void main(String[] args) throws SecurityException, IOException {

        System.out.print("Что посчитаем? (Пример: 5-2): ");
        System.out.printf("Ответ: %d", calc(input()));

        // Логирование
        Logger logger = Logger.getLogger(example.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.info("Программа в порядке");

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
