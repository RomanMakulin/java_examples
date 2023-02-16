import java.util.ArrayList;
import java.util.List;

// Расширение массива коллекцией (list) + удаление + замена элемента

public class ListArrayReSize {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 6 };
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        // Добавляем новый элемент
        list.add(55);
        System.out.println(list);

        // вставляем элемент на место нужного индекса
        list.add(1,55);
        System.out.println(list);

        // удаляем элемент по индексу
        list.remove(0);
        list.remove(1);
        list.remove(1);
        
        System.out.println(list);

    }
}
