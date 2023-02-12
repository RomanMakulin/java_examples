

public class ex2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int c = 2;
        int d = 1;
        int command1 = a * c;
        int command2 = a + d;
        int temp = a;
        int count = 0;
        while (temp <= b){
            temp *= c;
            count++;
        }
        System.out.println(count);

    }
}
