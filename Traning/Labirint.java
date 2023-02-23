import java.util.LinkedList;
import java.util.Queue;

/**
 * Labirint
 */
public class Labirint {

    public static void main(String[] args) {
        int rows = 8;
        int columns = 8;
        int[][] array = new int[rows][columns];

        // печатаем массив изначальный
        

        int x = 4;
        int y = 4;
        Queue<Point2D> qu = new LinkedList<>();
        Point2D a = new Point2D(x, y);
        qu.add(a);

        while (array.length > 0) {

            // curr
            if (array[qu.peek().x][qu.peek().y] == 0) {
                array[a.x][a.y] += 1;
            }

            // up
            if (array[qu.peek().x-1][qu.peek().y] == 0) {
                a = new Point2D(x-1, y);
                qu.add(a);
                qu.remove();
                array[a.x][a.y] += 1;
            }

            // right
            if (array[qu.peek().x][qu.peek().y+1] == 0) {
                array[a.x][a.y+1] += 1;
            }

            // down
            if (array[qu.peek().x+1][qu.peek().y] == 0) {
                array[a.x+1][a.y] += 1;
            }

            // left
            if (array[qu.peek().x][qu.peek().y-1] == 0) {
                array[a.x][a.y-1] += 1;
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
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
