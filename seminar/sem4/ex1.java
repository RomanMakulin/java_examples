// HeapSort - пирамидальная сортировка
package seminar.sem4;
import java.util.Arrays;

public class ex1 {

    public static void main(String[] args) {
        int[] array = { 3, 2, 6, 7, 1, 234, 8, -5 };
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array) {
        int size = array.length;

        // строим дерево
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, i, size);
        }

        // sorting
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

    // меняем структуру данных: родитель - ребенок
    private static void heapify(int[] array, int i, int size) {

        int left = i * 2 + 1; // левый ребенок
        int right = i * 2 + 2; // правый ребенок
        int largest = i; // родитель

        if (left < size && array[left] > array[largest]) {
            largest = left;
        }
        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        // Если кто то оказался больше, то меняем местами
        if (i != largest) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // largest уже кто то из детей, у которых тоже могут быть свои дети
            heapify(array, largest, i);
        }
    }
}