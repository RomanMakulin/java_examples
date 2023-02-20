import java.util.ArrayList;

public class labirintNew {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        int[][] array = new int[rows][columns];
        FillArray(array, rows, columns);

    }

    private static void FillArray(int[][] array, int rows, int columns) {

        ArrayList<Point2D> ll = new ArrayList<>();

        Point2D a = new Point2D(1, 3);
        Point2D b = new Point2D(0, 3);

        ll.add(a);
        ll.add(b);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
            }
        }

        array[ll.get(0).x][ll.get(0).y] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }
    }

}

class Point2D {
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
