import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите число : ");
            int num = Integer.parseInt(reader.readLine());
            reader.close();
            System.out.println("Треугольное число = " + Triangle(num) + "\n");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}
