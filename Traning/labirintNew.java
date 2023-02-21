import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class labirintNew {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        int[][] array = new int[rows][columns];
        FillArray(array, rows, columns);

    }

    private static void FillArray(int[][] array, int rows, int columns) {

        // список ll
        ArrayList<Point2D> ll = new ArrayList<>();
        Point2D a = new Point2D(1, 3);
        ll.add(a);

        // очередь qw
        Queue<Point2D> qw = new LinkedList<>();
        Point2D b = new Point2D(2, 4);
        qw.add(b);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
            }
        }

        // инизиализируем стартовое значение
        array[ll.get(0).x][ll.get(0).y] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }
        // x = 1; y = 3
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[ll.get(0).x][ll.get(0).y] == 1) {
                    // upper
                    if (array[ll.get(0).x - 1][ll.get(0).y] == 0) {
                        array[ll.get(0).x - 1][ll.get(0).y] += 1;
                    }
                    // right
                    if (array[ll.get(0).x][ll.get(0).y + 1] == 0) {
                        array[ll.get(0).x][ll.get(0).y + 1] += 1;
                    }
                    // undo
                    if (array[ll.get(0).x + 1][ll.get(0).y] == 0) {
                        array[ll.get(0).x + 1][ll.get(0).y] += 1;
                    }
                    // left
                    if (array[ll.get(0).x][ll.get(0).y - 1] == 0) {
                        array[ll.get(0).x][ll.get(0).y - 1] += 1;
                    }
                }
            }

        }
        System.out.println();
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
