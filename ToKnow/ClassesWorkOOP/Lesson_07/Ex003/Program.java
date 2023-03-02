package Lesson_07.Ex003;

public class Program {

    public static void main(String[] args) {
        
        Point2D a = new Point2D(10, 10);
        Point2D b = new Point2D(5, 2);
        a.setX(2); a.setY(2);


        System.out.println(a);
        System.out.println(Point2D.distance(a, b));
    }
}
