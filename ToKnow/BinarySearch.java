// Бинарный поиск элемента массива

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = { 2, 4, 1, 6, 2, 10 };
        System.out.printf("Позиция искомого элемента: %d", binarSearch(array, 10));

    }

    private static int binarSearch(int[] array, int key) {
        int firstIndex = 0;
        int lastIndex = array.length;

        while (firstIndex < lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == key)
                return middleIndex;
            else if (key < array[middleIndex])
                lastIndex = middleIndex - 1;
            else if (key > array[middleIndex])
                firstIndex = middleIndex + 1;
        }
        return -1;
    }
}
