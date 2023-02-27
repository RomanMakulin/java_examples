package Lesson_04;
import java.util.*;

public class Ex006 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(24);
        pq.add(124);
        pq.add(64);
        pq.add(2);
        
        System.out.println(pq);

        var str = "20 + 30".split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
