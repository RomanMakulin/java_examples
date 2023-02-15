
// Поиск простых чисел в промежутке от 2 до 100

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Simple elements: ");
        searchSimpleEls();
    }

    private static void searchSimpleEls() {
        int start = 2;
        int end = 10;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

}
