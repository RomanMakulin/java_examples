// Чтение и запись файла
import java.io.*;

public class FileBuff {

    public static void main(String[] args) throws IOException {
        BufferedReader buffR = new BufferedReader(new FileReader("File Read and Write/input.txt"));
        String line = buffR.readLine();
        String[] nums = line.split(" ");
        int[] arrayNums = new int[nums.length];
        int count = 0;
        int sum = 0;
        for (String number : nums) {
            arrayNums[count] = Integer.parseInt(number);
            sum += arrayNums[count];
            count++;
        }
        System.out.println(sum);
        buffR.close();

        BufferedWriter buff = new BufferedWriter(new FileWriter("File Read and Write/output.txt"));
        String result = Integer.toString(sum);
        buff.write(result);
        buff.close();
    }
}