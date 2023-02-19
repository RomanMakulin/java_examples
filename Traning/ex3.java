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

        command(2, 11, 2, 1, "");

    }

    private static void command(int currentNum, int resultNum, int c, int d, String path) {

        if (currentNum > resultNum)
            return;
        if (currentNum == resultNum) {
            System.out.println(path);
            return;
        }
        command(currentNum * c, resultNum, c, d, path + "K1");
        command(currentNum + d, resultNum, c, d, path + "K2");

    }

}