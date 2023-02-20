import java.util.Arrays;

public class Labirint {
    public static void main(String[] args) {
        int rows = 15;
        int columns = 15;
        String[][] array = new String[rows][columns];
        FillArray(array, rows, columns);

    }

    private static void FillArray(String[][] array, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (j == columns - 1 || i == 0 || i == columns - 1 || j == 0) {
                    array[i][j] = "#";
                } else {
                    array[i][j] = "_";
                }
            }
        }

        array[4][3] = "/";
        array[4][4] = "/";
        array[4][5] = "/";
        array[7][4] = "1";
        array[7][5] = "/";
        array[8][5] = "/";
        array[9][5] = "/";
        array[5][5] = "/";
        array[6][5] = "/";
        array[10][2] = "/";
        array[10][3] = "/";
        array[10][4] = "/";
        array[10][5] = "/";

        // строим стены
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }


    }
}
