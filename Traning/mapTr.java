import java.util.*;

public class mapTr {
    public static void main(String[] args) {

        // linked list
        Queue<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(3);
        int result = 0;

        while (ll.size() > 0){
            result += ll.element();
            ll.remove();
            System.out.println(result);
        }

        // String names1 = "";
        // for (int i = 0; i < ll.size(); i++) {
        //     names1 += ll.get(i) + " ";
        // }
        // System.out.println(names1);
        // System.out.println(ll);

        // System.out.println();

        // map
        // HashMap<Integer, String> mp = new HashMap<>();
        // mp.putIfAbsent(1, "Roman");
        // mp.putIfAbsent(2, "Ann");
        // mp.putIfAbsent(3, "Olga");
        // mp.putIfAbsent(4, "Mila");

        // String names = "";
        // for (int i = 1; i <= mp.size(); i++) {
        //     names += mp.get(i) + " ";
        // }
        // System.out.println(mp);
        // System.out.println(names);

        // // поиск по ключу
        // int key = 2;
        // for (int i = 1; i < mp.size(); i++) {
        //     if (i == key) System.out.println(mp.get(i));
        // }

        // // итеративный подход
        // for (var item : mp.entrySet()) {
        //     System.out.println(item);
        // }
        
        // // tree map
        // TreeMap<Integer,String> tMap = new TreeMap<>();
        // tMap.putIfAbsent(1, "first");
        // tMap.putIfAbsent(2, "second");
        // tMap.putIfAbsent(15, "third");
        // tMap.putIfAbsent(3, "third");
        // System.out.println();
        // System.out.println(tMap.tailMap(1));

    }
}
