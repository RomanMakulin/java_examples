import java.util.ArrayList;
import java.util.List;

// Расширение массива коллекцией (list)

public class ex3 {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 6 };
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        list.add(55);
        System.out.println(list);

    }
}
