import java.util.ArrayList;

// +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b 
// или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 

public class ex3 {

    public static void main(String[] args) {

        String str = "";
        System.out.println(AAAAA(2, 11, 2, 1, str));
        

    }

    // private static int command(int x, int y) {

    //     // if (x == y)
    //     // return 1;
    //     // if (x > y)
    //     // return 0;
    //     // else return command(x + 1, y) + command(x * 2, y);

    // }

    private static ArrayList<String> AAAAA(int a, int b, int c, int d, String e) {
        ArrayList<String> arr = new ArrayList<>();
        if (a == b) {
            arr.add(e);
        }
        if (a < b) {
            arr.addAll(AAAAA(a + c, b, c, d, e + "1"));
            arr.addAll(AAAAA(a * d, b, c, d, e + "2"));
        }
        return arr;
    }

}