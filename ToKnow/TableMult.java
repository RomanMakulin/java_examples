// таблица умножения

public class TableMult {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }

    }
}
