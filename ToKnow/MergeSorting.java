// Сортировка слиянием

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {

        int[] array = { 2, 5, 1, 6, 8, 3, 2, 9, 19 };
        sortingMerge(array);
        System.out.println(Arrays.toString(array));

    }

    // метод слияния и сортироки двух массивов в один
    private static void megrge(int[] array1, int[] array2, int[] targetArray) {

        int array1MinIndex = 0;
        int array2MinIndex = 0;
        int targetArrayMinIndex = 0;

        while (array1MinIndex < array1.length && array2MinIndex < array2.length) {

            // выбираем наименьший эл из двух массивов и добавляем в результирующий
            if (array1[array1MinIndex] <= array2[array2MinIndex]) {
                targetArray[targetArrayMinIndex] = array1[array1MinIndex];
                array1MinIndex++;
            } else {
                targetArray[targetArrayMinIndex] = array2[array2MinIndex];
                array2MinIndex++;
            }

            targetArrayMinIndex++;
        }

        // если массив больше другого, то добавляем потерянные элементы
        while (array1MinIndex < array1.length) {
            targetArray[targetArrayMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            targetArrayMinIndex++;
        }
        while (array2MinIndex < array2.length) {
            targetArray[targetArrayMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            targetArrayMinIndex++;
        }

    }

    private static void sortingMerge(int[] array) {

        if (array.length <= 1)
            return; // выход из рекурсии когда делить нечего

        int mid = array.length / 2; // определение середины для разиения массива
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // заполнение левого массива (первого)
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        // заполнение правого массива (второго)
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        // рекурсия чтобы зациклить деление массивов
        sortingMerge(left);
        sortingMerge(right);
        megrge(left, right, array);

    }

}
