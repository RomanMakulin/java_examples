public class Labirint {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] array = new int[rows][columns];
        FillArray(array, rows, columns);

    }

    private static void FillArray(int[][] array, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (j == columns - 1 || i == 0 || i == columns - 1 || j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        array[4][3] = -1;

        // строим стены
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }

    }
}
